abstract public class Conta {
    protected String nome;
    protected double credito;
    protected double bonus;
    protected String moeda = "Real";
    protected char tipoDeConta;

    public Conta(String nome, double credito, double bonus, char tipoDeConta){

    }
    public void receberCredito(double credito){

    }
    public void aumentarBonus(double aumento){

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getMoeda() {
        return moeda;
    }

    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }

    public char getTipoDeConta() {
        return tipoDeConta;
    }

    public void setTipoDeConta(char tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }
}
