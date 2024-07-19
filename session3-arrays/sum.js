// Given a Recurrence Relation
// For n = 1, S(n) = 1
// For n > 1, S(n) = S(n - 1) + n

function S(n) {
    // For n = 1, S(n) = 1
    if (n === 1) return 1;

    // For n > 1, S(n) = S(n - 1) + n
    return S(n - 1) + n;
}

console.log(S(10))

