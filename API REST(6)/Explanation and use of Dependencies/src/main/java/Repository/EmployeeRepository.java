package Repository;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {

    public String getEmployee(){
        return "employee";

    }
}
