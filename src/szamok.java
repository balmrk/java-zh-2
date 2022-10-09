import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class szamok {
    ArrayList<Feladatok> feladatok = new ArrayList<Feladatok>();
    public int counter = 0;
    szamok() throws IOException {
        System.out.println("----- 1. feladat -----");
        Beolvas();
        System.out.println("----- 2. feladat -----");
        mennyiFeladat();
        System.out.println("----- 3. feladat -----");
        hanyMatekMennyiPont();
        System.out.println("----- 4. feladat -----");
        minMax();
        System.out.println("----- 5. feladat -----");
        temakHalmaz();
        System.out.println("----- 6. feladat -----");
        sorlsolTemat();
        System.out.println("----- 7. feladat -----");
        tizFeladatotAd();
    }
    public void tizFeladatotAd() throws IOException {
        ArrayList<Feladatok> kevertLista = feladatok;
        Collections.shuffle(kevertLista);
        FileWriter iro = new FileWriter("tesztfel.txt");
        int osszpontszam = 0;
        for (int i=0;i<10;i++){
            iro.write(kevertLista.get(i).pont + " " + kevertLista.get(i).valasz+ " " + kevertLista.get(i).kerdes+"\n");
            osszpontszam += kevertLista.get(i).pont;
        }
        iro.write("A feladatsorra összesen " + osszpontszam + " adható.");
        iro.close();

    }
    public void sorlsolTemat(){
        Scanner beolv = new Scanner(System.in);
        System.out.println("Milyen temakorbol szeretne kerdest kapni?");
        String tema = beolv.nextLine();
        ArrayList<Feladatok> temafeladatok= new ArrayList<Feladatok>();
        for (Feladatok a:feladatok){
            if(a.kategoria.equals(tema)){
                temafeladatok.add(a);
            }
        }

        int b = 3; //randomszám
        int a = (int)(Math.random() * temafeladatok.size());

        Feladatok kivalasztott = temafeladatok.get(a);
        System.out.println(kivalasztott.kerdes);
        int valasz = Integer.parseInt(beolv.nextLine());
        if(valasz == kivalasztott.valasz){
            System.out.println("A válasz "+kivalasztott.pont+" pontot ér.");
        }else{
            System.out.println("A válasz 0 pontot ér.");
        }
        if (valasz != kivalasztott.valasz) {
            System.out.println("A helyes válasz: " + kivalasztott.valasz);
        }
    }
    public void temakHalmaz(){
        HashSet<String> b = new HashSet<String>();
        for (Feladatok a : feladatok){
            b.add(a.kategoria);
        }
        for (String c: b){
            System.out.println(c);
        }
    }
    public void minMax(){
        int min=feladatok.get(1).valasz, max=0;
        for (Feladatok a : feladatok){
            if(min > a.valasz)  min = a.valasz;
            if(max < a.valasz) max = a.valasz;
        }
        System.out.println("min: "+min + " max: "+ max);
    }
    public void hanyMatekMennyiPont(){
        int matekos = 0;
        int mas = 0;
        int[] pontos = new int[3];
        for(Feladatok a : feladatok){
            if (a.kategoria.equals("matematika")){
                matekos++;
                switch (a.pont){
                    case 1:
                        pontos[0]++;
                        break;
                    case 2:
                        pontos[1]++;
                        break;
                    case 3:
                        pontos[2]++;
                        break;
                }
            }else{
                mas++;
            }
        }
        System.out.println(matekos + "db feladat van ebben a kategóriában.");
        for (int i = 0; i<pontos.length;i++){
            System.out.println(pontos[i] + "db "+i+1+ "pontos.");
        }
    }
    public void mennyiFeladat(){
        System.out.println(counter/2 + " feladat van az adatfájlban.");
    }
    public void Beolvas() throws FileNotFoundException {
        ArrayList<String> parosSor = new ArrayList<String>();
        ArrayList<String> paratlanSor = new ArrayList<String>();
        String paros = "", paratlan = "";
        Scanner be = new Scanner(new File("felszam.txt"));

        while (be.hasNext()){
            if (counter % 2 == 0){
                paratlan = be.nextLine();
            }else{
                paros = be.nextLine();
                String[] bontott = paros.split(" ");
                feladatok.add(new Feladatok(paratlan,Integer.parseInt(bontott[0]),Integer.parseInt(bontott[1]),bontott[2]));
            }
            this.counter++;
        }
        System.out.println("Beolvasva.");
    }
    public static void main(String[] args) throws IOException {
        szamok Szamok = new szamok();
    }
}
