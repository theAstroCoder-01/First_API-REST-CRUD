package Service;

import Entity.Employee;
import Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public String getEmployee() {
        return employeeRepository.getEmployee();
    }
}
