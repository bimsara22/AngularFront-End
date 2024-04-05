package com.example.employeeBackend.Controller;
import com.example.employeeBackend.JPA.EmployeeRepository;
import com.example.employeeBackend.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@RequestMapping("/api/v1")
public class EmployeeController {


    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }  //this is working well.before we corrected



    //create Employee 

//@SuppressWarnings("null")
@PostMapping("/employees")
@CrossOrigin(origins = "http://localhost:4200")
    public Employee createEmployee(@RequestBody Employee employee){
            return employeeRepository.save(employee);
        } 
       
    }



