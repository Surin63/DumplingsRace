import com.engeto.examples.dumplings.Race;
import com.engeto.examples.dumplings.Racer;
import com.engeto.examples.dumplings.User;

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

        List<Race> listOfRace = new ArrayList<>();
        listOfRace.add(race2017);
        listOfRace.add(race2018);
        listOfRace.add(race2019);

        for (Race race : listOfRace) {
            System.out.println(race.getYear());

        }

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

       // listOfRacers.remove(racer1);    //vymaze objekt z listu
       // listOfRacers.remove(0);     //vymaze index z listu jak je oznacen
        //listOfRacers.clear();       // vymaze cely list
        listOfRacers.size();        // vypisena nam kolik objektu mame v listu
        System.out.println(listOfRacers);
        for (Racer racer : listOfRacers) {
            System.out.println(racer.getName());

            int[] poleCisel;
            String[] poleTextu;
            Racer[] poleZavodniku;

            poleCisel = new int[10];
            int velikostPole = 15;
            poleTextu = new String[velikostPole];
            Racer[] dalsiPoleZavodniku = new Racer[12];

            poleCisel[1] = 5;
            poleTextu[5] = "Karel";
           // poleZavodniku[0] = new Racer("Karel");

            System.out.println("Na druhe pozici je cislo: "+poleCisel[1]);
           // System.out.println("Prvni zavodnik se jmenuje: "+poleZavodniku[0].getName());

            System.out.println("Pocet prvku v poli cisel je: "+poleCisel.length);

            User uzivatel = new User("Karel");
            User[] poleUzivatelu = new User[10];
            poleUzivatelu[1] = uzivatel;
            poleUzivatelu[2] = uzivatel;
            poleUzivatelu[1].setName("Jana");

            System.out.println(poleUzivatelu[1].getName());
            System.out.println(poleUzivatelu[2].getName());
            System.out.println(uzivatel.getName());


            int cislo = 5;
            //int[] poleCisel = new int[10];
            poleCisel[1] = cislo;
            poleCisel[2] = cislo;
            poleCisel[1] = 10;

            System.out.println(poleCisel[1]);
            System.out.println(poleCisel[2]);
            System.out.println(cislo);

            int[] pole = new int[10];
            for (int i = 0; i < pole.length; i++) {
                pole[i] = 0;
                System.out.println(i);
            }


        }
    }
}
