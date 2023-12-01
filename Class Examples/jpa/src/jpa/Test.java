package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("apple");
	
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Employee emp = new Employee(120,"Angular",1234,"hyd");//object creation--->new
		
//		em.persist(emp);//insert 			//managed state
		
//		em.merge(emp); //update
//	
//		Employee emp1 =(Employee)em.find(Employee.class,123);//select
//		
//		em.remove(emp1);//delete
		
	
//		System.out.println(emp1);
		
		em.getTransaction().commit();			//flush into db
		
		em.close();								//managed state will be removed
		
//		System.out.println(emp);
	
	
	}

}
