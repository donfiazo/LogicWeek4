fun main(){
    println(evenlySpaced(2, 4, 6))
    println(evenlySpaced(4, 6, 2))
    println(evenlySpaced(4, 6, 3))
}

fun evenlySpaced(a: Int, b: Int, c: Int): Boolean {
    return ((a+b==2*c) || (a+c==2*b) || (b+c==2*a))
}
