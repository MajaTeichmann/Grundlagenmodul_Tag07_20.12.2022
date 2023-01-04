fun main() {
    // todo: Erstelle hier deinen Code.

    var eis: MutableList<String> = mutableListOf("Schokolade","Zitrone","Haselnuss")
    eis.add("Blaubeere")
    println("Wir haben aktuell ${eis.size} Eissorten im Angebot. Unsere aktuellste Sorte ist ${eis.last()}.")

}