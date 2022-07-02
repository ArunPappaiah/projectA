package com.chainsys.springproject.beans;
// Multiple factory methods in one class
// Calendar factory is also called as initiating bean.Beacuse, methods in this beans instantiates objects for the bean
public class CalendarFactory {
	// The factory method is not static here
	public Calendar createCalendar() {
		// The Calendar constructor is default access modifier . So, we can be called here.
		// The Calendar class and the Calendar factory class are both in the same package.
		return new Calendar();
	}
	public Appointments createAppointment() {
		return new Appointments();
	}
}
