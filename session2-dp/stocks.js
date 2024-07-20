const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin
})

const userInput = [];

rl.on('line', (data) => {
    userInput.push(data);
});

rl.on('close', () => {
    // handle the inputs
    let N = Number(userInput[0]);
    let prices = userInput[1].split(' ').map(val => Number(val));

    let minPrice = 2 ** 63;
    let maxProfit = 0;

    for (let price of prices) {
        minPrice = Math.min(price, minPrice);
        
        maxProfit = Math.max(maxProfit, price - minPrice);
    }

    console.log(maxProfit);
});