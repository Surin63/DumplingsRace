import com.engeto.examples.dumplings.Race;
import com.engeto.examples.dumplings.Racer;

public class Main {
    public static void main(String[] args) {
        Racer firstRacer = new Racer();
        Racer secondRacer = new Racer();

        Race race2017 = new Race();
        Race race2018 = new Race();
        Race race2019 = new Race();
        //vymazat

        firstRacer.setName("Radek");
        System.out.println(firstRacer.getName());
        secondRacer.setName("Jana");
        System.out.println(secondRacer.getName());
        firstRacer.setName("Radomir");
        System.out.println(firstRacer.getName());
}
}
