package com.company;

/**
 * Created by svitlana on 3/9/16.
 */
public class Logarithms {


// lg() which takes as an argument N (type Int) and returns max Int value, not bigger than binary logarithm of N log2(N)
// метод lg(), который принимает в качестве аргумента значение N типа int и возвращает наибольшее целое число, не большее, чем двоичный логарифм N.

public static int log2(int x) {

    int res = 0;
    //while ((x >>= 1) != 0) //bitwise offset / divide on 2
    while ((x /= 2) != 0)
        res++;

    return res;

}

//TODO: fix
/*func log2(x: Int) -> Int {

    var res: Int = 0
    //while ((x >>= 1) != 0) {//bitwise offset / divide on 2

    while ( x / 2  != 0) {
    res++
    }

    return res

}

log2(100000)*/

}
