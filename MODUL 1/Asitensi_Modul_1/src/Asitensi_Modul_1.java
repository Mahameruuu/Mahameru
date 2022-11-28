class persegi_panjang{
    int panjang;
    int lebar;
    
    void luas(){
        int luas = this.panjang*this.lebar;
        System.out.println("Luas Pesergi Panjang : " + luas);
    }
    void kelilng(){
        int keliling = 2*(this.panjang+this.lebar);
        System.out.println("Keliling Persegi Panjang : " + keliling);
    }
}
class segitiga{
    int alas;
    int tinggi;
    void luas(){
        int luas = this.alas*this.tinggi/2;
        System.out.println("Luas Segitiga : " + luas);
    }
    
}
class persegi{
    int s;
    void luas(){
        int luas = s*s;
        System.out.println("Luas Persegi : " + luas);
    }
    void keliling(){
        int keliling = 4*s;
        System.out.println("Keliling Persegi : " + keliling);
    }
}

class aritmatika{
    public static int penjumlahan(int a, int b){
        return a+b;
    }
}
public class Asitensi_Modul_1 {
    public static void main(String[] args) {
        
        int x = 4;
        int y = 4;
        int s = aritmatika.penjumlahan(x, y);
        
        persegi_panjang rumus_pp = new persegi_panjang();
        segitiga rumus_tiga =  new segitiga();
        persegi rumus_persegi = new persegi();
        
        //pemanggilan Persegi Panjang
        rumus_pp.panjang = 6;
        rumus_pp.lebar = 4;
        rumus_pp.luas();
        rumus_pp.kelilng();
        System.out.println("---------------------------");
      
        //pemanggilan segitiga
        rumus_tiga.alas = 5;
        rumus_tiga.tinggi = 10;
        rumus_tiga.luas();
        System.out.println("---------------------------");
        
        //pemanggilan persegi
        rumus_persegi.s = 4;
        rumus_persegi.luas();
        rumus_persegi.keliling();
        System.out.println("--------------------------");
        
        //pemanggilan aritmatika
        System.out.println("Periode Pratikum PBO ke - " + s);
    }
}
