function showResult(result) {

    document.getElementById("demo")
            .innerHTML = result;
}

function sum(p1,p2, myCallback) {
    let res = p1+p2;
    myCallback(res);
}

sum(24,23,showResult);