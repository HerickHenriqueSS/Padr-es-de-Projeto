public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Grifo grifo = new Grifo();

        Aeroporto aeroporto = new Aeroporto();
        aeroporto.aceita(grifo);
    }
}
