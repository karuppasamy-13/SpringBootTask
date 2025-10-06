package com.SpringLearning.SpringBootLearning.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee/")
public class GetEmployeeController {
    @GetMapping("allEmployees")
    public String getAllEmployees() {
        return "All Employee Data will be displayed soon...";
    }

    // 2️⃣ Get employee by numeric ID (only digits allowed)
    @GetMapping("emp/{id:[0-9]+}")
    public String getEmployeeById(@PathVariable long id) {
        return "Employee ID is: " + id;
    }

    // 3️⃣ Get employee by name (only letters allowed)
    @GetMapping("emp/{name:[a-zA-Z]+}")
    public String getEmployeeByName(@PathVariable String name) {
        return "Employee Name is: " + name;
    }

    // 4️⃣ Get employee by both ID and name
    @GetMapping("emp/{id}/{name}")
    public String getEmployeeByIdAndName(
            @PathVariable String id,
            @PathVariable String name) {
        return "Employee ID = " + id + " and Name = " + name;
    }

    // 5️⃣ Search employee using query parameters
    // Example: /api/employee/search?id=100&pname=John
    @GetMapping("search")
    public String searchEmployeeWithQueryParam(
            @RequestParam("id") long employeeId,
            @RequestParam("pname") String employeeName) {

        return "Query Param Employee ID = " + employeeId +
                ", Query Param Employee Name = " + employeeName;
    }
}
