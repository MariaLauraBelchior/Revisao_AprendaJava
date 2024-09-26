package dia9;

public class ProdutosMake {
    
    private String nome;
    private double preco;
    private String tipo;


    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

// nome, preco e tipo são "guardados na maleta", protegidos como private, e só podem ser acessados ou modificados com métodos específicos (getters e setters)
