import java.util.ArrayList;
public abstract class Lojaabs implements Loja{
    private ArrayList<Produto> produtos;
    private String nome;
    private String localizacao;

    public Lojaabs(String Novonome, String NovaLocalizacao){
      this.nome = Novonome;
      this.localizacao = NovaLocalizacao;
      this.produtos = new ArrayList<Produto>();
    }

    public String getNome(){
      return nome;
    }

    public String getLocalizacao(){
      return localizacao;
    }

    public Lojaabs(){
        produtos = new ArrayList<Produto>();
      }
    
      public void cadastra(Produto produto){
         produtos.add(produto);
      }
    
      public Produto recupera(String identificador) throws ProdutoNaoEncontrado{
        for (int i = 0; i < produtos.size(); i++){
          Produto r = produtos.get(i);
    
          if (r.getIdentificador().equals(identificador)){
            return r;
          }
        }
        throw new ProdutoNaoEncontrado ("O produto " + identificador + " não foi encontrado");
      }
    public void remove(String identificador){
        Produto p = recupera(identificador);
        if (p != null)
          produtos.remove(p);
    }
}



