public interface Loja {
    void cadastra(Produto produto);
    Produto recupera(String identificador) throws ProdutoNaoEncontrado;
    void remove(String identificador);
}
