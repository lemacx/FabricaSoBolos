import Bolo;

public class Torta extends Bolo {
    private boolean recheio;
    private boolean cobertura;

    public Torta(int codigo, double custo, IFormato formato) {
        super(codigo, custo, formato);
        recheio = true;
        cobertura = true;
    }

    public Torta(int codigo, double custo, IFormato formato, boolean recheio, boolean cobertura) {
        super(codigo, custo);
        this.recheio = recheio;
        this.cobertura = cobertura;
    }

    public preco() {
        double preco = formato.area() + getCusto();
        if (recheio) {
            preco += 12.5;
        }

        if (cobertura) {
            preco += 20.0;
        }
        return preco;
    }

    @Override
    public String toString() {
        String recheioString;
        String coberturaString;
        if (recheio) {
            recheioString = "com recheio";
        } else {
            recheioString = "sem recheio";
        }

        if (cobertura) {
            coberturaString = "com cobertura";
        } else {
            coberturaString = "sem cobertura";
        }

        return super.toString() + " torta " + recheioString + ", " + coberturaString;
    }
}
