// For n = 1, F(n) = 0
// For n = 2, F(n) = 1
// For n > 2, F(n) = F(n - 1) + F(n - 2)

function F(n) {
    // For n = 1, F(n) = 0
    if (n == 1) return 0;
    // For n = 2, F(n) = 1
    if (n == 2) return 1;
    // For n > 2, F(n) = F(n - 1) + F(n - 2)
    return F(n - 1) + F(n - 2);
}

console.log(F(10))