package com.SpringLearning.SpringBootLearning.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee/")
public class GetEmployeeController {
    @GetMapping("allEmployees")
    public String getAllEmployees() {
        return "All Employee Data will be displayed soon...";
    }
    @GetMapping("emp/{id:[0-9]+}")
    public String getEmployeeById(@PathVariable long id) {
        return "Employee ID is: " + id;
    }
    @GetMapping("emp/{name:[a-zA-Z]+}")
    public String getEmployeeByName(@PathVariable String name) {
        return "Employee Name is: " + name;
    }
    @GetMapping("emp/{id}/{name}")
    public String getEmployeeByIdAndName(
            @PathVariable String id,
            @PathVariable String name) {
        return "Employee ID = " + id + " and Name = " + name;
    }
    @GetMapping("search")
    public String searchEmployeeWithQueryParam(
            @RequestParam("id") long employeeId,
            @RequestParam("pname") String employeeName) {

        return "Query Param Employee ID = " + employeeId +
                ", Query Param Employee Name = " + employeeName;
    }
}
