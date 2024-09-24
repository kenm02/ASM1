import kotlin.math.sqrt

fun main() {
    println("The degree equation: Ax^2+Bx+C = 0")
    print("Enter number A: ")
    val a=readLine()!!.toInt()
    print("Enter number B: ")
    val b=readLine()!!.toInt()
    print("Enter number C: ")
    val c=readLine()!!.toInt()
    val delta = b*b - 4.0*a*c
    if(delta < 0) {
        println("The equation has no solution")
    }else if (delta == 0.0){
        println("The equation has 1 solution: ${-b/2*a}")
    }else if (delta > 0){
        println("The equation has 2 solution: ${(-b+ sqrt(delta)/2*a)} and ${(-b - sqrt(delta)/2*a)}")
    }
}