const arrFromString = Array.from("this is my string");

console.log(arrFromString);

console.log(arrFromString.length);

//indexOf
let fruits = ['apple','banana','cherry'];

console.log(fruits.indexOf('cherry'));

//find & findIndex
let tosearch = (val)=>{
    return fruits[0];
}

console.log(fruits.find(tosearch));

//findIndex
let num = [10,100,20,500,13];
console.log(num.findIndex((ele)=>ele>10));


//entries
const f= fruits.entries();

for(let i of f){
    console.log(i);
}