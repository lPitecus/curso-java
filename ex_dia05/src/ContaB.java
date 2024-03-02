public class ContaB extends Conta implements IAtualizavel{
    public ContaB(String nome, double credito, double bonus, char tipoDeConta) {
        super(nome, credito, bonus, tipoDeConta);
        this.bonus=1.05;
    }

    @Override
    public void atualizarParaX() {
        IAtualizavel.super.atualizarParaX();
        this.tipoDeConta = 'x';
        this.credito = this.credito*2;
    }

    @Override
    public void atualizarParaY() {
        IAtualizavel.super.atualizarParaY();
        if (this.tipoDeConta=='x'){
            this.tipoDeConta = 'y';
            this.bonus *= 1.3;
        }


    }

    @Override
    public void receberCredito(double credito){
        this.credito += credito*this.bonus;
    }
    @Override
    public void aumentarBonus(double aumento) {
        this.bonus = Math.pow(this.bonus,aumento);
    }
}
