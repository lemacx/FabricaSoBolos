public abstract class Bolo implements IBolo{
    protected int codigo;
    protected double custo;
    protected IFormato formato;

    public Bolo(int codigo, double custo){
        this.codigo = codigo;
        this.custo = custo;
    }

    public Bolo(int codigo, double custo, IFormato formato){
        this.codigo = codigo;
        this.custo = custo;
        this.formato = formato;
    }

    public int getCodigo(){
        return codigo;
    }

    public double getCusto(){
        return custo;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) {
        return true;
        }
        if (o == null || getClass() != o.getClass()) {
        return false;
        }
        Bolo b = (Bolo) o;
        return (this.codigo == b.codigo);
    }

    @Override
    public String toString(){
        return "Código " + codigo + ", Custo: R$" + custo; 
    }
}