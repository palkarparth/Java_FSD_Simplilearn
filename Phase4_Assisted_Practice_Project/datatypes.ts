const isAdmin: boolean = true;
 // boolean datatype

 // number datatype
 const age: number = 33;
 const hexadecimal: number = 0xa00f;

// String datatype
const user: string = "Parth";
const message: string = 'Hello';

let welcome: string;

if (isAdmin) {
    welcome = `hello ${user}`;
} else {
    welcome = `${user} is not an admin`
}

console.log(welcome);

