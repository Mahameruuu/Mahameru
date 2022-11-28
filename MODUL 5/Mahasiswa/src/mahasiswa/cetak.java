package mahasiswa;
import java.util.ArrayList;

public class cetak{
   public static void main(String[] args) {
       ArrayList<mahasiswa> data_mhs = new ArrayList<>();
       String  nama[] = {"M. Mahameru. A"};
       String  npm[]= {"06.2021.1.07454"};
       data_mhs.add(new mahasiswa(nama[0], npm[0]));
       for(int i=0;i<data_mhs.size();i++){
           System.out.println(data_mhs.get(i).getNama());
           System.out.println(data_mhs.get(i).getNpm());
       }
    }    
}
