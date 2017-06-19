/*
pi = 4 * (1-1/3+1/5-1/7+1/9-...)
wat zie je? 1/n
n+2
+ en- alternerend
 */

public class CalculatePi{
    public static void main (String []args){

        int max= 10000;
        int sign = 1;
        double sum =0;
        for (int n =1; n <= max; n +=2){
            sum +=sign * (1.0/n);
            System.out.printf ("n =%d, sign =%d\n", n, sign); // \n -> nieuwe lijn
            sign *= -1;

        }
        double closeToPi = 4 * sum;
        System.out.println("Pi = " + closeToPi);


    }
}