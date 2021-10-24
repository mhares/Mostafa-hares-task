package Task.elnady.engineering.controller;

import Task.elnady.engineering.dao.EmployeeRepository;
import Task.elnady.engineering.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepository employeeRepository;

	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}

	@GetMapping("/employees/{id}")
	public Optional<Employee> getEmployee(@PathVariable int id){
		return employeeRepository.findById(id);
	}

	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee emp){
		 employeeRepository.save(emp);
		 return emp;
	}

	@DeleteMapping("/employees/{id}")
	public void DeleteEmployee(@PathVariable int id){
		employeeRepository.deleteById(id);
	}

	@PutMapping("/employees/{id}")
	public Employee updateEmployee(@RequestBody Employee newEmployee,@PathVariable int id){
		return employeeRepository.findById(id)
				.map(employee -> {
					employee.setName(newEmployee.getName());
					employee.setEmail(newEmployee.getEmail());
					return employeeRepository.save(employee);
				})
				.orElseGet(() -> {
					newEmployee.setId(id);
					return employeeRepository.save(newEmployee);
				});
	}
}
