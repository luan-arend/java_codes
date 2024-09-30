import model.Compra;
import model.CreditCard;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o limite do seu cartao: ");
        double limiteCartao = leitura.nextDouble();
        var cartaoDeCredito = new CreditCard(limiteCartao);

        int sair = 1;
        while (sair != 0) {
            System.out.println("Digite a descricao da compra: ");
            String descricao = leitura.next();

            System.out.println("Digite o valor da compra: ");
            double valorDaCompra = leitura.nextDouble();

            if(valorDaCompra > cartaoDeCredito.getSaldo()) {
                System.out.println("Limite insuficiente");
                sair = 0;
            }
            else {
                cartaoDeCredito.lancaCompra(new Compra(descricao,valorDaCompra));
            }
        }

        cartaoDeCredito.imprimir();
    }
}