package dia5;

import java.util.HashMap;

public class Maps {
    
    public static void main(String[] args) {
                // java classes no primitive
        HashMap<String, Integer> emploIds = new HashMap<>();

        emploIds.put("Mary", 12345);
        emploIds.put("Jade", 54123);

        //options that can be done

        System.out.println(emploIds);

        System.out.println(emploIds.get("Jade"));

        System.out.println(emploIds.containsKey("Mary"));
        System.out.println(emploIds.containsKey("Claire"));
        System.out.println(emploIds.containsValue(54123));

        emploIds.put("Mary", 98745);
        System.out.println(emploIds);

        emploIds.replace("luu", 1111);
        System.out.println(emploIds);

        emploIds.putIfAbsent("Claudia", 2222);
        System.out.println(emploIds);

        emploIds.remove("Claudia");
        System.out.println(emploIds);
    }
}
