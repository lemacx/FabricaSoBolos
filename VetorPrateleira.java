import java.util.List;
import java.util.ArrayList;

public class VetorPrateleira implements IPrateleira{
    protected List<IBolo> prateleira;

    public VetorPrateleira(int tamanho){
        prateleira = new ArrayList<> (tamanho);
    }

    public boolean existe(IBolo bolo) {
        for (IBolo item : this.prateleira) {
            if (item.codigo() == bolo.codigo) {
                return true;
            }
        }
        return false;
    }
    public void inserir(IBolo bolo) {
        if (this.existe(bolo)) {
            System.out.println("Bolo já cadastrado.");
        } else {
            prateleira.add(bolo);
        }
    }

    public IBolo remover(IBolo bolo) {
        for (IBolo item : this.prateleira) {
            if (bolo.equals(item)) {
                this.prateleira.remove(item);
                return item;
            }
        }
        System.out.println("Bolo inexistente.");
        return null;
    }
    
    public IBolo remover(int posicao) {
        if (posicao < 0 || posicao >= this.prateleira.size())
            System.out.println("Bolo inexistente.");
        return prateleira.remove(posicao);
    }
    
    public List<IBolo> listar(char tipoDoBolo) {
        List<IBolo> bolos;
        for (IBolo item : this.prateleira) {
            if (item instanceof BoloSimples && tipoDoBolo == 'S') {
                bolos.add(item);
            } else if (item instanceof Torta && tipoDoBolo == 'T') {
                bolos.add(item);
            }
        }
        return bolos;
    }
}