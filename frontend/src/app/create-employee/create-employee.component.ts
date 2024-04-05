import { Component } from '@angular/core';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';
import { Route, Router } from '@angular/router';

@Component({
  selector: 'app-create-employee',
  templateUrl: './create-employee.component.html',
  styleUrls: ['./create-employee.component.scss']
})
export class CreateEmployeeComponent {


  employees: any[] = [];

  employee:Employee=new Employee();

  constructor(private employeeService:EmployeeService,
    private router:Router){}



    onSubmit(){
      console.log(this.employee);
      this.saveEmployee();
    }
    
  saveEmployee(){
    this.employeeService.createEmployee(this.employee).subscribe(
      (data:any)=>{
      console.log(data);
      this.goToEmployeeList();
    },
   (error: any) => {
    console.log(error);
  }
);

  }

  goToEmployeeList(){
    this.router.navigate(['/employees'])
  }

  
  ngOninit(): void { 
  }


}
