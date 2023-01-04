fun main() {
    // todo: Erstelle hier deinen Code.

    var ersteListe= mutableListOf<Int>(4,8,3)
    var zweiteListe= mutableListOf<Int>(2,4,9)

    ersteListe.add(3)
    zweiteListe.add(6)
    ersteListe.last()
    zweiteListe.last()

    var ersteListePluszweiteListe = ersteListe.last() + zweiteListe.last()

    println("Das Ergebnis von ${ersteListe.last()} + ${zweiteListe.last()} ist ${ersteListePluszweiteListe}.")


}