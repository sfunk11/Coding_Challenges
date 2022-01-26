// JavaScript: 

// A number is said to be Disarium if the sum of its 'digits raised to their respective positions' is the number itself. 

// Create a function that determines whether a number is a Disarium or not. 

// Examples: 
// isDisarium(75) ➞ false 
// // 7^1 + 5^2 = 7 + 25 = 32 

// isDisarium(135) ➞ true 
// // 1^1 + 3^2 + 5^3 = 1 + 9 + 125 = 135 

// isDisarium(518) ➞ false 

// isDisarium(518) ➞ true 

// isDisarium(544) ➞ false 

// isDisarium(8) ➞ true 

// isDisarium(466) ➞ false 

// Notes: 
// Position of the digit is 1-indexed. 

function isDisarmian(num){
  let sum = 0;
  let orig = num;
  for(let i = num.toString().length; i >0; i--){
    sum += Math.pow(num%10, i);
    num = Math.floor(num / 10);
  }
return sum == orig;
}

console.log(isDisarmian(75));
console.log(isDisarmian(135));
console.log(isDisarmian(518));
console.log(isDisarmian(544));
console.log(isDisarmian(8));
console.log(isDisarmian(466));
