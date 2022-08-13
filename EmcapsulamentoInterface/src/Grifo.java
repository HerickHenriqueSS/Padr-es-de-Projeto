public class Grifo implements TransporteAereo {

    @Override
    public void voar(String origem, String destino, int numeroPassageiros) {
        System.out.println("Grifo");
        System.out.println("Partiu da origem: " + origem);
        System.out.println("toc toc toc");
        System.out.println("Chegou no destino: " + destino);
        System.out.println("Número de passageiros: " + numeroPassageiros);
    }

}
