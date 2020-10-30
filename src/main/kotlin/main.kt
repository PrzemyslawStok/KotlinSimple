import java.util.*

fun main(){
    val b = 5
    val scanner = Scanner(System.`in`)
    print("Zgaduj: ")
    var no = scanner.nextInt()
    //println("Wprowadzono $no")

    if(no==b){
        println("Udało się!")
    }

    if(no>b){
        println("Wprowadzona liczba jest za duża")
    }
}



fun example(){
    val scanner = Scanner(System.`in`)
    print("a=")
    val a = scanner.nextInt()
    print("b=")
    var b = scanner.nextInt()

    println("$a+$b=${a+b}")

    val numbers = listOf(1,2,3,4,5)
    println(numbers)
    val array = IntArray(5){it}
    println(array.asList())

    val tab1 = IntArray(10){it*it}
    println(tab1.asList())
}
