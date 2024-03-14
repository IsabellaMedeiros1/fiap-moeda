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
//System.out.println("A quantidade que você irá obter é: " + moeda.quantidadeDolar); metodo sem o retorno

        System.out.println(moeda.comprarDolar("5449796", "Isabella"));
        System.out.println("_____________________");

        String nome, cpf;
        Scanner leitorTexto = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        nome = leitorTexto.nextLine();
        System.out.println("Informe seu cpf: ");
        cpf = leitorTexto.nextLine();
        Moeda moeda2 = new Moeda();
        System.out.println("Informe a cotaçõão: ");
        moeda2.cotacaoDolar = leitor.nextDouble();
        System.out.println("Informe o valor em reais: ");
        moeda2.valorReal = leitor.nextDouble();
        System.out.println("O valor que você vai ter é: " + moeda2.retornarCalculoConversao());


    }
}
