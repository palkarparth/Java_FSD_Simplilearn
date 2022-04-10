// function constructor
function Employee(name,designation,yearOfBirth) {
    this.name = name;
    this.designation = designation;
    this.yearOfBirth = yearOfBirth;
}

// creating calculating age method
Employee.prototype.calculateAge = function() {
    console.log("The current age is:" + (2022 - this.yearOfBirth));
}

console.log(Employee.prototype);

// creating object 
let Emp1 = new Employee('Parth Palkar','Associate Software Engineer','1998');
console.log(Emp1);
Emp1.calculateAge();

let Emp2 = new Employee('Sargam Patle','Junior HR','1997');
console.log(Emp2);
Emp2.calculateAge();

let Emp3 = new Employee('Shashank Bannare','Senior Software Engineer','1995');
console.log(Emp3);
Emp3.calculateAge();
