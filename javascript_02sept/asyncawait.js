const myProcess1 = async ()=>{
    try{
        const response = await fetch('https://jsonplaceholder.typicode.com/users/1')
        const json = await response.json();
        console.log(json);
    }catch(error){
        console.log(error);
    }
}

myProcess1();