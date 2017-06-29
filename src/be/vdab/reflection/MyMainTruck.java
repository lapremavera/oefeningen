package be.vdab.reflection;


import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MyMainTruck {
    public static void main(String[] args) {

        Truck c = new Truck("V60","Volvo");
        Class clazz= c.getClass();                  //eigenlijk is het class<Truck>clazz

        System.out.println(clazz.getName());        //volledige naam, voor- en achternaam
        System.out.println(clazz.getSimpleName());  //alleen de voornaam

        System.out.println(c);

        Field[] fa = clazz.getDeclaredFields();
            for (int i =0; i< fa.length; i++){
                Field f = fa[i];
                System.out.println("De gebruikte naam is: "+fa[i].getName());
                System.out.println("De variabele is: "+fa[i].getType().getSimpleName());
            }
        Method[] m = clazz.getMethods();
        for (int i =0; i< m.length; i++){
            System.out.println("De gebruikte methods is: "+m[i].getName());
            System.out.println("Het gebruikte returntype is: "+m[i].getReturnType().getSimpleName());
        }

        }




    }

