package dia10;

public class MakeEventoNoite extends MakeProfissional{

    @Override
    void aplicarBase() {
        System.out.println("Aplicando base de alta cobertura");
    }

    @Override
    void aplicarContorno() {
        System.out.println("Aplicando contorno em base e pó");
    }
    
}

//Aqui, tanto MakeEventoADia quanto MakeEventoANoite herdam de MaquiagemCompleta, e ambas podem usar o 
//método aplicarPrimer() diretamente. No entanto, cada uma delas deve fornecer sua própria implementação para aplicarBase() e aplicarContorno()