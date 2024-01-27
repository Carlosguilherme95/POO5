public class Main {
    public static void main(String[] args) {
        Contador contador = new Contador();
        System.out.println(Contador.count);
        Contador contador1 = new Contador();
        System.out.println(Contador.count);
        Contador.incrementador();
        System.out.println(Contador.count);
        Contador.zerarContador();
        System.out.println(Contador.count);


    }
}

/**
 * escreva uma classe chamada contador, que tenha um atributo estático que é incrementado sempre
 * que a classe é instanciada. desenvolva métodos para incrementar e zerar e retornar o contador
 *
 */