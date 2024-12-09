import java.util.ArrayList;
import java.util.List;


class Cliente {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}


class Garcon {
    private Cardapio cardapio;
    private List<String> pedidos;

    public Garcon(Cardapio cardapio) {
        this.cardapio = cardapio;
        this.pedidos = new ArrayList<>();
    }

    public void anotarPedido(Cliente cliente, int indicePrato) {
        if (indicePrato > 0 && indicePrato <= cardapio.getPratos().size()) {
            Prato prato = cardapio.getPratos().get(indicePrato - 1);
            pedidos.add(String.format("%s pediu %s", cliente.getNome(), prato.getNome()));
            System.out.printf("Pedido anotado: %s - %s\n", cliente.getNome(), prato);
        } else {
            System.out.println("Pedido inválido!");
        }
    }

    public void listarPedidos() {
        System.out.println("--- Pedidos ---");
        for (String pedido : pedidos) {
            System.out.println(pedido);
        }
    }
}


class Telefonista {
    private Cardapio cardapio;
    private List<String> pedidos;

    public Telefonista(Cardapio cardapio) {
        this.cardapio = cardapio;
        this.pedidos = new ArrayList<>();
    }

    public void anotarPedidoTelefone(Cliente cliente, int indicePrato, String diaEntrega) {
        if (indicePrato > 0 && indicePrato <= cardapio.getPratos().size()) {
            Prato prato = cardapio.getPratos().get(indicePrato - 1);
            pedidos.add(String.format("%s pediu %s para entrega no dia %s", cliente.getNome(), prato.getNome(), diaEntrega));
            System.out.printf("Pedido anotado para entrega: %s - %s (Entrega: %s)\n", cliente.getNome(), prato, diaEntrega);
        } else {
            System.out.println("Pedido inválido!");
        }
    }

    public void listarPedidosEntrega() {
        System.out.println("--- Pedidos para entrega ---");
        for (String pedido : pedidos) {
            System.out.println(pedido);
        }
    }
}
