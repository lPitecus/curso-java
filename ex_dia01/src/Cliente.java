public class Cliente {
    String nome;
    String email;
    double dinheiro;
    public String obterNome(){
        return nome;
    }
    public String obterEmail(){
        return email;
    }
    public double obterDinheiro(){
        return dinheiro;
    }
    public void comprarLivro(Livro livro){
        if (this.dinheiro > livro.preco){
            System.out.print("\n\nCompra Efetuada!");
        }
        else {
            System.out.print("\n\nNão há Dinheiro Suficiente");
        }
    }
    public void mudarNome(String nome){
        this.nome = nome;
    }
    public void mudarEmail(String email){
        this.email = email;
    }
    public void mudarDinheiro(double dinheiro){
        this.dinheiro = dinheiro;
    }
}
