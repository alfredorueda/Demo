package demo.Repository;

import demo.Model.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {
    public List<Employee> findBySalaryGreaterThan(Double salary);
}
