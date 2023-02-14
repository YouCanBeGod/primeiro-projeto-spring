package dio.primerioprojetospring.InvercaoDeControle;

public class Pedido {

    public static void main(String[] args) {

        Pedido pedido = new Pedido();

        pedido.gravar();
    }

    private EnviarEmail enviar;

    public void gravar() {
        this.enviar = new EnviarEmail("teste", "contato@amos.com", "senha");
        this.enviar.retornar("Pedido criado.");
    }
}
