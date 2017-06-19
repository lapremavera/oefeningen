public class Priemgetallen {
    public static void main (String [] arg){

        for (int i = 1 ; i < 100; i++){
            if (Priemgetallen.isPrimeNumber (i)){
                System.out.println(i);


            }
        }
    }
    public static boolean isPrimeNumber(int n){
        if (n <2){
            return false;
        } else {
            int deler = 2;
            while (deler < n -1){
                int rest = n % deler; // 10mod3=1; in Java 10%3=1
                if (rest ==0){
                    return false;
                }
                deler++;
            }

        }
        return true;
    }
}