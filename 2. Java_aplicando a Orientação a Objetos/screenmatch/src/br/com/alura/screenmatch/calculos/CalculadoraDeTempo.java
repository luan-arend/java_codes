package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    // EXEMPLO DE POLIMORFISMO
    public void inclui(Titulo t){
        this.tempoTotal += t.getDuracaoEmMinutos();
    }

}
