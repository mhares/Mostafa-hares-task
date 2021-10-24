package Task.elnady.engineering.dao;

import Task.elnady.engineering.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
