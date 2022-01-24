package net.javaguides.springbootbackendEmployeeManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springbootbackendEmployeeManagement.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
