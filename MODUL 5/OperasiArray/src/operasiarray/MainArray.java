package operasiarray;
class MainArray{
    public static void main(String[] args) {
        int[] array = {2, 0, 2, 1, 1, 0, 7, 4, 5, 4};
        
        OperasiArray oArray;
        oArray = new OperasiArray(array);
        for(int i =0;i < array.length;i++){
            System.out.println(array[i]);
        }
        System.out.println(oArray.totalAngka());
        System.out.println(oArray.rerataAngka());
    }
}