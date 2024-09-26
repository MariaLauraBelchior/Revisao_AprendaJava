package dia5;

public class EnumTutorial {
    public static void main(String[] args) {
    
        DiasDaSemana dia = DiasDaSemana.DOMINGO;

        if(dia == DiasDaSemana.DOMINGO){
            System.out.println("Ah não ta chegando segunda! ");
        }
        
        for (DiasDaSemana mDia : DiasDaSemana.values()){
            System.out.println(mDia);
        } //retorna um array com todos os dias
    }
    
}
