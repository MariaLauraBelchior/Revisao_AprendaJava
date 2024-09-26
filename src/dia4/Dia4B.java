package dia4;

public class Dia4B {
    public static void main(String[] args) {
        String spaces = "Hello World";

        for(int i = 0; i <=spaces.length()-1 ; i++)
            if (i % 2 == 0){
                System.out.print(spaces.charAt(i));
            }
    }
}
