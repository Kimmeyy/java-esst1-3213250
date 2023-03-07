package arrays;

public class ArithmeticMeanKim {

    public static void main(String[] args) {

        int[] array = {1,2,3,5, 6, 1, 2, 5, 6};
        int arithmeticMean = 0;
        for (int i : array) {
            arithmeticMean = arithmeticMean+i;
        }
        arithmeticMean = arithmeticMean/(array.length);
        System.out.println(arithmeticMean);

    }
}
