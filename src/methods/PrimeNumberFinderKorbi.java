package methods;

import java.util.ArrayList;

public class PrimeNumberFinderKorbi {

    public static ArrayList<Integer> findPrimeNumbers(int start, int end){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if(isPrime(i)){
                list.add(i);
            }
        }
        return list;
    }

    private static boolean isPrime(int number){
        for (int j = 2; j < number; j++) {
            if(number % j == 0){
                return false;
            }
        }
        return true;
    }
}
