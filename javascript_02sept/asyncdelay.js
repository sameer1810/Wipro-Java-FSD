function dataFromASource(){
    let promise = new Promise(
        (resolve,reject)=>resolve("hi everyone"));
        
    let deletePromise = new Promise(
        (resolve,reject)=>{
            setTimeout( ()=>{
                resolve("Delayed Hello");
            },4000);
        }
    );

    let combineResult =Promise.all([promise,deletePromise]);

    return combineResult;
}

async function showMyData() {
    
    let data = await dataFromASource();
    console.log(data);
}

showMyData();

