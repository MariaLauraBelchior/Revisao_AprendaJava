package dia5;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayvsArrayList {
    public static void main(String[] args) {
        String[] friendArray = {"João", "Caio", "Erica", "Lucas"};

        ArrayList<String> friendArrayList = 
            new ArrayList<>(Arrays.asList("João", "Caio", "Erica", "Lucas"));

        //get element
        System.out.println(friendArray[1]);
        System.out.println(friendArrayList.get(1));

        //get size
        System.out.println(friendArray.length);
        System.out.println(friendArrayList.size());
    
        //add an element - can only be done with arrayList
        friendArrayList.add("Maria");
        System.out.println(friendArrayList.get(4));

        //set an element
        friendArray[0] = "Caitano";
        System.out.println(friendArray[0]);
        friendArrayList.set(0, "Caitano");
        System.out.println(friendArrayList.get(0));

        //remove an element - can only be done with arrayList
        friendArrayList.remove("Caio");
        System.out.println(friendArrayList.get(1));
    
        //print
        System.out.println(friendArray);
        System.out.println(friendArrayList);


        //you know the winner 
    }
}
