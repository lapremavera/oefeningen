import java.lang.reflect.Array;
import java.util.*;
import java.util.Arrays;
import java.util.function.BinaryOperator;

public class LottoNummers{
    public static void main (String []args){



        int[] nummers = new int[6];
        System.out.println(Arrays.toString(nummers));


            Random r = new Random();
            for(int y=0; y < nummers.length; ++y){
                int getal = r.nextInt(6);
                nummers[y] = getal;



            }
            Arrays.sort(nummers);

            System.out.println(Arrays.toString(nummers));



        }




    }
