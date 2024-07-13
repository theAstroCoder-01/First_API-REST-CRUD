package Controller;

import Entity.Employee;
import Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

// @Controller
// The controller class allows us to write our actual api's.
// The API Request will first land in this Controller.
@RestController
// @RestController is the combination of @Controller + @ResponseBody
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    // @RequestMapping(path = "/getEmployee", method = RequestMethod.GET)
    // @RequestMapping will have a path to which we can map our incoming API.

    // @ResponseBody
    // @ResponseBody: It will return the String from below to a particular JSON or another format.
    // It indicates that the response of this API should be a body.
    // It is written when we have @Controller.
    @GetMapping("/getEmployee")
    public String getEmployee() {
        return "added";
    }

    @GetMapping("/getEmployeeById")
    public String getEmployeeId(@RequestParam(name = "id") Integer employeeId) {
        return "added";
    }

    @GetMapping("/getEmployeeByPathId/{id}")
    public String getEmployeeByPathId(@PathVariable(name = "id") Integer employeeId) {
        return "added";
    }

    @PostMapping(path = "/addEmployee")
    public String addEmployee(@RequestBody Employee employee) {
        return "added";
    }

    @RequestMapping(path = "/updateEmployee")
    public String updateEmployee(Employee employee) {
        return "updated";
    }

    @RequestMapping(path = "/deleteEmployee")
    public String deleteEmployee(Employee employee) {
        return "delete";
    }


}
