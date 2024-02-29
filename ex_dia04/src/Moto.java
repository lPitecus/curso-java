public class Moto extends Veiculo{
    public void empinar(){
        System.out.println("A moto está empinando");
    }
    @Override
    public void acelerar() {
        System.out.println("Sou uma moto e estou acelerando vruuuum");
        System.out.println("                                                  \n" +
                "                          ##  ##                  \n" +
                "                                ##                \n" +
                "                                  ##  ##          \n" +
                "                              ##########          \n" +
                "      ##################################          \n" +
                "    ##################################            \n" +
                "                  ##################    ##        \n" +
                "    ############  ######################  ######  \n" +
                "  ####        ####  ##################  ##    ####\n" +
                "  ##            ##    ##########  ##    ##      ##\n" +
                "  ##      ######    ##########  ####    ##      ##\n" +
                "  ##      ######    ########    ####            ##\n" +
                "  ##            ##                ##            ##\n" +
                "  ####        ####                ####        ####\n" +
                "    ############                    ############  ");
    }
}
