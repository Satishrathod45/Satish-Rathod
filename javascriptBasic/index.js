//Arithmetic operation
function operator(a, b) {

    // console.log("sum is", a + b);
    // console.log("substraction is", a - b);
    // console.log("multiplication is", a * b);
    // console.log("division is", a / b);
    // console.log("exponetial is", a ** b);
    // console.log("increment is", a + +);
    // console.log("decrement is", a --);

    add = a + b;
    sub = a - b;
    mul = a * b;
    div = a / b;
    mod = a % b;
    pow = a ** b;
    inc = a++;
    dec = a--;
    return { add, sub, mul, div, mod, pow, inc, dec };

}
console.log(operator(5, 3));
// operator(5,3);






// logical operator 
function logical(a, b) {
    // and = a && b;
    // or = a || b;

    // return { and, or };

    if (a % 2 == 0 && b % 2 == 0) {
        console.log("numbers are even");
    } else if (a % 2 == 0 || b % 2 == 0) {
        console.log("only one number is even");
    } else {
        console.log("numbers is odd");
    }

}

logical(4, 8);








//comparision operator 
function comp(a, b) {
    //     console.log("greater than or equal opr is", a >= b);
    //     console.log("less than or equal opr is", a <= b);
    //     console.log(" equal opr is", a == b);
    //     console.log("Multiple than or equal opr is", a *= b);

    if (a == b) {
        console.log("a is eqaul to b");
    } else if (a > b) {
        console.log("a is greater than b");
    } else {
        console.log("a is less than b");
    }

}
comp(5, 7);