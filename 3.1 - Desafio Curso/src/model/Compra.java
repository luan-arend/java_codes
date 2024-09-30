package model;

public class Compra implements Comparable<Compra>{

    private String produto;
    private double valor;

    public Compra(String produto, double valor) {
        this.produto = produto;
        this.valor = valor;
    }

    public String getProduto() {
        return produto;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Produto: " + this.produto + " - Valor: R$ " + this.valor;
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.valor).compareTo(outraCompra.valor);
    }
}
