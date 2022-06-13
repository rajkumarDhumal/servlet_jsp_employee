package EMPLOYEE_Servlet_JSP_prc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import EMPLOYEE_Servlet_JSP_prc.dto.Employee;

public class Employee_dao {
	public EntityManager getEntityManager() {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("raj");
		return factory.createEntityManager();
	}
	public void insertEmployee(Employee employee) {
		EntityManager manager = getEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.persist(employee);
		transaction.commit();
	}
	public void updateEmployee(Employee employee) {
		EntityManager manager=getEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.merge(employee);
		transaction.commit();
	}
	public Employee getEmployeeById(int id) {
		EntityManager manager=getEntityManager();
		return manager.find(Employee.class, id);
	}
	public List<Employee> getAllEmployee(){
		EntityManager manager=getEntityManager();
		Query query=manager.createQuery("Select e from Employee e");
		List<Employee> employees=query.getResultList();
		return employees;
	}
}
