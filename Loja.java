public interface Loja {
    void cadastra(Produto produto);
    Produto recupera(String identificador);
    void remove(String identificador);
}
