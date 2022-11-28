public class Kucing{
    String jenisKucing;
    int umur;
    public Kucing(String jenis, int umurr){
        this.jenisKucing = jenis;
        this.umur = umurr;
    }
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Anggora", 4);
        System.out.println(kucing.jenisKucing);
        System.out.println(kucing.umur);
    }
}
