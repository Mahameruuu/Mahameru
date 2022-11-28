package inputprogram;
import java.util.Scanner;
public class InputProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nomor : ");
        int num = input.nextInt();
        input.nextLine();
        System.out.println("Masukkan Kata : ");
        String kata = input.nextLine();
    }
    
}
