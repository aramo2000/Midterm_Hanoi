var greeting: String = "Hello"

fun main() {
    //test
    val n=4
    val place_are = "A"
    val place_to_go = "C"
    val other = "B"
    move(n,place_are,place_to_go,other)
}

fun move(n:Int,place_are:String, place_to_go:String, other:String) {
    if(n==1) {
        println("disk 1 from " + place_are + " to " + place_to_go)
    } else {
        move(n-1, place_are, other, place_to_go) //A to B
        println("disk " + n + " from " + place_are + " to " + place_to_go)
        move(n-1, other, place_to_go, place_are) //B to C
    }
}