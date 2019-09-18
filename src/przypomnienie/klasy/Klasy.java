package przypomnienie.klasy;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;

public class Klasy {

    public static void main(String[] args){
        ArrayList<Person> people = new ArrayList<>();
        Person person = new Person();
        person.setAge(29);
        person.setFirstName("Adrian");
        person.setLastName("Kozlowski");
        Person me = new Person("Sebastian", "Szemer", 33);

        String[] names = {"Anna", "Piotr", "Maria", "Krzysztof", "Katarzyna", "Andrzej", "Małgorzata", "Jan", "Agnieszka", "Stanisław", "Barbara", "Tomasz", "Krystyna", "Paweł", "Ewa", "Marcin", "Elżbieta", "Michał", "Zofia", "Marek", "Teresa", "Grzegorz", "Magdalena", "Józef", "Joanna", "Łukasz", "Janina", "Adam", "Monika", "Zbigniew", "Danuta", "Jerzy", "Jadwiga", "Tadeusz", "Aleksandra", "Mateusz", "Halina", "Dariusz", "Irena", "Mariusz", "Beata", "Wojciech", "Marta", "Ryszard", "Dorota", "Jakub", "Helena", "Henryk", "Karolina", "Robert", "Grażyna", "Rafał", "Jolanta", "Kazimierz", "Iwona", "Jacek", "Marianna", "Maciej", "Natalia", "Kamil", "Bożena", "Janusz", "Stanisława", "Marian", "Justyna", "Mirosław", "Paulina", "Jarosław", "Urszula", "Sławomir", "Alicja", "Dawid", "Renata", "Wiesław", "Sylwia", "Artur", "Agata", "Roman", "Aneta", "Damian", "Patrycja", "Przemysław", "Izabela", "Sebastian", "Ewelina", "Daniel", "Julia", "Władysław", "Wanda", "Zdzisław", "Marzena", "Patryk", "Wiesława", "Bartosz", "Weronika", "Edward", "Wiktoria", "Mieczysław", "Klaudia", "Leszek", "Edyta", "Karol", "Emilia", "Arkadiusz", "Genowefa", "Czesław", "Dominika", "Waldemar", "Kazimiera", "Szymon", "Hanna", "Adrian", "Kamila", "Kacper", "Martyna", "Bogdan", "Kinga", "Eugeniusz", "Lucyna", "Bartłomiej", "Stefania", "Antoni", "Józefa", "Franciszek", "Alina", "Stefan", "Zuzanna", "Radosław", "Gabriela", "Zygmunt", "Władysława", "Dominik", "Mariola", "Krystian", "Lidia", "Konrad", "Mirosława", "Aleksander", "Henryka", "Bogusław", "Wioletta", "Ireneusz", "Czesława", "Włodzimierz", "Oliwia", "Zenon", "Regina", "Witold", "Bogumiła", "Sylwester", "Angelika", "Hubert", "Sabina", "Mikołaj", "Daria", "Filip", "Aniela", "Wiktor", "Bogusława", "Bronisław", "Leokadia", "Wacław", "Bronisława", "Bolesław", "Ilona", "Cezary", "Cecylia", "Norbert", "Marlena", "Lech", "Olga", "Oskar", "Sandra", "Edmund", "Łucja", "Igor", "Anita", "Miłosz", "Eugenia", "Emil", "Maja", "Maksymilian", "Milena", "Leon", "Zdzisława", "Julian", "Wioleta", "Bernard", "Daniela", "Lucjan", "Michalina", "Błażej", "Amelia", "Romuald", "Antonina", "Eryk", "Dagmara", "Ludwik", "Żaneta", "Alfred", "Nikola", "Remigiusz", "Adrianna", "Szczepan", "Bernadeta", "Feliks", "Karina", "Gabriel", "Gertruda", "Marcel", "Rozalia", "Alojzy", "Roksana", "Bogumił", "Aldona", "Lesław", "Franciszka", "Ignacy", "Malwina", "Gerard", "Mieczysława", "Albert", "Honorata", "Seweryn", "Celina","Alan", "Kornelia", "Oliwier", "Róża", "Nikodem", "Violetta", "Joachim", "Julita", "Ernest", "Eliza", "Benedykt", "Jagoda", "Fabian", "Magda", "Wincenty", "Nina", "Gracjan", "Bożenna", "Hieronim", "Sara", "Leonard", "Alfreda", "Rajmund", "Adela", "Jędrzej", "Laura", "Tobiasz", "Brygida", "Rudolf", "Adriana", "Adolf", "Marcelina", "Teodor", "Wacława", "Klaudiusz", "Ludwika", "Tymoteusz", "Izabella", "Walenty", "Paula", "Zygfryd", "Marzanna", "Juliusz", "Elwira", "Olaf", "Anastazja", "Alfons", "Eleonora", "Kajetan", "Pelagia", "Augustyn", "Arleta", "Florian", "Apolonia", "Konstanty", "Diana", "Leopold","Andżelika" ,"Albin","Iga" ,"Kornel","Aurelia" ,"Erwin","Julianna" ,"Bohdan","Zenona" ,"Fryderyk","Romana" ,"Marceli","Felicja" ,"Aleksy","Waleria" ,"Brunon","Zenobia" ,"Ariel","Walentyna" ,"Denis","Sonia" ,"Kuba","Klara" ,"Teofil","Liliana" ,"Gustaw", "Feliksa", "Cyprian", "Hildegarda", "Sergiusz", "Romualda", "Borys", "Marzenna", "Walerian", "Judyta", "Roland", "Teodozja", "Emilian", "Lena", "Herbert", "Marika", "Dorian", "Luiza", "Martin", "Kaja", "Wilhelm", "Lilianna", "Anatol", "Teodora", "Amadeusz", "Bernadetta", "Edwin", "Donata", "Beniamin", "Ludmiła", "Ferdynand", "Matylda", "Arnold", "Jowita", "Lechosław", "Longina", "Longin", "Otylia", "Klemens", "Anetta", "Olgierd", "Nadia", "Kewin"};
        String[] lastNames = {"NOWAK", "KOWALSKA", "WIŚNIEWSKA", "WÓJCIK", "KOWALCZYK", "KAMIŃSKA", "LEWANDOWSKA", "ZIELIŃSKA", "SZYMAŃSKA", "WOŹNIAK", "DĄBROWSKA", "KOZŁOWSKA", "JANKOWSKA", "WOJCIECHOWSKA", "KWIATKOWSKA", "MAZUR", "KRAWCZYK", "KACZMAREK", "PIOTROWSKA", "GRABOWSKA", "PAWŁOWSKA", "MICHALSKA", "ZAJĄC", "KRÓL", "JABŁOŃSKA", "WIECZOREK", "NOWAKOWSKA", "WRÓBEL", "MAJEWSKA", "STĘPIEŃ", "OLSZEWSKA", "JAWORSKA", "MALINOWSKA", "ADAMCZYK", "GÓRSKA", "NOWICKA", "PAWLAK", "DUDEK", "WITKOWSKA", "WALCZAK", "RUTKOWSKA", "SIKORA", "MICHALAK", "SZEWCZYK", "OSTROWSKA", "BARAN", "TOMASZEWSKA", "PIETRZAK", "WRÓBLEWSKA", "MARCINIAK", "OWAK", "OWALSKI", "IŚNIEWSKI", "ÓJCIK", "OWALCZYK", "AMIŃSKI", "EWANDOWSKI", "IELIŃSKI", "OŹNIAK", "SZYMAŃSKI", "DĄBROWSKI", "KOZŁOWSKI", "JANKOWSKI", "MAZUR", "WOJCIECHOWSKI", "KWIATKOWSKI", "KRAWCZYK", "KACZMAREK", "PIOTROWSKI", "GRABOWSKI", "ZAJĄC", "KRÓL", "PAWŁOWSKI", "MICHALSKI", "WRÓBEL", "JABŁOŃSKI", "WIECZOREK", "NOWAKOWSKI", "MAJEWSKI", "OLSZEWSKI", "STĘPIEŃ", "JAWORSKI", "DUDEK", "ADAMCZYK", "MALINOWSKI", "PAWLAK", "GÓRSKI", "SIKORA", "NOWICKI", "WITKOWSKI", "WALCZAK", "BARAN", "RUTKOWSKI", "MICHALAK", "SZEWCZYK", "OSTROWSKI", "TOMASZEWSKI", "ZALEWSKI", "WRÓBLEWSKI", "PIETRZAK"};

        Random randomFirstName = new Random();
        Random randomLastName = new Random();

        for (int i=0; i<10000;i++){
            people.add(new Person(names[randomFirstName.nextInt(names.length)], lastNames[randomLastName.nextInt(lastNames.length)], new Random().nextInt(110)));
        }

        int i=0;
        for (Person p: people){
            if (p.getFirstName().endsWith("a")){
                System.out.println(p.getFirstName()+" "+p.getLastName());
                i++;
            }
        }
        System.out.println("ilosc kobiet: "+i);

        long a = people.stream().filter(person1 -> person.getFirstName().endsWith("a")).count();
        people.stream().filter(person1 -> person.getFirstName().endsWith("a")).collect(Collectors.toList());

        int iloscPelnoletnich = (int) people.stream().filter(person1 -> person1.getAge()>17).count();
        ArrayList<Person> pelnoletni= (ArrayList<Person>) people.stream().filter(person1 -> person1.getAge()>17).collect(Collectors.toList());
        for (Person person1 : pelnoletni) {
            System.out.println(person1.getFirstName()+" "+person1.getLastName()+" "+person1.getAge());
        }
        System.out.println(iloscPelnoletnich);
        //w domu
        //sprawdzic ile osob jest pelnoletnich
    }

}
