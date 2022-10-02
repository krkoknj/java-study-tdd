package myclass;

import junit.framework.TestCase;

public class StudentTest extends TestCase {
  public void testCreate() {
    final String firstStudentName = "Jane Doe";
    /**
     * 자바 가상 머신이 이 명령문 실행시 할당 연산자(=)의 오른쪽 부분의 코드르 먼저 수행하여
     * Student 객체를 메모리 내에 생성한다.
     * 가상머신은 새로운 Student 객체를 할당한 실제 메모리 주소를 가지고 있다가 명령문
     * 왼쪽의 레퍼런스에 그 주소를 할당한다.
     */
    Student student = new Student(firstStudentName);
    assertEquals(firstStudentName, student.getName());

    final String secondStudentName = "Joe Blow";

    Student secondStudent = new Student(secondStudentName);
    assertEquals(secondStudentName, secondStudent.getName());

    assertEquals(firstStudentName, student.getName());
  }
}