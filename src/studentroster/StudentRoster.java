/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentroster;

/**
 *
 * @author Renee
 */
//Step 1: Define the object in the studentroster class
public class StudentRoster {

    public static void main(String args[]) {
        //Define the attributes of a studentroster
    }
    private int studentId;
    private String firstName;
    private String lastName;
    private int busNumber;
    private int seatNumber;
    private int seat_number;

//Constructor of a new studentroster; setting the attributes)
    public StudentRoster(String firstName, String lastName, int studentId, int busNumber, int seatNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.busNumber = busNumber;
        this.seatNumber = seatNumber;
    }
//Declare the getter for the attributes
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getstudentId() {
        return studentId;
    }

    public int getBusNumber() {
        return busNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }
//Declare the setters to change the attributes of the studentroster. 
    public void setFirstName(String first_name) {
        this.firstName = first_name;
    }

    public void setLastName(String last_name) {
        this.lastName = last_name;
    }

    public void setStudentId(int student_id) {
        this.studentId = student_id;
    }

    public void setBusNumber(int bus_number) {
        this.busNumber = bus_number;
    }

    public void setseatNumber(int seat_number) {
}

//Step: 2 Create the StudentInfo table for the database.

create table StudentRoster ( 
        first_name VARCHAR(20) default NULL,
        last_name  VARCHAR(20) default NULL
        student_id INT NOT NULL auto_increment,
        bus_number INT  default NULL,
        seat_number INT default NULL,
        PRIMARY KEY (id)
);  


//Step 3: Map the class to the database tables.
 <?xml version = "1.0" encoding = "utf-8"?>
<!DOCTYPE hibernate-mapping PUBLIC 
"-//Hibernate/Hibernate Mapping DTD//EN"
"http://www.hibernate.org/dtd/hibernate-mapping-3.0.dtd"> 

<hibernate-mapping>
    <class name 

= "StudentRoster" table "STUDENTROSTER">

        <meta attribute = "class-description">
           This class contains 

the student detail. 
        </meta>
      
        <id name = "id" type = "int" column = "id">
         <generator class

="native"/>
        </id>
      
           <property name = "studentId" column = "student_id" type = "int"/> 
        <property name = "firstName" column = "first_name" type = "string"/>
      <property name = "lastName" column = "last_name" type = "string"/>

      <property name = "busNumber" column = "bus_number" type = "int"/>
      <property name = "seatNumber" column = "seat_number" type = "int"/>
   </class
>

</hibernate-mapping>
}


//Step 4: Declare application Class and main method//
import java.util.List; 
import java.util.Date;
import java.util.Iterator; 
 
import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;


import org.hibernate.cfg.Configuration;

/**
 *
 * @author Renee
 */
public class StudentRoster {

    private static SessionFactory factory;

    public static void StudentRoster(String[] args) {

        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }

        ManageStudentRoster ME = new ManageStudentRoster();

        /* Add new student records in database */
        Integer studID1 = ME.addStudent("Brown", "Kirk", 1245);
        Integer studID2 = ME.addStudent("Wilson", "Edward", 1264);
        Integer studID3 = ME.addStudent("Darr", "Paul", 1280);
        Integer studID4 = ME.addStudent("Mitchell", "Renee", 1272);
        Integer studID5 = ME.addStudent("Darr", "Paul", 1231);
        Integer studID6 = ME.addStudent("Green", "DeShawn", 1280);
       
        /* List down all the employees */
        ME.listStudents();

        /* Update student's records */
        ME.updateStudent(empID1, 7500);

        /* Delete an student from the database */
        ME.deleteStudent(empID6);

        /* List down new list of the students */
        ME.listStudents();
    }

    /* Method to CREATE a Student in the database */
    public Integer addStudent(String firstname, String lastname, int studentid, int busnumber) {
        //Session session = factory.openSession();
        Transaction tx = null;
        Integer studentID = null;

        try {
            tx = session.beginTransaction();
            Student student = new Student(firstname, lastname, studentid, busnumber);
            studentID = (Integer) session.save(student);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return studentID;
    }

    /* Method to  READ all the students */
    public void listStudent() {
        //Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            List students = session.createQuery("FROM Student").list();
            for (Iterator iterator = students.iterator(); iterator.hasNext();) {
                Student student = (Student) iterator.next();
                System.out.println("First Name: " + student.getFirstName());
                System.out.prinlnt("Last Name: " + student.getLastName());
                System.out.println("Student Id: " + student.getStudentId());
                System.out.println("Bus Number: " + student.getLastName());        
            }
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    /* Method to UPDATE salary for an employee */

    /**
     *
     * @param StudentID
     * @param busNumber
     * @param seatNumber
     */

    public void updateStudent(Integer StudentID, String "firtstName", String "lastName", int busNumber, int seatNumber) {
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            Student student = (Student) session.get(Student.class, StudentID);
            student.setSalary(salary);
            session.update(student);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    /* Method to DELETE an studnet from the records */
    public void deleteStudent(Integer StudentID) {
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            Student student = (Student) session.get(Student.class, StudentID);
            session.delete(Student);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
