public class Feladatok {
    public String kerdes, kategoria;
    public int valasz, pont;

    public void kiir(){
        System.out.println(this.kerdes);
        System.out.println(this.valasz + " " +this.pont + " " +this.kategoria);
    }
    Feladatok(String kerdes, int valasz, int pont, String kategoria){
        this.kerdes = kerdes;
        this.valasz = valasz;
        this.pont = pont;
        this.kategoria = kategoria;
    }
}
