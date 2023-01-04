fun main() {
    val a: List<Double> = listOf(2.3, 5.4, 6.8)
    val b: Double = a.min()


    var artikel = mutableListOf<String>("Der", "Das", "Die")
    var warenName= mutableListOf<String>("Schokoriegel", "Wassereis", "Zeitung")
    var warenPreis = mutableListOf<Double>(1.29, 0.49, 1.99)

    println("Aktuelle habe ich ${warenName.size} Artikel im Angebot. ${artikel[0]} ${warenName[0]} kostet aktuell " +
            "${warenPreis[0]}€, ${artikel[1]} ${warenName[1]} ${warenPreis[1]}€ und ${artikel[2]} ${warenName[2]} "+
            "${warenPreis[2]}€.")

    println("Von welchem Artikel möchtest du den aktuellen Preis erfahren?")

    val petersWunschWare = readln()
    var index = warenName.indexOf(petersWunschWare)
    var Preis = warenPreis[index]
    println("${petersWunschWare} kostet ${Preis}")


    /* warenName.clear()
    warenPreis.clear()
    warenName.add("Kaugummi")
    warenName.add("Schokoriegel")
    warenName.add("Wassereis")
    warenName.add("Zeitung")
    warenPreis.add(0.19)
    warenPreis.add(1.29)
    warenPreis.add(0.49)
    warenPreis.add(1.99) */

    warenPreis.add(0,0.19)
    warenName.add(0,"Kaugummi")
    println("${warenName} + ${warenPreis}")


    println("Von welchem Artikel möchtest du den aktuellen Preis erfahren?")

    val petersWunschWare2 = readln()
    var index2 = warenName.indexOf(petersWunschWare2)
    var Preis2 = warenPreis[index2]
    println("${petersWunschWare2} kostet ${Preis2}")


    //10 Kaugummis, 5 mal Wassereis und 3 Schokoriegel kaufen, er gibt dir 20€, wie viel Restgeld bekommt Peter?

    var petersGeld: Double = 20.00
    var kaugummisImWarenkorb: Int = 10
    var wassereisImWarenkorb: Int = 5
    var schokoriegelImWarenkorb: Int = 3

    var gesamtPreis: Double = (kaugummisImWarenkorb * warenPreis[0]) + (wassereisImWarenkorb * warenPreis[2]) +
            (schokoriegelImWarenkorb * warenPreis[1])
    var petersRückgeld: Double = petersGeld - gesamtPreis

    println("Peter bezahlt insgesamt ${gesamtPreis}€")
    println("Sein Rückgeld beträgt: ${petersRückgeld}.")

    warenName.removeAt(2)
    warenPreis.removeAt(2)

    /* Ein Junge schaut über die Theke, er hat nicht viel Geld und will deswegen gerne wissen, was denn die günstigste
       Ware ist, die du verkaufst.
       Gib den Namen der günstigsten Ware aus, die du verkaufst. Verwende in deiner Lösung die Methoden indexOf() und min() */

    var guenstigsteWare = warenName.min()
    println("Meine günstigste Ware ist ${guenstigsteWare} und kostet ${warenPreis.indexOf(warenPreis.min().toDouble())}.")


    /* if (readln() == warenName[0]) {
        println("Der Index von ${warenName[0]} ist ${warenName.indexOf(0)}.")
    } else if (readln() == warenName[1]) {
        println("Der Index von ${warenName[1]} ist ${warenName.indexOf(1)}.")
        }
    else {
        println("Der Index von ${warenName[2]} ist ${warenName.indexOf(2)}.")
    } */


}
