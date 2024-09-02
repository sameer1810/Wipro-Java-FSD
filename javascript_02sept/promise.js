function myShow(param1){
    document.getElementById("demo")
        .innerHTML=param1
}

let myPromise = new Promise(function(myResolve,myReject){
    
    let x=2;
    //x=x*x;

    if(x==2){
        myResolve("OK");
    }else{
        myReject("ERROR");
    } 

});

myPromise.then(
    function(value){myShow(value);},
    function(error){myShow(error);}
);

