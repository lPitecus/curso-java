import java.util.ArrayList;

public class GrupoDeAmigos {
    public int numDePessoas;
    public double idadeMedia;
    public Pessoa amigoMaisVelho;


    public void setNumDePessoas(ArrayList<Pessoa> lista) {
        this.numDePessoas = lista.size();

    }
    public int getNumDePessoas(){
        return numDePessoas;
    }

    public void setIdadeMedia(ArrayList<Pessoa> lista) {
        int soma_idades = 0;
        for (Pessoa pessoa : lista){
            soma_idades += pessoa.getIdade();
        }
        this.idadeMedia = (double) soma_idades /lista.size();
    }
    public double getIdadeMedia(){
        return idadeMedia;
    }

    public void setAmigoMaisVelho(ArrayList<Pessoa> lista) {
        Pessoa mais_velho = lista.getFirst();
        for (Pessoa pessoa: lista){
            if (pessoa.getIdade()>mais_velho.idade){
                mais_velho = pessoa;
            }
        }
        this.amigoMaisVelho = mais_velho;
    }
    public Pessoa getAmigoMaisVelho(){
        return amigoMaisVelho;
    }
}
