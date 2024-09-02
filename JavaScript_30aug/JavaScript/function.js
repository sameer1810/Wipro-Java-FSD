function displayDate() {
    document.getElementById('demo')
                .innerHTML=Date();
}

const inc = (function() {
    let counter = 0;
    return function() { counter +=1;
        return counter;
    }
})  ();

function myCount() {
    document.getElementById("demo")
        .innerHTML = inc();
}