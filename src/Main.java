import com.engeto.examples.dumplings.Race;
import com.engeto.examples.dumplings.Racer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String chucksName;
        Racer chuck;
        Race todaysRace;

        Racer firstRacer = new Racer("Radek",LocalDate.of(1000, 5, 1));
        Racer secondRacer = new Racer("Jana", LocalDate.of(2000, 12, 24));

        Race race2017 = new Race(2017);
        Race race2018 = new Race(2018);
        Race race2019 = new Race(2019);

        //firstRacer.setName("Radek");
        System.out.println(firstRacer.getName());
       // secondRacer.setName("Jana");
        System.out.println(secondRacer.getName());
        firstRacer.setName("Radomir");
        System.out.println(firstRacer.getName());

        chuck = new Racer("Chuck Norris", LocalDate.of(1940, 3, 10), 10000);

        chucksName = chuck.getName();
        System.out.println(chuck.getNumberOfDumplings());

       // Racer chuck = new Racer();
       // chuck.setName("Chuck Norris");
       // chuck.setBorn(LocalDate.of(1991, 2, 14));
       // chuck.setNumberOfDumplings(10000);
       // chuck.setFinalResult(false);

        //String chuckName = chuck.getName();
        //System.out.println(chuck.getNumberOfDumplings());

    //    Race todaysRace = new Race();
    //    todaysRace.setYear(2020);
    //    todaysRace.setTitle("MCR Brichac cup");
    //    todaysRace.setDate(LocalDate.of(2020, 10, 27));
    //    todaysRace.setWinner(chuck);

        todaysRace = new Race("MCR Brichac Cup", 2020);
        todaysRace.setWinner(chuck);

        Racer racerSignIn = new Racer("Jolana",LocalDate.of(1995, 3, 30));
        Racer racerAdditional = new Racer("Jan", LocalDate.of(2000, 5, 12), 3);
        Racer racerUnknown = new Racer();

        List<Racer> listOfRacers = new ArrayList<>(); // vytvoreni array listu

        Racer racer1 = new Racer("Karel",20);
        listOfRacers.add(racer1);
        listOfRacers.add(new Racer("Anna", 15));

        List<Racer> copyOfList = new ArrayList<Racer>(listOfRacers); //vytvoreni kopie array listu

        System.out.println(listOfRacers.get(1).getName());
        System.out.println(listOfRacers.get(0).getName());

        listOfRacers.remove(racer1);    //vymaze objekt z listu
        listOfRacers.remove(0);     //vymaze index z listu jak je oznacen
        listOfRacers.clear();       // vymaze cely list
        listOfRacers.size();        // vypisena nam kolik objektu mame v listu
        System.out.println(listOfRacers);
    }
}
