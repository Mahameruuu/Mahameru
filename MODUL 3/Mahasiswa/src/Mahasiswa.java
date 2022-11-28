public class Mahasiswa {
    String namaMhs, npm;
    public Mahasiswa(){
        namaMhs = "Agus";
        npm = "06.2021.1.09876";
    }
    public Mahasiswa(String namaMhs, String npm){
        this.namaMhs = namaMhs;
        this.npm = npm;
    }
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        System.out.println(mhs.namaMhs);
        System.out.println(mhs.npm);
    }
    
}
