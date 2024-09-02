//constructor function
class Employee {
    constructor(fName,lName,empId,sal) {
   this.firstName = fName;
   this.lastName = lname;
   this.empId = eId;
   this.salary = sal;
   this.department = "IT";
   this.fullName = function() {
    return "Mr. " + this.firstName + " " + this.lastName;
   }
 }
}

const emp1 = Employee("Rohit","Sharma","E001",76000);
const emp2 = Employee("Virat","Kohli","E001",86000);

document.getElementById("demo").innerHTML
   =  emp2.fullName();
        + " " + emp2.empId + " " + emp2.salary + " " + emp2.dept;
          emp1.dept = "FIN";
            console.log(emp1.firstName + " " + emp1.lastName
                + " " + emp1.empId + " " + emp1.salary + " " + emp1.dept);
