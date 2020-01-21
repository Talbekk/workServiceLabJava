package com.codeclan.example.workservice;

import com.codeclan.example.workservice.models.Department;
import com.codeclan.example.workservice.models.Employee;
import com.codeclan.example.workservice.models.Project;
import com.codeclan.example.workservice.repositories.DepartmentRepository;
import com.codeclan.example.workservice.repositories.EmployeeRepository;
import com.codeclan.example.workservice.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WorkserviceApplicationTests {

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateDeprtment(){
		Department department = new Department("World of Cheese");
		departmentRepository.save(department);
	}

	@Test
	public void canCreateEmployee(){
		Department department = new Department("World of Cheese");
		departmentRepository.save(department);

		Employee employee = new Employee("John", "Stuart", 1234, department);
		employeeRepository.save(employee);
	}

	@Test
	public void canCreateProject(){
		Project project = new Project("Making cheese", 12);
		projectRepository.save(project);
	}

}
