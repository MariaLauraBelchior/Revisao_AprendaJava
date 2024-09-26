package dia9;

import dia10.Make;

public class MakeDia2s implements Make{
    
    @Override
    public void aplicarBatom(){
        System.out.println("Aplicando batom rosado");
    }

    @Override
    public void aplicarBase() {
        System.out.println("Aplicando base tint");
    }

    @Override
    public void aplicarRimel() {
        System.out.println("Aplicando Rimel");
    }
    
    //Aqui, ambas as classes (MaquiagemDiaADia) implementam a interface Make
    // mas cada uma define o que significa "aplicar base" e "aplicar batom" de formas diferentes.
}
