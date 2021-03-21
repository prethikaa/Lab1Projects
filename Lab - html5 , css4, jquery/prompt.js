window.onload = initAll;

function initAll() {
  var ans = prompt("Enter a positive number",""); 
// var ans = prompt("Are you sure you want to do that?","");
// if (ans) {
//   alert("You said " + ans);
//   document.write("You said " + ans);
// }
// else {
//   alert("You refused to answer");
try {
if (!ans || isNaN(ans) || ans<0) {
throw new Error("Not a valid number");
}
var sqrt = Math.sqrt(ans);
var message = "The square root of " + ans + " is " + sqrt;
alert(message);
document.write(message);
}
catch (errMsg) {
alert(errMsg.message);
}


}
