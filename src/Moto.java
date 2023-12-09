public class Moto extends CVeiculo {
    private int ano;

    public Moto(String modelo, double preco) {
        super(modelo, preco);
    }

    @Override
    public double getPreco() {
        return (ano >= 2008) ? preco * 1.10 : preco;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
