package main;
import main.induk;
import java.util.Date;

public class akun extends induk{
    public akun(String nama, String npm, String nomor, String password, Date tanggalLahir, String kelas, String hari, String sesi, String waktu, int indexdosen, int indexkursus) {
        super.nama = nama;
        super.npm = npm;
        super.nomor = nomor;
        super.password = password;
        super.kelas = kelas;
        super.hari = hari;
        super.sesi = sesi;
        super.waktu = waktu;
        super.tanggalLahir = tanggalLahir;
        super.indexdosen = indexdosen;
        super.indexkursus = indexkursus;
    }
    @Override
    
    public String getNama() {
        return super.getNama();
    }
    public void setNama(){
        this.nama = nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String getNpm() {
        return super.getNpm();
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    @Override
    public String getNomor() {
        return super.getNomor();
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getKelas() {
        return super.getKelas();
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    @Override
    public String getHari() {
        return super.getHari();
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    @Override
    public String getSesi() {
        return super.getSesi();
    }

    public void setSesi(String sesi) {
        this.sesi = sesi;
    }

    @Override
    public String getWaktu() {
        return super.getWaktu();
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    @Override
    public Date getTanggalLahir() {
        return super.getTanggalLahir();
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    @Override
    public int getIndexdosen() {
        return super.getIndexdosen()
                ;
    }

    public void setIndexdosen(int indexdosen) {
        this.indexdosen = indexdosen;
    }

    @Override
    public int getIndexkursus() {
        return super.getIndexkursus();
    }

    public void setIndexkursus(int indexkursus) {
        this.indexkursus = indexkursus;
    }
}