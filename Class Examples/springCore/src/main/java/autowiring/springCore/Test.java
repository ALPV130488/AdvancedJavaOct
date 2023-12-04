package autowiring.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("autowiring.springCore")
public class Test {
	public static void main(String[] args) {
		
		ApplicationContext factory = new AnnotationConfigApplicationContext(Test.class);
		
		Employee emp1 =(Employee) factory.getBean("emp");
		
		System.out.println(emp1);
		
		
	}

}
