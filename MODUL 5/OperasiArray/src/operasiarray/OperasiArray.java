package operasiarray;
public class OperasiArray {
    int[] arrayAngka;
    public OperasiArray(int[] arrayAngka){
        this.arrayAngka = arrayAngka;
    }
    public float totalAngka(){
        float total = 0;
        for(int i=0;i<arrayAngka.length;i++){
            total += arrayAngka[i];
        }
        return total;
    }
    public double rerataAngka(){
        return totalAngka()/arrayAngka.length;
    }
}
