var Demo = /** @class */ (function () {
    function Demo(name, salary) {
        this.name = name;
        this.salary = salary;
    }
    Demo.prototype.f1 = function () {
        var x = 5;
        var city = "Chandrapur";
        console.log(this.name);
        console.log(this.salary);
    };
    return Demo;
}());
var d = new Demo("Dhoni", 98000);
d.f1();
