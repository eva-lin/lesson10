public class Multiplication {
    public static int[] multiplication(int n){
        int [] result = new int [9];
        for (int i = 0; i < 9; i++) {
            result[i] = (i+1) * n;
        }
        return result;
    }
}
