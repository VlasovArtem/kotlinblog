package test

interface Interface

open class Test(val int: Int)

class Child() : Test(10), Interface

fun test(itest: Int = 10, test2: Int): Int {
    return itest + test2
}

fun main(args: Array<String>) {
    val int1 = 5
    println(test(test2 = int1, itest = 5))
}