package dia6;

public class Cars {

    private String marca;
    private String modelo;
    private int ano;
    private int valor;
    private int taxa;


    public Cars(String marca, String modelo, int ano, int valor, int taxa ) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
        this.taxa = taxa;
        
    }

    public double valorVenda(){
        double valorFinal =  (valor * 0.1) + valor;
        return valorFinal;

    }


    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public int getAno() {
        return ano;
    }


    public void setAno(int ano) {
        this.ano = ano;
    }


    public int getValor() {
        return valor;
    }


    public void setValor(int valor) {
        this.valor = valor;
    }


    public int getTaxa() {
        return taxa;
    }


    public void setTaxa(int taxa) {
        this.taxa = taxa;
    }

    
    


}
