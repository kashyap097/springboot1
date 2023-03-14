package com.example.demomicroservice.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demomicroservice.bean.Employee;
import com.example.demomicroservice.service.EmployeeRepository;

@RestController

public class EmployeeController {

	@Autowired
    private EmployeeRepository employeeService;

    @GetMapping("/{id}")
    public String getEmployee(@PathVariable int id) {
    	System.out.println("getEmployee");
        Optional<Employee> employee = employeeService.findById(id);
       // return ResponseEntity.ok(employee);
        return employee.toString();
    }
    
    @GetMapping("/all")
    public String getEmployee() {
    	System.out.println("getAll");
        List<Employee> employee = employeeService.findAll();
       // return ResponseEntity.ok(employee);
        return employee.toString();
    }

    @PostMapping("/save/")
    public Employee createEmployee(@ModelAttribute Employee employeeinfo) {
    	System.out.println("ResponseEntity chala");
    	System.out.println("name"+employeeinfo.getName());
    	System.out.println("name"+employeeinfo.getDepartment());
    	//employee.setId(1L);
    	Employee employee = new Employee();
    	employee.setName(employeeinfo.getName());
    	employee.setDepartment(employeeinfo.getDepartment());
    	//Employee savedEmployee = employeeService.save(employee);
       return employeeService.save(employee);
    }
}
