package dia2;

import java.util.Arrays;

public class Dia2 {
    public static void main(String[] args) {
        int[] array1 = {
            1789, 2033, 1899, 1456, 2013,
            1458, 2458, 1254, 1472, 2365,
            1456, 2165, 1457, 2456, 2408};

        String[] array2 = {
            "Java",
            "Python",
            "PHP",
            "C++",
            "JavaScript",
            "Ruby",
        };
        

        System.out.println(Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
        
        System.out.println(Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
    }

}
