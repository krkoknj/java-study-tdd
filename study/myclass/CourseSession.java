package myclass;

import java.util.*;

public class CourseSession {
    private String department;
    private String number;

    private Date startDate;

    private ArrayList<Student> students = new ArrayList<>();
    public CourseSession(String department, String number, Date startDate) {
        this.department = department;
        this.number = number;
        this.startDate = startDate;
    }

    public String getDepartment() {
        return department;
    }

    public String getNumber() {
        return number;
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public void enroll(Student student) {
        students.add(student);
    }

    Student get(int index) {
        return students.get(index);
    }

    Date getEndDate() {
        final int sessionLength = 16;
        final int daysInWeek = 7;
        final int daysFromFridayToMonday = 3;
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(startDate);
        // week * days per week - 3 days 이런 주석 대신 위의 상수 같이 정의 하는 편이 이해하기 쉽다.
        int numberOfDays = sessionLength * daysInWeek - daysFromFridayToMonday; // week * days per week - 3 days
        calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
        return calendar.getTime();
    }

    Date getStartDate() {
        return startDate;
    }

}
