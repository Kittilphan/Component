/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package departmentdb;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Department;
import model.Employee;

/**
 *
 * @author USER
 */
public class DepartmentDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Department it = new Department();
        Department hr = new Department();
        it.setName("IT");
        hr.setName("HR");
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        Employee emp4 = new Employee();

        emp1.setEmployeeid(1);
        emp1.setName("John");
        emp1.setJob("Network Admin");
        emp1.setSalary(56789.0);
        emp1.setDepartmentid(it);
        
        emp2.setEmployeeid(2);
        emp2.setName("Marry");
        emp2.setJob("HR Manager");
        emp2.setSalary(46789.0);
        emp2.setDepartmentid(hr);
        
        emp3.setEmployeeid(3);
        emp3.setName("Henry");
        emp3.setJob("Programmer");
        emp3.setSalary(67890.0);
        emp3.setDepartmentid(it);
        
        emp4.setEmployeeid(4);
        emp4.setName("Clark");
        emp4.setJob("HR recruiter");
        emp4.setSalary(36789.0);
        emp4.setDepartmentid(hr);
        
        persist(it);
        persist(hr);
        persist(emp1);
        persist(emp2);
        persist(emp3);
        persist(emp4);
    }

    public static void persist(Object object) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DepartmentDBPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
}
