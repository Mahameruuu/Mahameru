import java.util.Scanner;
public class Mahasiswa {
    private String nama, npm;
    private char jenis;
    private int semester;
    public void nama(String nama, String npm, char kelamin, int semester){
        this.nama = nama;
        this.npm = npm;
        this.jenis = kelamin;
        this.semester = semester;
    }
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        Mahasiswa nama = new Mahasiswa();
        Mahasiswa npm = new Mahasiswa();
        Mahasiswa kelamin = new Mahasiswa();
        Mahasiswa semester = new Mahasiswa();
        
        System.out.print("Nama : ");
        nama.nama = in.nextLine();
        System.out.print("NPM : ");
        npm.npm = in.nextLine();
        System.out.print("Jenis Kelamin : ");
        kelamin.jenis = in.next().charAt(0);
        System.out.print("Semester : ");
        semester.semester = in.nextInt();
       
    }
}
