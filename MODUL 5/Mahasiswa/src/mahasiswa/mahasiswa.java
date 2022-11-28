package mahasiswa;

public class mahasiswa{
    private String nama;
    private String npm;
    public mahasiswa(String nama, String npm){
        this.nama = nama;
        this.npm = npm;
    }
    public String getNama(){
        return nama;
    }
    public String getNpm(){
        return npm;
    }
}