public class ProdutoImportado extends Produto{
    protected String paisOrigem;
    @Override
    public double calcularPrecoTotalComImposto(){
        ProdutoEletronico produto = new ProdutoEletronico();
        produto.setPreco(100);
        return produto.calcularPrecoTotalComImposto()*1.05;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }
}
