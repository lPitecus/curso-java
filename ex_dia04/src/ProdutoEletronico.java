public class ProdutoEletronico extends Produto{
    protected int garantia;
    @Override
    public double calcularPrecoTotalComImposto(){
        return (this.preco*1.1)+100;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }
}
