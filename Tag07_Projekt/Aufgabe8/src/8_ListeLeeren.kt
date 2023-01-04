fun main() {
    val wochentage: MutableList<String> = mutableListOf("Montag", "Dienstag", "Mittwoch")
    // todo: Erweitere ab hier den Code.

    wochentage.add("Donnerstag")
    wochentage.add("Freitag")
    wochentage.add("Samstag")
    wochentage.add("Sonntag")
    println("Die Wochentage lauten: ${wochentage}.")

    println("Die Größe der Liste beträgt ${wochentage.size}.")

    wochentage.clear() // nichts außer []

    println(wochentage)

}
