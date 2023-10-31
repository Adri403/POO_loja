import java.util.List;
public class main {
    public static void main(String[] args) {

    Produto Camisa = new Camisa("Modelo1", "Preto", 1000.0, "12345", "Computador potente");
    System.out.println(Camisa.toString());


    Produto celular1 = new Celular("Smartphone Samsung", "Prata", 1500, "Galaxy A34", "128GB, 5G Octa-Core 6GB RAM 6,6 Câm. Tripla + Selfie 13MP Dual Chip");
    Produto celular2 = new Celular("Smartphone Samsung", "Branco ", 2100, "Galaxy S21 FE", "128GB");
    Produto celular3 = new Celular("Apple Iphone", "Roxo-profundo", 9300, "iPhone 14 Pro", "512 GB");
    Produto computador1 = new Computador("Notebook Dell", 11000, "Dell XPS 13", "Plus i1200-M10PS 13.4 Full HD+ 13 ger. Plataforma Intel EVO Ci7 16GB 1TB SSD W11 Premium Support");
    Produto vestido1 = new Vestido("Vestido de noiva", "branco vintage", 770, "noiva", "Vestido de renda plus size vestido de baile");
    Produto vestido2 = new Vestido("Vestido de Formatura", "vermelho", 160, "formatura", "Vestido feminino de um ombro só com babados");
    Produto camisa1 = new Camisa("Camisa Social", "azul marinho", 95, "Social ", "Camisa Masculina Manga Longa Slim Fácil Passar");
    Produto camisa2 = new Camisa("Men's Performance", "verde militar", 381, "Polo", "Primegreen Polo Shirt Adidas");

    }
}

