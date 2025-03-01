import Bolo;

public class BoloSimples extends Bolo {
    private boolean semLactose;

    public BoloSimples (int codigo, double custo, IFormato formato){
        super(codigo, custo, formato);
        semLactose = false;
    }
    public BoloSimples (int codigo, double custo, IFormato formato, boolean semLactose){
        super(codigo, custo, formato);
        this.semLactose = semLactose;
    }

    public double preco() {
        if (semLactose) {
            return formato.area() * getCusto() + 35.0;
        } else {
            return formato.area() * getCusto();
        }
    }
    @Override
    public String toString(){
        String semLactoseString;
        if (semLactose) {
            semLactoseString = "Sem lactose";
        } else {
            semLactoseString = "Com lactose";
        }
        return super.toString() + " bolo simples " + semLactoseString;
    }
}
