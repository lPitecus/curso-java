public class CalculadoraFrete {
    public double calcularFrete(double peso){
        return peso*0.75;
    }
    public double calcularFrete(double peso, String tipoServico){
        if (tipoServico.equals("expresso")){
            return (peso*0.75) + 20;
        }
        else if (tipoServico.equals("especial")) {
            return (peso * 0.75) + 10;
        }
        else{
            return 0.0;
        }
    }
    public double calcularFrete(double peso, double distancia){
        return peso*0.75 + (distancia/100)*5;
    }
    public double calcularFrete(double peso, double distancia, String tipoServico){
        if (tipoServico.equals("expresso")){
            return (peso*0.75) + 20 + (distancia/100)*5;
        }
        else if (tipoServico.equals("especial")) {
            return (peso * 0.75) + 10 + (distancia/100)*5;
        }
        else{
            return 0.0;
        }
    }
}
