public class Moeda {
    public double valorReal;
    public double cotacaoDolar;
    public double quantidadeDolar;

    public void calcularConversao(){
        this.quantidadeDolar = this.valorReal/this.cotacaoDolar;
    }

    /*no metodo sem retorno fz um calculo e guardou na memoria, quando tem retorno significa q vai chamar o
    metodo ele vai fazer algo e tem q devolver esse algo, do tipo do retoro (pode devolver objeto,
    string, int, double. Void é sem retorno faz la e não devolve*/
    public double retornarCalculoConversao(){
        double dolar = this.valorReal/this.cotacaoDolar;
        return dolar;
    }

}
