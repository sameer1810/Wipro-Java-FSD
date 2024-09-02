let myPromise = new Promise(function (myResolve,myReject){

    //prducing code=async wait


    //when successful
    myResolve();

    //when error
    myReject();

});

//consuming code(must wait for a fulfilled promise)
myPromise.then(
    function (value){
        //action if successful
    },
    function(error){
        //code if some error occurs
    }
);

myPromise.state  ,   myPromise.result //access through functioon

//async & await -chaining of methods

fetch('uri endpoint')
    .then(response=> response.json())
    .then(json=>console.log(json))
    .catch(error=>console.log(error));

async function myProcess(){
        try{
            const response = await fetch('uri endpoint')
            const json = await response.json();
            console.log(json);
        }catch(error){
            console.log(error);
        }
}

myProcess();



