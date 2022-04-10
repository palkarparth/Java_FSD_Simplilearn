const empId = (function() {
    let count = 0;
    return function() {
        ++count;
        return `emp${count}`;
    };
})(); 

console.log("New Employee IDs are listed here.")
console.log('Parth:' + empId());
console.log('Sargam:' + empId());
console.log('Shashank:' + empId());

// callback
console.log("\n");
function fullName(firstName,lastName,callback) {
    console.log("My name is " + firstName + " " + lastName);
    callback(lastName);
}

var greeting = function(ln) {
    console.log('Welcome ' + ln)
};

fullName('Salman','Khan',greeting);
console.log("\n");
fullName('Virat','Kohli',greeting);
console.log("\n");
fullName('Rishab','Pant',greeting);
console.log("\n");