package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CreditCard {
    private double limite;
    private double saldo;
    private List<Compra> compras;

    public CreditCard(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public boolean lancaCompra(Compra compra){
        if(this.saldo >= compra.getValor()){
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true;
        }
        return false;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void imprimir(){
        System.out.println("****************************");
        System.out.println("Saldo do cartao: " + this.saldo);
        System.out.println("****************************");
        System.out.println("");
        Collections.sort(this.compras);
        for(Compra item : compras){
            System.out.println(item.toString());
        }
    }
}
