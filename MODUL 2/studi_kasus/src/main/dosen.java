package main;
import main.induk;

public class dosen extends induk{
    public dosen(String nama, String nip){
        super.nama = nama;
        super.nip = nip;
    }
    @Override
    public String getNama(){
        return nama;
    }
    public String getNip(){
        return nip;
    }

}
