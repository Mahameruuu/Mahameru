public class Anjing {
    String jenisAnjing;
    int umur;
    public Anjing(){
        this.jenisAnjing = "Buldog";
        umur  = 2;
    }
    public static void main(String[]args){
        Anjing anjing = new Anjing();
        System.out.println(anjing.jenisAnjing);
        System.out.println(anjing.umur);
    }
}
