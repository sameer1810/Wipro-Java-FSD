document.body.onload=addElement;

function addElement(){

    //create a new div
    const newDiv = document.createComment("div");

    const newContent = document.createTextNode("Hello Everyone from new div!");

    newDiv.appendChild(newContent);

    const currentDiv = document.getElementById("d1");

    document.body.insertBefore(currentDiv,newDiv);}