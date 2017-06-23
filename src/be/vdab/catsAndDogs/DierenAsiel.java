package be.vdab.catsAndDogs;

import java.util.*;

public class DierenAsiel {


    public static void main(String[] args) {


       /* Cat[] catNameAndLife = new Cat[5];
        catNameAndLife[0]= new Cat("Garfield",9);
        catNameAndLife[1]= new Cat("Mousti",5);
        catNameAndLife[2]= new Cat("Kitty",7);
        catNameAndLife[3]= new Cat("Soso",3);
        catNameAndLife[4]= new Cat ("Felix",8);
        */

        // List catNameAndLife = new LinkedList();
        Set catNameAndLife = new HashSet();
        catNameAndLife.add(new Cat("Garfield", 9));
        catNameAndLife.add(new Cat("Mousti", 5));
        catNameAndLife.add(new Cat("Kitty", 7));
        catNameAndLife.add(new Cat("Soso", 3));
        catNameAndLife.add(new Cat("Felix", 8));


        /*catNameAndLife.set(3,new Cat ("replacement", 8));
        System.out.println(catNameAndLife.get(1));
        */

        /* mag ook
        Cat[] cats = new Cat []{
        new Cat(name:"Garfield", life:9),
        new Cat(name:"Mousti, life:5),
        ...
        new Cat (name: "Felix", life: 8)
        };



        try{
            catNameAndLife[5]= new Cat ("Z",1);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Er is geen plaats meer in het asiel");
        }
 */

    }
}
