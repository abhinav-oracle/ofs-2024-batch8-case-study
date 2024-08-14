import fs from 'fs';
import readline from 'readline-sync';
import { Employee } from './employee.js';


let id = readline.questionInt("Enter id: ");
let name = readline.question("Enter name: ");
let salary = readline.questionInt("Enter salary: ");
let employee = new Employee(id, name, salary);

let employeeList = [];

if (fs.existsSync('employees.json')) {
    let existingData = fs.readFileSync('employees.json');
    employeeList = JSON.parse(existingData);
  }
  
  employeeList.push(employee);
  
  fs.writeFileSync('employees.json', JSON.stringify(employeeList));


  console.log("Employee Details:");
  employeeList.forEach(employee => {
    console.log(`ID: ${employee.id}, Name: ${employee.name}, Salary: ${employee.salary}`)});