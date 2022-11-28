public class BangunRuang {
    public static void main(String[] args) {
       Kubus objek_k = new Kubus();
       Balok objek_balok = new Balok();
       Lingkaran objek_lingkaran = new Lingkaran();
       
        //luas kubus
        System.out.println("---------------------------------");
        System.out.println("Rumus Luas Kubus");
        System.out.println("---------------------------------");
        System.out.println("Sisi : " + objek_k.sisi);
        System.out.println("Luas Kubus : " + objek_k.luas);
        
        //luas Balok
        System.out.println("---------------------------------");
        System.out.println("Rumus Luas Balok");
        System.out.println("---------------------------------");
        System.out.println("Panjang : "+ objek_balok.panjang);
        System.out.println("Lebar : " +  objek_balok.lebar);
        System.out.println("Luas Balok : " + objek_balok.luas);
        
        //luas Lingkaran
        System.out.println("---------------------------------");
        System.out.println("Rumus Luas Lingkaran ");
        System.out.println("----------------------------------");
        System.out.println("Phi ; "+objek_lingkaran.phi);
        System.out.println("Jari-jari : "+objek_lingkaran.r);
        System.out.println("Luas Lingkaran : " + objek_lingkaran.luas);
    }
}
class Kubus{
    int sisi = 6;
    int luas = sisi*sisi;
}
        
class Balok{
    int panjang = 6, lebar = 4;
    int luas = panjang*lebar;
}
    
class Lingkaran{
    int r = 6;
    double phi = 3.14;
    double luas = phi*r*r;
}
