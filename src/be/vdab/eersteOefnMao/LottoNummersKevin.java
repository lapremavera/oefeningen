package be.vdab.eersteOefnMao;

import java.util.*;
import java.util.Arrays;

public class LottoNummersKevin{
    public static void main (String[] args){


        int[]getallen = new int[6];

        for(int i=0; i< getallen.length; i++){
            getallen[i]= LottoNummersKevin.pickUniqueNumber(getallen); //je mag de be.vdab.eersteOefnMao.LottoNummersKevin weglaten, omdat je al in de klasse zit)
        }
        Arrays.sort(getallen);
        System.out.print(Arrays.toString(getallen));

    }

    public static int pickUniqueNumber(int[] bestaande){
        Random r = new Random();
        int candidate = r.nextInt(42)+1;
        while (alreadyPicked (bestaande, candidate)){ //op het lichtje geklikt; create method
            candidate = r.nextInt(42)+1;
        }
        return candidate;
    }

    private static boolean alreadyPicked(int[] bestaande, int candidate) { //hier de method automatisch gecreeërd
        for(int i=0; i < bestaande.length; i++){
            if (bestaande[i] != 0 && bestaande[i]==candidate){
                return true;

           /*
            lang uitgeschreven:
           if (bestaande[i] != 0){
                if (bestaande [i]==candidate){
                    return true
                    */


                }
            }
            return false;
        }
    }
