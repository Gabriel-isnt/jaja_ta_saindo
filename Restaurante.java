class Restaurante {
    private String regiao;
    private Cardapio cardapio;

    public Restaurante(String regiao) {
        this.regiao = regiao;
        this.cardapio = criarCardapioPorRegiao(regiao);
    }

    private Cardapio criarCardapioPorRegiao(String regiao) {
        Cardapio cardapio = new Cardapio();
        switch (regiao.toLowerCase()) {
            case "italiana":
                cardapio.adicionarPrato(new Prato("Pizza Margherita", 30.00));
                cardapio.adicionarPrato(new Prato("Lasagna", 35.50));
                cardapio.adicionarPrato(new Prato("Tiramisu", 20.00));
                break;
            case "brasileira":
                cardapio.adicionarPrato(new Prato("Feijoada", 25.00));
                cardapio.adicionarPrato(new Prato("Pão de Queijo", 10.00));
                cardapio.adicionarPrato(new Prato("Brigadeiro", 5.00));
                break;
            case "japonesa":
                cardapio.adicionarPrato(new Prato("Sushi", 40.00));
                cardapio.adicionarPrato(new Prato("Tempurá", 30.00));
                cardapio.adicionarPrato(new Prato("Mochi", 15.00));
                break;
            default:
                System.out.println("Região não reconhecida, usando cardápio genérico.");
                cardapio.adicionarPrato(new Prato("Hambúrguer Clássico", 25.50));
                cardapio.adicionarPrato(new Prato("Salada Caesar", 18.90));
                cardapio.adicionarPrato(new Prato("Sorvete", 10.00));
                break;
        }
        return cardapio;
    }

    public Cardapio getCardapio() {
        return cardapio;
    }
}
