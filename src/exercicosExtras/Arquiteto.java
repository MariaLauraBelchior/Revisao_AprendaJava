package exercicosExtras;

public class Arquiteto {
    
    public static void main(String[] args) {
        
        Double hp, lp, ha, la, qtd;

        hp = 2.6;
        lp = 1.6;
        ha = 0.35;
        la = 0.3;

        qtd = (hp * lp) / (ha * la);

        System.out.println("Quantidade de azulejos que será necessária para cobrir toda a parede:  " + qtd );
    }
}
