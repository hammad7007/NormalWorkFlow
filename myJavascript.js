// Example: JavaScript Code with Low-Priority Issues

// 1. Inconsistent variable declarations
var itemCount = 10; // Old 'var' keyword
let userName = 'Alice'; // Newer 'let' keyword

// 2. Unused variables
const unusedVariable = 'This is never used';

// 3. Magic numbers
function calculateDiscount(price) {
    return price * 0.85; // Magic number for discount rate
}


// 5. Loose equality check
function isZero(count) {
    return count == 0; // Should use strict equality '==='
}

// 6. Implicit global variable
function setFlag() {
    flag = true; // Implicit global variable due to missing 'let' or 'const'
}

// 7. Functions in loops
for (var i = 0; i < 5; i++) {
    setTimeout(function() {
        console.log(i); // Always logs '5' due to closure inside loop
    }, 100 * i);
}

// 8. Console statements
console.log('Debugging info'); // Console logs should be removed in production

// 9. Inconsistent function declaration
var addNumbers = function(a, b) {
    return a + b;
};

function subtractNumbers(a, b) {
    return a - b;
}

// 10. No error handling in asynchronous function
function fetchData() {
    fetch('https://api.example.com/data')
        .then(response => response.json())
        .then(data => console.log(data));
}

// Starting the server simulation
console.log('Starting the application...');
