package pertemuan3

fun main() {
    for (i in 1..5){
        println("nilai = $i")
    }

    val cars = arrayOf("volvo","BMW","Mazda","Toyota")
    for (x in cars){
        println(x)
    }

    var i = 0
    while (i < 15){
        println("nilai $i")
        i++
    }

    var percobaan = 1
    do {
        println("buka pintu - percobaan ke $percobaan")
        percobaan++
    }while (percobaan < 5)
}