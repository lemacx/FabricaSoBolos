import java.util.List;

public interface IPrateleira {
    int buscar (IBolo);
    boolean cheia();
    boolean vazia();
    boolean existe(IBolo bolo);
    boolean inserir(IBolo bolo);
    IBolo remover(IBolo bolo);
    IBolo remover(int posicao);
    IBolo consultar(IBolo bolo);
    List<IBolo> listar();
    List<IBolo> listar(char tipoDoBolo);
}
