//for loop
val list = listOf("a", "b", "c")
fun forLoop() {
    for (d in list) {
        println(d)
    }
}

//iterating over map loop
val map = mapOf(
    1 to "one",
    2 to "two",
    3 to "three"
)

fun iteratingForLoop() {
    for ((k, v) in map) {
        println("$k = $v")
    }
}
//iterating over index

fun iteratingForLoopOverIndex() {
    for ((ix, vl) in list.withIndex()) {
        println("$ix = $vl")
    }
}

//iterating over range
fun loopWithRange() {
    for (t in 1..9)
        println(t)
}

//iterating over range until

fun loopWithRangeUntil() {
    for (t in 1 until 9)
        println(t)
}

//iterating with steps

fun loopWithSteps() {
    for (t in 9 downTo 1 step 2)
        println(t)
}

//iterating over string
const val s = "abc";
fun loopInCharacter() {
    for (z in s)
        println(z)
}

fun loopInCharacterIndex() {
    for (z in s)
        println(z + 1)
}

fun main() {
    //forLoop()
    //iteratingForLoop()
    //iteratingForLoopOverIndex()
    //loopWithRange()
    //loopWithRangeUntil()
    //loopWithSteps()
    //loopInCharacter()
    loopInCharacterIndex()
}