window.onload=displayNumber;
function generateNumber() {
return Math.floor(Math.random() * 75) + 1;
}
function displayNumber() {
var number = generateNumber();
document.getElementById("number").innerHTML =
"The next BINGO number is: " + number;
}
