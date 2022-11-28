package main;

import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class main {
    static ArrayList<dosen> dataDosen = new ArrayList();
    static ArrayList<akun> dataAkun = new ArrayList();
    static Scanner in = new Scanner(System.in);
    public static void main(String[]args){
        System.out.println("Selamat Datang di Program Kursus ITATS : ");
        int pil;
        dataDosen();
        do{
            System.out.println("Pilihan :");
            System.out.println("-------------------------");
            System.out.println("1. Daftar akun ");
            System.out.println("2. Login ");
            System.out.println("3. Delete Data");
            System.out.println("4. exit");
            System.out.println("-------------------------");
            System.out.print("Masukkan Pilihan : ");
            pil = in.nextInt();
            switch(pil){
                case 1 :
                    daftar_akun();
                    break;
                case 2 : 
                    System.out.print("NPM : ");
                    String npm = in.next();
                    System.out.print("Password : ");
                    String password = in.next();
                    view(npm, password);
                    break;
                case 3: 
                    if(dataAkun.isEmpty() == true){
                        System.out.println("Tidak ada data !");
                        String nama = in.nextLine();
                    }
                    else{
                        viewAkun();
                        System.out.println("Masukkan Nama Depan : ");
                        String nama = in.next();
                        int index = 0, flag =0;
                        for (akun data : dataAkun){
                            if (data.getNama().equals(nama)){
                                flag = 1;
                                dataAkun.remove(index);
                                break ;
                            }
                            index++;
                        }
                    if (flag==0) {
                        System.out.println("Data Tidak Di temukan");
                    }
                    }
                    break;
                case 4 : 
                    System.out.println("Terimakasih telah mengunkungi program kami");
                    break;
            }
        }while(pil != 3);
    }
    
    static void daftar_akun(){
        System.out.print("Nama : ");
        String nama = in.next();
        System.out.print("NPM : ");
        String npm = in.next();
        System.out.print("Nomor Handphone : ");
        String nomor = in.next();
        System.out.print("Password : ");
        String password  = in.next();
        System.out.print("Tanggal Lahir (mm/dd/yyyy) : ");
        Date tanggalLahir = new Date(in.next());
        System.out.print("Kelas : ");
        String kelas = in.next();
        System.out.print("Hari : ");
        String hari = in.next();
        System.out.print("Sesi : ");
        String sesi = in.next();
        System.out.print("Waktu : ");
        String waktu = in.next();
        System.out.println("------------------"); //pilih dosen
        System.out.println("List Dosen : ");
        System.out.println("------------------");
        for(int i = 0; i < dataDosen.size(); i++){
            System.out.println(i + "." + dataDosen.get(i).nama);
        }
        System.out.print("Pilih Dosen : ");
        int indexdosen = in.nextInt();
        System.out.println("------------------"); //pilih kursus
        System.out.println("List Kursus : ");
        System.out.println("------------------");
        for(int i = 0; i < listkursus.Kursus.length; i++){
            System.out.println(i + "." + listkursus.Kursus[i]);
        }
        System.out.print("Pilih Kursus : ");
        int indexkursus =  in.nextInt();
        dataAkun.add(new akun(nama, npm, nomor, password, tanggalLahir, kelas, hari, sesi, waktu,indexdosen,indexkursus));
    }
    
    static void view(String npm, String password) {
        for(int i = 0; i < dataAkun.size(); i++){
            if(npm.equals(dataAkun.get(i).getNpm()) && password.equals(dataAkun.get(i).getPassword())){
                System.out.println("--------------------------");
                System.out.println("Data Diri  : ");
                System.out.println("--------------------------");
                System.out.println("Nama : " + dataAkun.get(i).getNama());
                System.out.println("NPM : " + dataAkun.get(i).getNpm());
                System.out.println("Tanggal Lahir : " + new SimpleDateFormat("dd-mm-yyyy").format(dataAkun.get(i).getTanggalLahir()));
                System.out.println("Nomor Handphone : " + dataAkun.get(i).getNomor());
                System.out.println("Kelas : " + dataAkun.get(i).getKelas());
                System.out.println("Hari : " + dataAkun.get(i).getHari());
                System.out.println("Sesi : " + dataAkun.get(i).getSesi());
                System.out.println("Waktu : " + dataAkun.get(i).getWaktu());
                System.out.println("Nama Dosen : " + dataDosen.get(dataAkun.get(i).indexdosen).getNama());
                System.out.println("NIP Dosen : " + dataDosen.get(i).getNip());
                System.out.println("Kursus :  " + listkursus.Kursus[dataAkun.get(i).indexkursus]);
                System.out.println("---------------------------");
            }
            else{
                System.out.println("NPM atau Password anda salah");
            }
        }
    }
    
    static void dataDosen(){
        String nama[] = {"Farida", "Andy Rahcman", "Kurniawan"};
        String nip[] = {"01", "02", "03"};
        for(int i =0; i < nama.length; i++){
            dataDosen.add(new dosen(nama[i], nip[i]));
        }
    }
     
    static void viewAkun(){
        System.out.println("Data Kursus");
        System.out.println("============");
        for(akun data : dataAkun){
           System.out.println("Nama : " + data.getNama());
           System.out.println("Password :  " + data.getPassword());
           System.out.println("Nomor Handphone : " + data.getNomor());
        }
        System.out.println("============");
    }
}