package com.ruiqin.firstkotlin.kotlin

private val number1 = 1
private val number2 = 2
/*
操作符
 */
var a: Int = 4
val b: Int = 1
var shl: Int = a shl b
var shr: Int = a shr b

/*
声明数组
 */
private val intArray: IntArray = intArrayOf(12, 2, 5)
private val sArray: Array<String> = Array<String>(3, { i -> i.toString() })
private val anyArray: Array<Any> = arrayOf(123, 1, "a")
private val longArray: LongArray = longArrayOf(1L, 2L, 3L)

fun main(args: Array<String>) {
    println("$number1 和$number2 的最大值${max2(number1, number2)}")
    println("$a 按位左移$b 位 $shl")
    println("$a 按位右移$b 位 $shr")
    ::a.set(6)
    println(::a.get())

    println("----------------------------")

    for (any in anyArray) {
        print("$any  ")
    }

    println("----------------------遍历数组-------------------")

    forLoop(sArray)

}

/*
遍历数组
 */
fun forLoop(array: Array<String>) {

    //第一种方式直接输出字符(类似java foreach)
    println("第一种方法-----------------------")
    for (str in array) {
        println(str)
    }

    //Array提供forEach函数
    println("第二种方法-----------------------")
    array.forEach {
        println(it)
    }

    //得到索引
    println("第三种方法-----------------------")
    for (i in array.indices) {
        println(array[i])
    }

    //类似java for(int i = 0; i < array.length; i++)
    println("第四种方法----------------------")
    var i = 0
    while (i < array.size) {

    }

}

/**
 * 两个数求和
 */
private fun sum(a: Int, b: Int) = a + b

/*
两个数求和2
 */
private fun sum2(a: Int, b: Int): Int {
    return a + b
}

/*
求两个数的最大值
 */
private fun max(a: Int, b: Int) = if (a > b) {
    a
} else {
    b
}

/*
求两个数的最大值2
 */
private fun max2(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

