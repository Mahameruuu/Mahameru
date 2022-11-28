import java.util.Scanner;

class kalkulator{

    private static float b;
    public static float penjumlahan(float a, float b){
        return a+b;
    }
    public static float pengurangan(float a, float b){
        return a-b;
    }
    public static float perkalian(float a, float b){
        return a*b;
    }
    public static float pembagian(float a, float b){
        return a/b;
    }
}

public class Kalkulator_Asistesi_Modul_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //deklarasi
        int ulang;
        float x, y, pangkat;
        int pilih;
        
        //perulangan
        do{ 
        //pilih menu kalkulator
        System.out.println("Menu Kalkulator");
        System.out.println("-----------------------");
        System.out.println("1. PENJUMLAHAN ");
        System.out.println("2. PENGURANGAN ");
        System.out.println("3. PERKALIAN ");
        System.out.println("4. PEMBAGIAN ");
        System.out.println("5. KUADRAT ");
        System.out.print("Masukkan  Menu Pilihan : ");
        pilih = in.nextInt();
        switch(pilih){
            case 1 : 
                System.out.print("Masukkan Bilangan pertama : ");
                x = in.nextFloat();
                System.out.print("Masukkan Bilangan Kedua : ");
                y = in.nextFloat();
                float tambah = kalkulator.penjumlahan(x, y);
                System.out.println("Penjumlahan : " + tambah);
                break;
            case 2 : 
                System.out.print("Masukkan Bilangan pertama : ");
                x = in.nextFloat();
                System.out.print("Masukkan Bilangan Kedua : ");
                y = in.nextFloat();
                float kurang = kalkulator.pengurangan(x, y);
                 System.out.println("Pengurangan : " + kurang);
                break;
            case 3 : 
                System.out.print("Masukkan Bilangan pertama : ");
                x = in.nextFloat();
                System.out.print("Masukkan Bilangan Kedua : ");
                y = in.nextFloat();
                float kali = kalkulator.perkalian(x, y);
                System.out.println("Pengurangan : " + kali);
                break;
            case 4 : 
                System.out.print("Masukkan Bilangan pertama : ");
                x = in.nextFloat();
                System.out.print("Masukkan Bilangan Kedua : ");
                y = in.nextFloat();
                float bagi = kalkulator.pembagian(x, y);
                System.out.println("Pembagian : " + bagi);
                break;
            case 5 : 
                System.out.print("Masukkan Bilangan pertama : ");
                x = in.nextFloat();
                System.out.print("Masukkan Pangkat : ");
                pangkat = in.nextFloat();
                
                int hasil = (int) Math.pow(x, pangkat);
                System.out.println("Kuadrat : " + hasil);
                break;
            default : 
                System.out.println("Pilihan tidak ditemukan");
                break;
        }
            System.out.println("Apakah Anda ingin mengulang : (Jika iya klik angka 1)");
            ulang = in.nextInt();
    }while(ulang == 1);
        }
    }