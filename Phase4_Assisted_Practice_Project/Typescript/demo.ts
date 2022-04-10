class Demo {

    constructor(name,salary) {
        this.name = name;
        this.salary = salary;
    }

    name: string;
    salary: number;

    f1() { // Method
        let x = 5;
        var city = "Chandrapur";
        console.log(this.name);
        console.log(this.salary);
    }

}

var d = new Demo("Dhoni",98000);
d.f1();

