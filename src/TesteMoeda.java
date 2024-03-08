import java.util.Scanner;

public class TesteMoeda {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Moeda moeda = new Moeda();
        System.out.println("Informe o valor em reais ($): ");
        moeda.valorReal = leitor.nextDouble();
        System.out.println("Informe a cotação do dólar de hoje: ");
        moeda.cotacaoDolar = leitor.nextDouble();
        moeda.calcularConversao();
        System.out.println(moeda.retornarCalculoConversao());
        //metodo do returno

        //System.out.println("A quantidade que você irá obter é: " + moeda.quantidadeDolar); metodo sem o
        // retorno
    }
}
