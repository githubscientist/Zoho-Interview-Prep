const readline = require("readline");

const inp = readline.createInterface({
  input: process.stdin
});

const userInput = [];

inp.on("line", (data) => {
  userInput.push(data);
});

inp.on("close", () => {
    let n = parseInt(userInput[0]);
    let numbers = userInput[1].split(' ').map(val => parseInt(val));

    // generate the frequencies
    let table = {};

    for (let i = 0; i < numbers.length; i++) {
        table[numbers[i]] = 0;
    }

    for (let number of numbers) {
        table[number]++;
    }

    // extract the key value pairs from the object
    const result = Object.entries(table);

    // sort the table based on the values
    result.sort((a, b) => a[0] - b[0]);

    // sort the table based on frequencies
    result.sort((a, b) => a[1] - b[1]);

    // extract the keys and print them space separated
    console.log(result.map(sub => sub[0]).join(' '));
});