# java-zh-2
Java alkalmazások tárgyra készülő gyakorló feladatok megoldása.

Feladat leírása:

Számok

A Szereti Ön a számokat? internetes vetélkedőben a versenyzők olyan kérdéseket kapnak,
amelyekre egy egész számmal kell válaszolniuk. A kérdések különböző témakörökből
származnak (pl. magyar, matematika, történelem, kémia), és nehézségüktől függően 1-től 3-ig
terjedő pontszámot érnek. Tudjuk, hogy a kérdésekre adható válaszok értéke 0 és 1 milliárd
közé esik.

A feladatokat a verseny szervezői egy adatfájlban tárolják. A fájlban minden feladat két
sorban helyezkedik el. Az első sor tartalmazza a kérdést, a második pedig – egy-egy
szóközzel elválasztva – a helyes választ, a helyes válaszért adható pontszámot és a témakör
megnevezését. A fájlban egyelőre ékezetes betűk nem szerepelnek, pl. a „gyümölcsízű” szó
helyett a „gyumolcsizu” szót írták be.
Például:
Mikor volt a mohacsi vesz?
1526 1 tortenelem

A példában szereplő kérdés: Mikor volt a mohacsi vesz? A helyes válasz: 1526.
A helyes válasz 1 pontot ér, és a kérdés a tortenelem témakörbe tartozik.

Az adatfájl még csak részben készült el. Az Ön feladata ennek a félkész adatfájlnak
a tesztelése. A fájl legfeljebb 100 kérdést tartalmaz. Biztosan van benne matematika,
történelem és földrajz feladat, de más témakörök is előfordulnak.

Készítsen programot, amely a felszam.txt állomány adatait felhasználva az alábbi
kérdésekre válaszol! A program forráskódját mentse szamok néven! (A beolvasott fájl
adatait és a felhasználó válaszainak az érvényességét nem kell ellenőriznie.)

A képernyőre írást igénylő feladatok eredményének megjelenítése előtt írja ki a képernyőre
a feladat sorszámát (például: 3. feladat)! Ha a felhasználótól kér be adatot, akkor jelenítse
meg a képernyőn azt is, hogy milyen adatot vár! Az ékezetmentes kiírás is elfogadott.

1. Olvassa be a felszam.txt állományban talált adatokat, és azok felhasználásával oldja
meg a következő feladatokat!

2. Hány feladat van az adatfájlban? A választ írassa ki a képernyőre!

3. Határozza meg, hogy hány matematika feladat van az adatfájlban, és ezek közül hány
feladat ér 1, 2, illetve 3 pontot! A választ egész mondatban írassa ki a képernyőre!
Például:
Az adatfajlban 20 matematika feladat van, 1 pontot er
10 feladat, 2 pontot er 6 feladat, 3 pontot er 4 feladat.

4. Mettől meddig terjed a fájlban található válaszok számértéke? A választ egész mondatban
írja ki a képernyőre!

5. Milyen témakörök szerepelnek ténylegesen az adatfájlban? Írassa ki a témakörök nevét
a képernyőre úgy, hogy minden előforduló témakör pontosan egyszer jelenjen meg!

 
6. Kérje be egy témakör nevét, és véletlenszerűen sorsoljon ki egy kérdést ebből
a témakörből! Sorsoláskor ügyeljen arra, hogy az adott témakörbe eső valamennyi feladatnak
legyen esélye! (Feltételezheti, hogy a felhasználó helyesen adta meg egy létező
témakör nevét.) Írassa ki a kérdést, kérje be a felhasználó válaszát, majd adja meg
a válaszért járó pontszámot! (Helytelen válaszért 0 pont jár.) Ha a válasz helytelen volt,
a helyes választ is közölje! A párbeszéd az alábbi formában jelenjen meg:
Például:
Milyen temakorbol szeretne kerdest kapni? tortenelem
Mikor volt a mohacsi vesz? 1514
A valasz 0 pontot er.
A helyes valasz: 1526

7. Generáljon egy 10 kérdésből álló feladatsort véletlenszerűen úgy, hogy egyetlen feladat se
szerepeljen benne kétszer! (Ügyeljen azonban arra, hogy minden beolvasott feladatnak
legyen esélye a kiválasztásra!) A feladatsort írassa ki a tesztfel.txt állományba
az alábbi formátumban! (Az első szám a helyes megoldásért járó pontszám, ezt követi
a helyes válasz, majd a kérdés egy-egy szóközzel elválasztva.) Az állomány végére írassa
ki a feladatsorra összesen adható pontszámot is!
Például:
…
1 1526 Mikor volt a mohacsi vesz?
…
A feladatsorra osszesen 20 pont adhato.
