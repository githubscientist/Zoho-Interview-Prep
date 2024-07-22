// JavaScript does not support Method Overloading.
// But we can achieve it by using default values for the parameters.
class Calc{
    add(a=0, b=0) {
        return a + b;
    }
}

let calc = new Calc();
console.log(calc.add()); // 0
console.log(calc.add(10)); // 10
console.log(calc.add(10, 20)); // 30
console.log(calc.add(5.4, 3.24)); // 8.64