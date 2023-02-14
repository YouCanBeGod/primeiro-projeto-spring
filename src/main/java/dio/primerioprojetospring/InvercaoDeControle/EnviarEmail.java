package dio.primerioprojetospring.InvercaoDeControle;

public class EnviarEmail {

    public EnviarEmail(String tipo, String endereco, String senha) {

    }

    public static EnviarEmail obterDadosEmail() {
        return new EnviarEmail("teste", "contato@amos.com", "senha");
    }

    public void retornar(String mensagem) {
        System.out.println("Email enviado.");
    }
}
