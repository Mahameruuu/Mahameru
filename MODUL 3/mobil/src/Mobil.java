//default constructor
//public class Mobil {
//    String warna;
//    int jmlRoda;
//    
//    public static void main(String[] args){
//        Mobil mobil = new Mobil();
//        System.out.println(mobil.warna);
//        
//        mobil.warna =  "Hitam";
//        System.out.println(mobil.warna);
//    }   
//}

//constructor tanpa parameter
//public class Mobil {
//    String warna;
//    int jmlRoda = 4;
//    int cc;
//    
//    public Mobil(){
//        warna = "putih";
//    }
//    public static void main(String[] args){
//        Mobil mobil = new Mobil();
//        System.out.println(mobil.jmlRoda);
//        System.out.println(mobil.warna);
//    }   
//}

//constructor dengan parameter
public class Mobil {
    String warna;
    int jmlRoda = 4;
    
    public Mobil(String warnaAwal, int jmlRoda){
        this.jmlRoda = jmlRoda;
        this.warna = warnaAwal;
    }
    
    public static void main(String[] args){
        Mobil mobil = new Mobil("Hitam", 4);
        System.out.println(mobil.jmlRoda);
        System.out.println(mobil.warna);
    }   
}
