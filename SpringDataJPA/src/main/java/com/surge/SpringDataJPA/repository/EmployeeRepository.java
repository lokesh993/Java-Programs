package com.surge.SpringDataJPA.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.surge.SpringDataJPA.model.Employee;



public interface EmployeeRepository extends JpaRepository<Employee
			, Long> {

}
