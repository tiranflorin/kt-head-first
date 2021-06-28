fun main(args: Array<String>) {
    println("Started (from main()")
    loops()
}

fun loops() {
    var x = 1
    println("Before the loop => x = $x")
    while (x < 8) {
        println("In the loop x=> $x")
        x++
    }
    println("After the loop => x = $x")
}
