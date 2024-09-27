package dia11;

public class Exececao {
    public static void main(String[] args) {

        try {
            int[] vetor = new int[4];

            System.out.println("Antes da exception");

            vetor[4] = 1;

            
        } catch (  ArrayIndexOutOfBoundsException  exception) {
            System.out.println("Exceção ao acessar um indice que não existe");
        }

        System.out.println("Esse texto será impresso após a exception");
    }
}
