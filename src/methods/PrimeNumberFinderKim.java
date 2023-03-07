package methods;

import java.util.Arrays;

public class PrimeNumberFinderKim {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(findPrimeNumbers(10, 20)));

    }

    static int[] findPrimeNumbers(int start, int end) {
        int[] primes = new int[end-start+1];
        int index = 0;
        for(int i=start; i<=end; i++){
            boolean isPrime = true;
            for(int j=2; j<i; j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes[index] = i;
                index++;
            }
        }
        int[] erg = new int[index];
        for(int i=0; i<index; i++){
            erg[i]=primes[i];
        }
        return erg;
    }

}
