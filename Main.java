public class Main {
    public static void main(String[] args) {
        // Criando um restaurante com uma região
        Restaurante restauranteItaliano = new Restaurante("italiana");
        Restaurante restauranteBrasileiro = new Restaurante("brasileira");
        
        System.out.println("Cardápio Italiano:");
        restauranteItaliano.getCardapio().exibirCardapio();
        System.out.println();

        System.out.println("Cardápio Brasileiro:");
        restauranteBrasileiro.getCardapio().exibirCardapio();
        System.out.println();

        Cliente cliente1 = new Cliente("Maria");
        Cliente cliente2 = new Cliente("João");

        Garcon garcon = new Garcon(restauranteItaliano.getCardapio());
        Telefonista telefonista = new Telefonista(restauranteBrasileiro.getCardapio());

        garcon.anotarPedido(cliente1, 1); 

        garcon.listarPedidos();
        System.out.println();

        telefonista.anotarPedidoTelefone(cliente2, 2, "12/12/2024"); 
        telefonista.listarPedidosEntrega();
        System.out.println();


        Restaurante restauranteGenerico = new Restaurante("desconhecida");
        System.out.println("Cardápio Genérico:");
        restauranteGenerico.getCardapio().exibirCardapio();
    }
}
