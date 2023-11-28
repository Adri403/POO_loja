import java.util.List;
public class Main {
    public static void main(String[] args) {


    Produto celular1 = new Celular("Smartphone Samsung", "Prata", 1500, "Galaxy A34", "128GB, 5G Octa-Core 6GB RAM 6,6 Câm. Tripla + Selfie 13MP Dual Chip");
    Produto celular2 = new Celular("Smartphone Samsung", "Branco ", 2100, "Galaxy S21 FE", "128GB");
    Produto celular3 = new Celular("Apple Iphone", "Roxo-profundo", 9300, "iPhone 14 Pro", "512 GB");
    Produto computador1 = new Computador("Notebook Dell", 5600, "Dell G15-i1200-A20P", "Notebook Gamer Dell G15-i1200-A20P 15.6 FHD 12 Geracão Intel Core i5 8GB 512GB SSD NVIDIA RTX 3050 Windows 11");
     Produto computador2 = new Computador("Notebook Dell", 11000, "Dell XPS 13", "Plus i1200-M10PS 13.4 Full HD+ 13 ger. Plataforma Intel EVO Ci7 16GB 1TB SSD W11 Premium Support");
    Produto vestido1 = new Vestido("Vestido de noiva", "branco vintage", 770, "noiva", "Vestido de renda plus size vestido de baile");
    Produto vestido2 = new Vestido("Vestido de Formatura", "vermelho", 160, "formatura", "Vestido feminino de um ombro só com babados");
    Produto camisa1 = new Camisa("Camisa Social", "azul marinho", 95, "Social ", "Camisa Masculina Manga Longa Slim Fácil Passar");
    Produto camisa2 = new Camisa("Men's Performance", "verde militar", 381, "Polo", "Primegreen Polo Shirt Adidas");
    
    
    Loja loja1 = new LojaDeRoupa("Store CG", "Rua Maciel Pinheiro, n 10");
    loja1.cadastra(vestido1);
    loja1.cadastra(vestido2);
    loja1.cadastra(camisa1);
    loja1.cadastra(camisa2);
    loja1.remove("Polo");

    Loja loja2 = new LojaDeEletronico("Gamer Store", "Av. Brasília, n 2");
    loja2.cadastra(celular1);
    loja2.cadastra(celular2);
    loja2.cadastra(computador2);

    Loja loja3 = new LojaDeEletronico("Mega CG","Av. Pedro I, n 100");
    loja3.cadastra(celular1);
    loja3.cadastra(celular2);
    loja3.cadastra(celular3);
    loja3.cadastra(computador1);
    loja3.cadastra(computador2);
    Produto c1 = loja3.recupera("iPhone 14 Pro");
    System.out.println(c1);
    loja2.remove("Galaxy A34");
    try {
        Produto x = loja3.recupera("iPhone 15");
        System.out.println(x);
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    }
}

