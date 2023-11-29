package pertemuan2

fun main() {
    val namaDepan: String = "Akbar"
    val namaBelakang = "Nitisasmita"
    var usia = 18
    usia = 19

    //Nullable Type
    val text: String? = null
    var textLength = text?.length
    println(textLength)

    print("Hallo Nama Saya $namaDepan $namaBelakang usia saya $usia ")

    // Char
    // -- ++
    var vocal = 'A'
    println("Vocal = " + vocal++)
    println("Vocal = " + vocal++)
    println("Vocal = " + vocal++)
    println("Vocal = " + vocal++)
    println("Vocal = " + vocal--)
    println("Vocal = " + vocal--)
    println("Vocal = " + vocal--)

    val integerList = listOf(4, 2, 1, 5, 1, 2)
    val integerSet = setOf(4, 2, 1, 5, 1, 2)
    val capital = mapOf(
        "JAkarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )

    println(integerList)
    println(integerList[4])
    println(integerSet)

    println(capital)
    println(capital["London"])

    val anyList = mutableListOf('A', "KOtlin", 3, true, User())

    anyList.add('D')
    anyList.add(0, 12)
    anyList[4]=false
    anyList.removeAt(5)
    println("MutableList = $anyList")


    }
fun User(){
    }
