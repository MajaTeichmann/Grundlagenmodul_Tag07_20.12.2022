
<h1 align="center">Grundlagen der Programmierung</h1>
<h3 align="center">Listen</h3>
<br>

<p align="center">

</p>

#### Beschreibung:

Willkommen zurück zu den Übungen an Tag 07!




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
<summary> <b> Aufgabe 1 - Ist die Liste leer? </b> </summary>

Gegeben ist folgende Liste:

	var liste: List<Int> = listOf(5,4,6,7)

Prüfe mit einer Methode aus der Vorlesung, ob die Liste leer ist oder nicht.  
Wenn die Liste leer ist, gib in der Konsole <i>true</i> aus und wenn die List nicht leer ist 
<i>false</i>.  

**Modul für die Aufgabe:** *Aufgabe1*  
**Datei für die Aufgabe:** *1_IstdieListeLeer.kt*

</details>

---

<details>
<summary> <b> Aufgabe 2 - Erstes und letztes Element löschen </b> </summary>

Gegeben ist folgende veränderbare Liste:

	 var liste: MutableList<Int> = mutableListOf(5,4,6,7)

Entferne das erste und letzte Element der Liste und gib die ganze Liste am Ende aus.

Das Ergebnis sollte dann so aussehen: [4, 6]

(Tipp: man kann eine ganze Liste mithilfe von println(listenname) ausgeben)

**Modul für die Aufgabe:** *Aufgabe2*  
**Datei für die Aufgabe:** *2_ErstesUndLetztesElement.kt*

</details>

---

<details>
<summary> <b> Aufgabe 3 - Element aus der Liste ausgeben </b> </summary>

Gegeben ist folgende veränderbare Liste:

	 var liste: MutableList<Int> = mutableListOf(5,4,6,7)

Finde den richtigen Index für das Element mit dem Wert <i>6</i>.  
Verwende dann den Index und eine passende Methode um das Element aus der Liste in der Konsole auszugeben.

**Modul für die Aufgabe:** *Aufgabe3*  
**Datei für die Aufgabe:** *3_WertEinerListeAnIndexLesen.kt*

</details>

---

<details>
<summary> <b> Aufgabe 4 - Das kleinste Element aus der Liste ausgeben </b> </summary>

Gegeben ist folgende veränderbare Liste:

	 var liste: MutableList<Int> = mutableListOf(5,4,6,7)


Nutze eine der heute gelernten Methoden, um die kleinste Zahl in der Liste auszugeben.

**Modul für die Aufgabe:** *Aufgabe4*  
**Datei für die Aufgabe:** *4_KleinsteZahlInListe.kt*

</details>

---

<details>
<summary> <b> Aufgabe 5 - Das größte Element aus der Liste ausgeben </b> </summary>

Gegeben ist folgende veränderbare Liste:

	 var liste: MutableList<Int> = mutableListOf(5,4,6,7)

Nutze eine der heute gelernten Methoden, um die größte Zahl in der Liste auszugeben.

**Modul für die Aufgabe:** *Aufgabe5*  
**Datei für die Aufgabe:** *5_GroessteZahlinListe.kt*

</details>

---
<details>
<summary> <b> Aufgabe 6 - Eisliste erstellen </b> </summary>

Erstellt eine Liste mit dem Namen Eis und füllt die Liste bei der Erstellung mit den 
Elementen vom Typ String "Schokolade", "Zitrone", "Haselnuss".

Nach der Initialisierung der Liste füge der Liste mit der add() Methode 
eine weitere Eissorte deiner Wahl hinzu.

Gib mit der println() Funktion das letzte Element der Liste aus.

**Modul für die Aufgabe:** *Aufgabe6*  
**Datei für die Aufgabe:** *6_EisListe.kt*

</details>

---

<details>
<summary> <b> Aufgabe 7 - Übung mit Listen </b> </summary>

Erstelle zwei Listen mit Integer Elementen.   
Die erste Liste beinhaltet dabei initial die Werte 4, 8, 3 und die zweite Liste 2, 4, 9 in dieser Reihenfolge.  

Füg der ersten Liste das Element 3 hinzu.  
Füg der zweiten Liste das Element 6 hinzu.  
Greif jeweils über den Index auf die letzten Elemente der Liste (in diesem Fall 3 und 6) zu,   
addiere sie und gib es mit der println() Funktion aus.

Das Ergebnis sollte 9 sein.

**Modul für die Aufgabe:** *Aufgabe7*  
**Datei für die Aufgabe:** 7_ListeAddition.kt

</details>

---

<details>
<summary> <b> Aufgabe 8 - Liste ergänzen, ihre Größe bestimmen und dann leeren </b> </summary>

