package com.ant.geneticalgorithm.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.ant.geneticalgorithm.domain.*;

public class DataProvider {

	private List<Room> rooms;
	private List<Teacher> teachers;
	private List<Subject> subjects;
	private List<Department> departments;
	private List<TimeSlot> timeslots;
	private int numberOfClasses = 0;

	public DataProvider() {
		super();
		initialize();
	}

	private DataProvider initialize() {

		Room r1 = new Room("R1", 100);
		Room r2 = new Room("R2", 75);
		Room r3 = new Room("R3", 80);
		rooms = new ArrayList<Room>(Arrays.asList(r1, r2, r3));

		// TimeSlot ts1 = new TimeSlot("TS1", "M 9:00 - 10:00");
		// TimeSlot ts2 = new TimeSlot("TS2", "M 10:00 - 11:00");
		// TimeSlot ts3 = new TimeSlot("TS3", "M 11:00 - 12:00");
		// TimeSlot ts4 = new TimeSlot("TS4", "M 12:00 - 1:00");
		// TimeSlot ts5 = new TimeSlot("TS4", "M 1:00 - 2:00");
		// TimeSlot ts6 = new TimeSlot("TS4", "M 2:00 - 3:00");
		// TimeSlot ts7 = new TimeSlot("TS4", "M 3:00 - 4:00");

		TimeSlot ts1 = new TimeSlot("TS1", "M 9:00 - 10:00");
		TimeSlot ts2 = new TimeSlot("TS2", "M 10:00 - 11:00");
		TimeSlot ts3 = new TimeSlot("TS3", "M 11:00 - 12:00");
		TimeSlot ts4 = new TimeSlot("TS4", "M 12:00 - 1:00");
		TimeSlot ts5 = new TimeSlot("TS4", "M 1:00 - 2:00");
		TimeSlot ts6 = new TimeSlot("TS4", "M 2:00 - 3:00");
		TimeSlot ts7 = new TimeSlot("TS4", "M 3:00 - 4:00");

		timeslots = new ArrayList<>(Arrays.asList(ts1, ts2, ts3, ts4, ts5, ts6, ts7));

		Teacher t1 = new Teacher("T1", "Sandeep");
		Teacher t2 = new Teacher("T2", "Hitesh");
		Teacher t3 = new Teacher("T3", "Sonali");
		Teacher t4 = new Teacher("T4", "Ved prakash");
		teachers = new ArrayList<Teacher>(Arrays.asList(t1, t2, t3, t4));

		Subject s1 = new Subject("S1", "OOPS", 75, new ArrayList<Teacher>(Arrays.asList(t1, t2)));
		Subject s2 = new Subject("S2", "SEPM", 25, new ArrayList<Teacher>(Arrays.asList(t1, t2, t3)));
		Subject s3 = new Subject("S3", "Agile", 100, new ArrayList<Teacher>(Arrays.asList(t1, t2)));
		Subject s4 = new Subject("S4", "DevOPs", 65, new ArrayList<Teacher>(Arrays.asList(t3, t4)));
		Subject s5 = new Subject("S5", "CN", 90, new ArrayList<Teacher>(Arrays.asList(t4)));
		Subject s6 = new Subject("S6", "JAVA", 70, new ArrayList<Teacher>(Arrays.asList(t1, t3)));
		Subject s7 = new Subject("S7", "Docker", 80, new ArrayList<Teacher>(Arrays.asList(t2, t4)));
		subjects = new ArrayList<Subject>(Arrays.asList(s1, s2, s3, s4, s5, s6, s7));

		Department d1 = new Department("Cybernetics", new ArrayList<Subject>(Arrays.asList(s1, s3)));
		Department d2 = new Department("Systemics", new ArrayList<Subject>(Arrays.asList(s2, s4, s5)));
		Department d3 = new Department("Informatics", new ArrayList<Subject>(Arrays.asList(s6, s7)));
		departments = new ArrayList<Department>(Arrays.asList(d1, d2, d3));
		departments.forEach(x -> numberOfClasses += x.getSubjects().size());

		return this;
	}

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	public List<TimeSlot> getTimeslots() {
		return timeslots;
	}

	public void setTimeslots(List<TimeSlot> timeslots) {
		this.timeslots = timeslots;
	}

	public int getNumberOfClasses() {
		return numberOfClasses;
	}

	public void setNumberOfClasses(int numberOfClasses) {
		this.numberOfClasses = numberOfClasses;
	}

}
