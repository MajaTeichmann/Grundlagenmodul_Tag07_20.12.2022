fun main() {
    var liste: MutableList<Int> = mutableListOf(5, 4, 6, 7)
    // todo: erweitere ab hier den Code.

    var index = liste.indexOf(6)
    // println(index)

    var element = liste.elementAt(index) // liste[index]


    println("Das Element $element steht auf der Indexstelle $index.")


}