public class Computador extends ProdutoAbs implements Produto {
    public Computador (String novoModelo, double novoValor, String novoIdentificador, String novaDescricao ){
        super(novoModelo,  novoValor,  novoIdentificador, novaDescricao);
    }

    public String toString() {
        return "Modelo: " + getModelo() +" Valor: " + getValor() + " Id: " + getIdentificador() + " Descrição: " + getDescricao();
    }
}