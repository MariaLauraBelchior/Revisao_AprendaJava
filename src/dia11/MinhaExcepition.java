package dia11;

public class MinhaExcepition {
    public static void main(String[] args) throws DivisaoQuebrada {
        int[] numeros = {4,8,16,32,64,128};

        int[] denom = {2,0,4,8,0,2,4};

        for(int i=0; i<numeros.length; i++){
            try{
                if(numeros[i] % 2 != 0){
                    throw new DivisaoQuebrada(numeros[i], denom[i]);
                }
                System.out.println(numeros[i] + "/" + denom[i] + "=" + (numeros[i]/denom[i]));
            }
            catch(ArithmeticException | ArrayIndexOutOfBoundsException | DivisaoQuebrada e){
                System.out.println("Ocorreu um erro");
                e.printStackTrace();
            }
        }   
    }
}
