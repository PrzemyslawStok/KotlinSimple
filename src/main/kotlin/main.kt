import java.util.*

fun main(){

    var max = 100
    val b:Int = (Math.random()*max).toInt()
    val scanner = Scanner(System.`in`)
    //println("Wprowadzono $no")
    var no = 0

    var i = 0
    var min  = 0

    var komputer = true

    while(true) {
        print("Zgaduj: ")
        i++

        if(komputer) {
            val average = (min + max) / 2
            no = average
        }else {
            no = scanner.nextInt()
        }

        if (no == b) {
            println("Udało się! po ${i} próbach")
            break
        }

        if (no > b) {

            max = no - 1
            println("Wprowadzona liczba jest za duża [$min,$max]")
        }

        if (no < b) {

            min = no + 1
            println("Wprowadzona liczba jest za mała [$min,$max]")
        }
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
