import java.util.ArrayList;
import java.util.List;


class Prato {
    private String nome;
    private double preco;

    public Prato(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return String.format("%s - R$ %.2f", nome, preco);
    }
}


class Cardapio {
    private List<Prato> pratos;

    public Cardapio() {
        this.pratos = new ArrayList<>();
    }

    public void adicionarPrato(Prato prato) {
        pratos.add(prato);
    }

    public List<Prato> getPratos() {
        return pratos;
    }

    public void exibirCardapio() {
        System.out.println("--- Cardápio ---");
        for (int i = 0; i < pratos.size(); i++) {
            System.out.printf("%d. %s\n", (i + 1), pratos.get(i));
        }
    }
}





