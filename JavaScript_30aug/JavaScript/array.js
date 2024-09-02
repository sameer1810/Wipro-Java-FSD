function filterArray(arr) {
    return arr.filter(function(element) {
        return element >= 0 && element % 2 === 0;
    });
}

const numbers = [5, -3, 2, -4, 6, 10, -8];
const result = filterArray(numbers);

document.getElementById("demo").innerHTML = result;

console.log(result);
