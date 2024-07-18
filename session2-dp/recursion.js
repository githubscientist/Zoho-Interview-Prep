function main(n) {
    if (n === 0) return
    console.log('hello');
    main(n - 1);
}

main(5)