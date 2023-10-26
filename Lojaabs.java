import java.util.ArrayList;
public abstract class Lojaabs implements Loja{
    private ArrayList<Produto> produtos;
    public Lojaabs(){
        produtos = new ArrayList<Produto>();
      }
    
      public void cadastra(Produto produto){
         produtos.add(produto);
      }
    
      public Produto recupera(String identificador){
        for (int i = 0; i < produtos.size(); i++){
          Produto r = produtos.get(i);
    
          if (r.getIdentificador().equals(identificador)){
            return r;
          }
        }
        return null;
      }
    public void remove(String identificador){
        Produto p = recupera(identificador);
        if (p != null)
          produtos.remove(p);
    }
}



