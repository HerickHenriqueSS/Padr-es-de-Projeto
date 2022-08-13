
import classes.subclasses.Cachorro;
import classes.subclasses.Gato;
import classes.subclasses.Humano;

public class App {

    public static void main(String[] args) {

        Gato g1 = new Gato("Manda Chuva", 'M', 2, 9.0, "", false);
        System.out.println(g1.getNome());
        g1.setNome("Batatinha");
        System.out.println(g1.getNome());

        Humano Kennes = new Humano("Kennes");

        Cachorro c1 = new Cachorro("Sofi", 'F', 2, 15.0, "Branco", Kennes, "srd");
        g1.miar();
        c1.latir();

        g1.comer("rato");
        g1.correr("1km");
        g1.dormir(3);
        System.err.println("");

        c1.comer("osso");
        c1.correr("3km");
        c1.dormir(6);
        System.out.println("");

        Kennes.darCarinho(c1);

    }
}
