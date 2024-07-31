var num = 454;
var temp = num;
var rev = 0;  
var rem;

while (num > 0) {
    rem = num % 10;         
    rev = rev * 10 + rem;  
    num = Math.floor(num / 10);  
}

if (temp == rev) {
    console.log('Palindrome');
} else {
    console.log('Not palindrome');
}
