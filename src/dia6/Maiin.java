package dia6;

public class Maiin {

    public static void main(String[] args) {

        Cars car = new Cars("BMW", "X6", 2006, 125000, 10);
        
        

        System.out.println(car.getMarca());
        System.out.println(car.getModelo());
        System.out.println(car.getAno());
        System.out.println("Valor da venda: " + car.valorVenda());


        /*Clients c001 = new Clients();
        c001.firstName = "Andre";
        c001.age = 24;

        Clients c002 = new Clients();
        c002.firstName = "Carme";
        c002.age = 65;

        c002.newAccount(); // chama o metodo da classe cliente e executa o que está lá*/
    }

}
