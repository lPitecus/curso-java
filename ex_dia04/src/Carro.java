public class Carro extends Veiculo{
    protected int numPortas = 4;

    private void ligar(){
        System.out.println("O carro está ligando.");
    }

    public Carro() {
    }

    @Override
    public void acelerar() {
        System.out.println("Sou um carro e estou acelerando vruuuum");
        System.out.println(
                "                         ######################                  \n" +
                "                       ##########################                \n" +
                "                       ############################              \n" +
                "                     ######      ####        ########            \n" +
                "                     ######      ####          ########          \n" +
                "                   ########      ####            ######          \n" +
                "                   ##########################################    \n" +
                "                 ################################################\n" +
                "               ##################################################\n" +
                "               ##################################################\n" +
                "               ##################################################\n" +
                "               ##################################################\n" +
                "          ~~~~~############  ######################    ##########\n" +
                "     ~~~~~~~~~~##########      ##################        ########\n" +
                "                     ####      ####          ####        ####    \n" +
                "                     ######  ######            ######  ######    \n" +
                "                       ############            ############      \n" +
                "                         ######                  ########        \n" +
                "                                                  \n" +
                "                                                  \n" +
                "                                                  ");
    }
    @Override
    public void imprimirInformacoes(){
        super.imprimirInformacoes();
        System.out.println("Sou um carro de "+this.numPortas+" portas");
    }
}
