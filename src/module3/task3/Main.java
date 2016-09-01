package module3.task3;

import java.util.Date;

/**
 * You need to create following structure of the classes.
 * Class Course with fields: Date startDate, String name, int hoursDuration, String teacherName. Create two constructors
 * with fields startDate, name; and hourseDuration, name, teacherName.
 * Class Student with fields: String firstName, String lastName, int group, Course[] coursesTaken, int age.
 * With 2 constructors firstName, lastName, group; and lastName, coursesTaken.
 * CollegeStudent that is a child of Student. With additional fields: String collegeName, int rating, long id.
 * Create three constructors: two the same as in Student and one with all the fields of the class.
 * Class SpecialStudent that is child of CollegeStudent. With additional fields long secretKey, String email.
 * Create three constructors: two the same as in CollegeStudend and one with secretKey field.
 * Create getters and setters for all fields and make fields private as OOP principle follows.
 *
 * Create 5 objects course class. Create objects of others classes using every constructor. You must have 13 objects
 * in Solution class.
 */
public class Main {
    public static void main(String[] args) {
        Course course1 = new Course(11, "Course 1", "Teacher 1");
        Course course2 = new Course(12, "Course 2", "Teacher 2");
        Course course3 = new Course(13, "Course 3", "Teacher 3");
        Course course4 = new Course(14, "Course 4", "Teacher 4");

        Date date = new Date();
        Course course5 = new Course(date, "Course 5");

        Student student1 = new Student("Steave","Jobs",1);

        Course[] courses=new Course[2];
        courses[0] = course1;
        courses[1] = course2;

        Student student2 = new Student("Bob", courses);

        CollegeStudent collegeStudent1 = new CollegeStudent("Ivanov","Ivan",1);
        CollegeStudent collegeStudent2 = new CollegeStudent("Petrov",courses);
        CollegeStudent collegeStudent3 = new CollegeStudent("Sidorov","Sidor",1,"College",1,0001);

        SpecialStudent specialStudent1 = new SpecialStudent("Special1","Special1",2);
        SpecialStudent specialStudent2 = new SpecialStudent("Special2",courses);
        SpecialStudent specialStudent3 = new SpecialStudent("Special3","Special3",2,1234);

    }
}
