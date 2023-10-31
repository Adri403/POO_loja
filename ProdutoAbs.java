public abstract class ProdutoAbs implements Produto {
    private double valor;
    private String modelo;
    private String cor;
    private String identificador;
    private String descricao;

    public ProdutoAbs(String novoModelo, String novaCor, double novoValor, String novoIdentificador, String novaDescricao ){
        this.valor = novoValor;
        this.modelo = novoModelo;
        this.cor = novaCor;
        this.identificador = novoIdentificador;
        this.descricao = novaDescricao;
    }
    public ProdutoAbs(String novoModelo, double novoValor, String novoIdentificador, String novaDescricao ){
        this.valor = novoValor;
        this.modelo = novoModelo;
        this.identificador = novoIdentificador;
        this.descricao = novaDescricao;
    }
        public double getValor(){
            return valor;
        }
    
        public String getModelo(){
            return modelo;
        }
        
        public String getCor(){
            return cor;
        }
    
        public String getIdentificador(){
            return identificador;
        }

        public String getDescricao(){
            return descricao;
        }
    
        public void setValor(double novoValor) {
            this.valor = novoValor;
        }
    
        public void setModelo(String novoModelo) {
            this.modelo = novoModelo;
        }
    
        public void setCor(String cor) {
            this.cor = cor;
        }
    
        public void setIdentificador(String identificador) {
            this.identificador = identificador;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }
    
        public String toString() {
            return "Modelo: " + getModelo() + "\nCor: " + getCor() + "\nValor: " + getValor() + "\nid: " + getIdentificador() + "\nDescrição: " + getDescricao();
        }
    
        public boolean equals(Object obj) {
            if (obj instanceof ProdutoAbs) {
                ProdutoAbs p = (ProdutoAbs) obj;
                if (p.toString().equals(this.toString()))
                return true;
            }
            return false;
        }
}