In dieser Aufgabe hast du die folgende unvollständige Liste gegeben:

    val wochentage: MutableList<String> = mutableListOf("Montag", "Dienstag", "Mittwoch", "Donnerstag")

Führe dann folgende Teilschritte aus:

* Ergänze die Liste um die fehlenden Wochentage in der richtigen Reihenfolge und gib die Liste 
in der Konsole aus. 
* bestimme die Länge der Liste und gib die Länge in der Konsole aus.
* Leere nun die Liste vollständig. 
* Was wird in der Konsole ausgegeben, wenn du die leere Liste ausgeben lässt? 
Notiere deine Antwort in einem Kommentar.
* Gib jetzt die leere Liste in der Konsole aus und überprüfe dein Ergebnis.

**Modul für die Aufgabe:** *Aufgabe8*  
**Datei für die Aufgabe:** 8_ListeLeeren.kt

</details>

---

<details>
<summary> <b> Aufgabe 9 - Werte einer Liste ändern </b> </summary>

Der Besitzer einer Videothek möchte seinen Filmbestand in einer MutableList festhalten.  
Dabei sind ihm allerdings ein paar ungewollte Werte zwischen die Filmnamen gerutscht.  
Nun bittet er dich um Hilfe.



Ändere hierfür die unpassenden Werte mit den Werten "Ironman" und "James Bond"  
(dabei ist es egal, welchen der beiden Filme ihr für welchen unpassenden Wert einsetzt).  
Gebt dann die Liste in der Konsole aus und überprüft euer Ergebnis.

**Modul für die Aufgabe:** *Aufgabe9*  
**Datei für die Aufgabe:** 9_WerteInEinerListeAendern.kt

</details>

---


<details>
<summary> <b> Aufgabe 10 - Der Kiosk </b> </summary>

Du bist Besitzer eines Kiosks und verkaufst Schokoriegel für 1.29€, 
Wassereis für 0.49€ und Zeitungen für 1.99€ das Stück.  
* Erstelle eine Liste für die Warennamen und eine Liste für die Warenpreise.
Dabei haben der Warenname und der dazugehörige Warenpreis jeweils den gleichen Index.  
Z.b. hat der Schokoriegel sowie sein preis 1.29€ den Index 0. 
* Ein neuer Kunde Peter kommt vorbei und möchte gerne wissen,
welche Waren du zu welchen Preisen verkaufst.  
Gebe dazu deine Waren und deren Preise in einer Form deiner Wahl in der Konsole aus.
* Peter hat dich leider nicht ganz verstanden, er fragt also nochmal wie viel denn ein Wassereis kostet.  
Nutze die readln() Methode um Peters Wunsch "Wassereis" als Eingabe zu erhalten,
verwende dann eine geeignete Methode aus der Vorlesung, um den Index des Wassereises 
in der Liste warennamen zu erhalten und verwende den Index um den Preis des Wassereises zu erhalten und auszugeben.
* Im Hintergrund kommt Alfred vorbei und gibt dir deine neue Ware. Dein Sortiment
erweitert sich um Kaugummis für 0.19€ das Stück.  
Füge die neue Ware mit der Methode add() so hinzu, dass sie jetzt den index 0 hat.
Passe deinen vorherigen Code an, wenn nötig.
* Der vergessliche Peter fragt jetzt nochmal nach dem Preis für die Zeitung.    
Nehme auch hier wieder den Warennamen "Zeitung" entgegen, finde den Index, finde mit dem Index den Preis und gib den Preis aus.
* Schlussendlich will Peter 10 Kaugummis, 5 mal Wassereis und 3 Schokoriegel kaufen,
er gibt dir 20€, wie viel Restgeld bekommt Peter?  
Berechne das Restgeld von Peter und gib es in der Konsole aus.
* Der Tag ist vorbei, ab nach Hause. Durch den ganzen Stress mit Peter hast du 
vergessen den Tiefkühlschrank für das Wassereis laufen zu lassen.
Am nächsten Morgen siehst du wie dein Wassereis geschmolzen ist. Bis das wieder eingefroren ist, 
musst du es aus deinem Sortiment nehmen.  
Entferne das Wassereis und sein Preis aus den jeweiligen Listen.
* Ein Junge schaut über die Theke, er hat nicht viel geld und will deswegen 
gerne wissen, was denn die günstigste Ware ist, die du verkaufst.  
Gib den Namen der günstigsten Ware aus, die du verkaufst. Verwende in deiner Lösung 
die Methoden indexOf() und min().


**Modul für die Aufgabe:** *Aufgabe10*  
**Datei für die Aufgabe:** 10_DerKiosk.kt

</details>

---