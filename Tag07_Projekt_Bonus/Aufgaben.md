
<h1 align="center">Grundlagen der Programmierung</h1>
<h3 align="center">Listen</h3>
<br>


#### Beschreibung:

Willkommen zurück zu den Bonusaufgaben von Tag 07! Diese sind etwas kniffliger. Jedoch müsst ihr euch nur ganz genau die Aufgaben durchlesen dann schafft ihr das auch!
Falls ihr Fragen zu den Aufgabenstellungen oder allgemeine Fragen habt, kommt gerne auf uns zu.




#### Hinweise zur Bearbeitung:

- Achte auf einen sauberen Quellcode, insbesondere Einrückungen sind wichtig!
- Wichtige Materialien für heute:
    - [Handbuch: Listen → Implementieren → Leere Liste anlegen](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.rzenbc82tldb)
    - [Handbuch: Listen → Implementieren → Liste mit Initialwerten anlegen](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.kkdwa5534c96)
    - [Handbuch: Listen → Implementieren → Größe einer Liste lesen](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.bvtmwoufzcex)
    - [Handbuch: Listen → Implementieren → Wert einer Liste an Index auslesen](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.t2kkzviqdnfo)
    - [Handbuch: Variablen & Datentypen → Nachschlagen → Die wichtigsten Datentypen](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.gtvirtqzojk0)

---

<details>
<summary> <b> Aufgabe 1 - Klassenliste</b> </summary>

Szenario:
Du arbeitest neu als Lehrer in einer Schule. Du kommst ins Klassenzimmer und sitzt vor den SchülerInnen. Du erstellt nun eine Liste von Vornamen der SchülerInnen.

Erledige die folgenden Teilaufgaben.
* Notiere folgende Schüler in einer Liste. 

        Liam, Olivia, Noah, Emma, Oliver, Charlotte, Elijah, Amelia, 
        James, Ava, William, Sophia, Benjamin, Isabella, 
        Lucas, Mia, Henry, Evelyn, Theodore, Harper.

* Gebe die Liste in der Konsole aus.
* Es sind weitere Schüler dazugekommen, füge sie der Liste hinzu.

      Liselotte, Marianus, Homer, Kleopatra, George

* Gebe nur die neuen Schüler aus der Liste aus (Also Liselotte, Marianus, Homer, Kleopatra, George).
* Gebe die ersten 5 Schüler (insgesamt) in die Konsole aus.
* Gebe die Anzahl an Schülern in der Klasse aus.
* Isabella und George wechseln an die American School,
  weil sie dort Pancakes zum Frühstück anbieten.  
  Entferne Isabella und George aus der Liste.
* Als die Kinder die Liste sehen weisen sie dich darauf hin, dass ein Name falsch geschrieben ist.
  Ändere "Theodore" in "Theodor" um, verwende dazu die Methode indexOf().


**Datei zum Bearbeiten 1_Klassenzimmer.kt**

</details>

---

<details>
<summary> <b> Aufgabe 2 - Einkaufswagen befüllen</b> </summary>

Szenario:
Ein Kiosk verkauft **nur** Wasser, Brot, Schnitzel, Kaffee, Frischkäse, Käse, Milch und Wurst. Das Sortiment ändert sich nie, da der Kioskbesitzer seit 30 Jahren immer das selbe verkauft.
Du gehst mit einem Einkaufswagen in den Kiosk und befüllst deinen Wagen als erstes mit Kaffee dann mit Milch, Kaese und Brot in dieser Reihenfolge.

Aufgabe:
1. Erstelle zunächst eine **nicht veränderbare Liste** mit dem Namen angebot.     
Die Liste enthält dabei zu Beginn das Sortiment des Kiosks (also Wasser, Brot...)
2. Erstelle dann eine anfänglich leere, **veränderbare Liste** einkaufsWagen.
3. Füge dem Einkaufswagen dann aus dem Angebot Kaffee, Milch, Käse und Brot hinzu,  
indem du die Artikel aus der Liste **angebot** mit dem richtigen Index herausliest und der Liste 
**einkaufsWagen** hinzufügst.  
Verwende dafür die indexOf() Methode.
4. Gib die Liste einkaufsWagen aus

Das Ergebnis sollte so aussehen:

[Kaffee, Milch, Käse, Brot]

**Datei zum Bearbeiten 2_EinkaufswagenBefuellen.kt**

</details>

---

<details>
<summary> <b> Aufgabe 3 - Kosten berechnen</b> </summary>

Ein lokaler Supermarkt verkauft die folgenden Artikel:  
Äpfel für 0.29€ das Stück, Schokolade für 0.99€ das Stück und Pizza für 2.49€ das Stück.  
Der Artikel und sein Preis sind jeweils in zwei Listen aufgeteilt.

    val artikelName: List<String> = listOf("Äpfel", "Schokolade", "Pizza")
    val artikelPreis: List<Double> = listOf(0.29, 0.99, 2.49)

D.h. der Artikel "Äpfel" hat den Index 0 als auch sein Preis 0.29€ hat den Index 0.

Aufgaben:  
Verwende für die Aufgaben die indexOf() Methode, um den richtigen Artikelpreis aus der <i>artikelPreis</i> Liste zu bekommen. 
Gebe das Ergebnis mit der println() Methode aus.  
Bsp:  
Tim will 2 Schokoladen kaufen:  
    
    val kosten: Double = artikelPreis.get(artikelName.indexOf("Schokolade")) * 2.0
    println(kosten)

* Peter will 5 Äpfel kaufen, wie viel muss er bezahlen? 
* Frank will 36 Äpfel, 24 Schokoladen und 12 Pizze kaufen, wie viel muss er bezahlen?
* Frank teilt sich nun die Kosten mit seinen zwei Mitbewohnern Alice und Jürgen, 
wieviel muss Frank jetzt noch bezahlen?
* Der Supermarktbesitzer möchte jetzt sein Sortiment erweitern, er erkauft jetzt auch noch 
Wassermelonen für 1.99€, Kaugummi für 0.09€ und Zitronen für 0.49€.
  * Passe dazu den bestehenden Code so an, sodass du die neuen Artikel mit der add() Methode hinzufügen kannst.  
  Worauf musst du achten? Was musst du verändern?  
  * Füge die neuen Artikel jeweils an die richtigen Stellen hinzu, sodass die Liste mit den Artikelpreisen 
  weiterhin aufsteigend sortiert ist.
* Jürgen geht am Tag darauf noch einmal in den Supermarkt und sieht, dass es gerade einen 20% Rabatt
auf Schokolade gibt. 
Jürgen kauft 25 Äpfel, 8 Schokoladen, 15 Kaugummis, 1 Zitrone und teilt sich die Rechnung mit 
seinen vier Geschwistern. Wie viel muss er zahlen?

**Datei zum Bearbeiten 3_KostenBerechnen.kt**

</details>