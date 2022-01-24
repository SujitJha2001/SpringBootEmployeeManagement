package net.javaguides.springbootbackendEmployeeManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.springbootbackendEmployeeManagement.model.Employee;
import net.javaguides.springbootbackendEmployeeManagement.repository.EmployeeRepository;

@SpringBootApplication
public class SpringbootBackendEmployeeManagementApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendEmployeeManagementApplication.class, args);
	}
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
	}

}
