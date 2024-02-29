public class Produto {
    protected double preco;

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double calcularPrecoTotalComImposto(){
        return this.preco*1.02;
    }
}
