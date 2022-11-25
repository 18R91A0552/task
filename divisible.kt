package com.axis.divisible

fun print1to100DivisibleBy3and5() {
    var count = 0
    var n = 1
    while (count < 100) {
        if (n % 3 == 0 && n % 5 != 0) {
            count++
            println("$count)$n")
        }
        n++
    }
}
