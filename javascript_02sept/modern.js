let subject = "javascript";

//Template literals
console.log(`The subject is : ${subject}`);

const car = {
    model: '2020',
    make: 'jaguar',
    color:'black'
}

//destructuring of object
let {model,make,color}=car;
console.log(model+" "+make+" "+color);

//destructuring of array
let fruits = ['apple', 'berry','cheery'];
let [f1,f2,f3] = fruits;
console.log(f1+" "+f2+" "+f3);

//deafault para
function hello(greeting, user="Everyone"){
    return greeting+" "+ user+"!!";
}

console.log(hello("good morining"));
console.log(hello("good morining","Sameer"));

//spread operator->spread value in array


//forof loop
const numbers = [10,20,30,32];
for(let n of numbers){
    console.log(n);
}

