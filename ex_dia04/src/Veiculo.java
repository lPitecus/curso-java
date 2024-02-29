public class Veiculo {
    protected String marca = "Honda";
    protected int ano = 2012;

    public void acelerar(){
        System.out.println("O"+getClass().getName()+"está acelerando vruuuum");
    }

    public void imprimirInformacoes(){
        System.out.println(
                "Nome do Veículo: "+this.marca+
                "\nAno de Lançamento: " +this.ano
        );
    }

}
