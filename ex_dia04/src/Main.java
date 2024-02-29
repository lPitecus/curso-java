import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Exercício ArrayList
        //01
        ArrayList<Carro> carros = new ArrayList<>();
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro();
        carros.add(carro1);
        carros.add(carro2);
        carros.add(carro3);

        //02
        carros.remove(0);
        System.out.println(carros);

        //03
        for (int i = 0; i < 1000; i++) {
            Carro carro = new Carro();
            carros.add(carro);
        }
        System.out.println(carros.size());
        //04
        for (int i = 0; i < 1000; i++) {
            if (i%2==0){
                Carro carro = new Carro();
                carros.add(carro);
            }
        }
        System.out.println(carros.size());


//        Carro hondaCivic = new Carro();
//        Moto x100 = new Moto();
//
//        hondaCivic.imprimirInformacoes();
//        hondaCivic.acelerar();
//        x100.acelerar();
//        x100.empinar();

        //Exercícios dia 04 - Ex04
//        Produto produtoSemImposto = new Produto();
//        produtoSemImposto.setPreco(100);
//        ProdutoEletronico produtoEletronico = new ProdutoEletronico();
//        produtoEletronico.setPreco(100);
//        produtoEletronico.setGarantia(24);
//        ProdutoImportado produtoImportado = new ProdutoImportado();
//        produtoImportado.setPreco(100);
//        produtoImportado.setPaisOrigem("Turcomenistão");
//
//
//        System.out.println("Valor Com Imposto: "+produtoSemImposto.calcularPrecoTotalComImposto());
//        System.out.println("Valor se Eletrônico: "+produtoEletronico.calcularPrecoTotalComImposto());
//        System.out.println("Valor se Importado: "+produtoImportado.calcularPrecoTotalComImposto());

        //Exercícios dia 04 - Ex05
//        CalculadoraFrete viagem = new CalculadoraFrete();
//        System.out.println(viagem.calcularFrete(100));
//        System.out.println(viagem.calcularFrete(100, 1500));
//        System.out.println(viagem.calcularFrete(900, "especial"));
//        System.out.println(viagem.calcularFrete(58.6, 995.5, "expresso"));
    }
}