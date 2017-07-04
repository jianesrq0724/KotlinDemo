package com.ruiqin.firstkotlin.kotlin

/**
 * Created by ruiqin.shen
 * 类说明：
 */
/*
声明数组
 */
private val sArray: Array<String> = arrayOf("a", "b", "c")
private val listOf: List<String> = listOf<String>("aa", "bb", "cc")
private val a: Int = 1
private val b: Int = 2

fun main(args: Array<String>) {
    forLoop(sArray)
    println("---------------------调用求和函数---------------------")
    println("$a + $b = ${sum2(a, b)}")

    println("--------------------最大值------------------------")
    println("$a 和 $b 最大值: ${max2(a, b)}")

    println("---------------------操作符-----------------------")
    operator()

    println(numbers.filter(::isOdd))

    println("-----------------------when判断类型---------------------------------")
    println(whenFun(25))

    println("-------------------------for循环------------------------------------------")
    forFun()

    println("-------------------------for循环倒序-----------------------")
    forDownTo()

    println("----------------------------创建数据类-----------------------------------")
    var staff = Staff("ruiqin", "Android", "22")
    println(staff.toString())

    println("-----------------------字符模板------------------------------")
    //字符模板
    var name: String = "ruiqin"
    println("my name is $name")
    println("my name is ${name}")

    println("-------------------------枚举------------------------------------")
    println(enumFun())
}

enum class Color {
    RED, BLACK, GREEN
}

/*
枚举
 */
private fun enumFun() {
    var color:Color = Color.RED
    println(color.ordinal)
}

data class Staff<T>(var name: String, val position: String, var age: T)

/**
 * downToFun
 */
private fun forDownTo() {
    //倒序输出5 4 3 2 1
    for (i in 5 downTo 0) {
        print("$i ,")
    }
    println()
    //设置输出数据步长
    for (i in 1..5 step 3) {
        print("$i ,")
    }
    println()
    for (i in 5 downTo 0 step 3) {
        print("$i ,")
    }
    println()
}

/*
i in 0..2 等价于java中for(int i=0;i<=2;i++)
for循环
 */
private fun forFun() {
    loop@ for (i in 0..2) {
        for (j in 0..3) {
            println("i: $i, j: $j")
            if (j == 2) {
                break@loop
            }
        }
    }
}


/*
when判断类型
 */
private fun whenFun(obj: Any) {
    when (obj) {
        25 -> println("25")
        "Kotlin" -> println("Kotlin")
        else -> println("Nothing")
    }
}

private fun isOdd(x: Int) = x % 2 != 0
private val numbers = listOf(1, 2, 3)

/**
 * 操作符
 */
private fun operator() {
    val a: Int = 8
    val b: Int = 2
    println("$a 按位左移 $b = ${a shl b}")

    println("$a 按位右移 $b = ${a shr b}")
}


/*
求两个数的最大值
 */
private fun max(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

/*
求两个数的最大值2
 */
private fun max2(a: Int, b: Int) = if (a > b) a else b

/**
 * 两个数求和
 */
private fun sum(a: Int, b: Int): Int {
    return a + b
}

/**
 * 连个数求和
 */
private fun sum2(a: Int, b: Int) = a + b

private fun forLoop(sArray: Array<String>) {

    //第一种方式直接输出字符(类似java foreach)
    println("第一种方法---------------------")
    for (s in sArray) {
        println(s)
    }

    //Array提供forEach函数
    println("第二种方法----------------------")
    sArray.forEach {
        println(it)
    }

    //得到索引
    println("第三种方法-----------------------")
    for (i in sArray.indices) {
        println(sArray[i])
    }

    //类似java for(int i = 0; i < array.length; i++)
    println("第四种方法------------------------")
    var i = 0
    while (i < sArray.size) {
        println(sArray[i])
        i++
    }
}