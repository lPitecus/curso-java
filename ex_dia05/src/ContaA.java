public class ContaA extends Conta implements IContaInternacional, IAtualizavel{
    public ContaA(String nome, double credito, double bonus, char tipoDeConta) {
        super(nome, credito, bonus, tipoDeConta);
        this.bonus = 1.25;
    }
    @Override
    public void atualizarParaX(){
        IAtualizavel.super.atualizarParaX();
        this.tipoDeConta = 'x';
        if (this.credito>2000){
            this.bonus = 1.5;
        }
    }

    @Override
    public void atualizarParaY() {
        IAtualizavel.super.atualizarParaY();
        this.tipoDeConta = 'y';
        if (this.credito>3000){
            aumentarBonus(1.12);
        }
    }

    public void converterParaDolar(double cambio){
        this.moeda = "Dólar";
        this.credito *= cambio;
    }
    @Override
    public void receberCredito(double credito){
        if (credito>1000){
            this.credito += credito*this.bonus;
        }
        else {
            this.credito += credito;
        }
    }

    @Override
    public void aumentarBonus(double aumento) {
        this.bonus *= aumento;
    }
}
