package demo.Services;

import demo.Model.Employee;
import demo.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public void testEmployee(){

        Employee employee1 = new Employee();
        employee1.setName("Mariano");
        employee1.setSalary(15000.00);
        employee1.setIdCard("123456789");
        employeeRepository.save(employee1);


        System.out.println(employeeRepository.findBySalaryGreaterThan(20000.00));
    }
}
