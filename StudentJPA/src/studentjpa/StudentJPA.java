/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentjpa;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Student;

/**
 *
 * @author USER
 */
public class StudentJPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Student std1 = new Student(1, "Eini", 3.25);
       StudentTable.insertStudent(std1);
       Student std2 = new Student(2, "Einun", 3.89);
       StudentTable.insertStudent(std2);
       Student std3 = new Student(3, "Einoon", 3.56);
       StudentTable.insertStudent(std3);
       List<Student> stdList = StudentTable.findAllStudent();
       printAllStudent(stdList);
       
       StudentTable.removeStudent(std1);
       StudentTable.removeStudent(std2);
       StudentTable.removeStudent(std3);
    }
    public static void printAllStudent(List<Student> studentList) {
        for(Student std : studentList) {
           System.out.print(std.getId() + " ");
           System.out.print(std.getName() + " ");
           System.out.println(std.getGpa() + " ");
       }
    }
//    public static void persist(Object object) {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("StudentJPAPU");
//        EntityManager em = emf.createEntityManager();
//        em.getTransaction().begin();
//        try {
//            em.persist(object);
//            em.getTransaction().commit();
//        } catch (Exception e) {
//            e.printStackTrace();
//            em.getTransaction().rollback();
//        } finally {
//            em.close();
//        }
//    }
}
