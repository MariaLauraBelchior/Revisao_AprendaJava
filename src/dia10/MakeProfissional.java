package dia10;

public abstract class MakeProfissional {
    void aplicarSerum() {
        System.out.println("Aplicando serum");
    }

    void aplicarPrimer() {
        System.out.println("Aplicando primer fixador");
    }

    abstract void aplicarBase();
    abstract void aplicarContorno();
}

// as classes que herdam essa classe abstrata terão a opção de usar o método aplicarPrimer() diretamente, mas devem fornecer suas próprias implementações para
// aplicarBase() e aplicarContorno().
