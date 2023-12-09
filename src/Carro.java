public class Carro extends CVeiculo {
    private int km;

    public Carro(String modelo, double preco) {
        super(modelo, preco);
    }

    @Override
    public double getPreco() {
        return (km > 100000) ? preco * 0.92 : preco; // 8% de desconto
    }

    public void setKm(int km) {
        this.km = km;
    }
}
