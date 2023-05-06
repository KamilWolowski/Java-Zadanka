import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        int hp = 20;
        System.out.println("Witaj poszukiwaczu przygód !" + "\n");
        String hi = in.nextLine();
        if (hi.equals("Witaj")) {
            System.out.println("\n" + "Twoja przygoda zaczyna się od pójścia do jaskini oraz pokonanie tam złego minotaura" + "\n");
        }
        System.out.println("Jeśli chcesz przejść do tej przygody wpisz \"Wchodzę\"" + "\n");
        String getIn = in.nextLine();
        if (getIn.equals("Wchodzę")) {
            System.out.println("\n" + "Świetnie! No to zaczynamy!");
        } else {
            System.out.println("Jesteś cipa...");
            return;
        }
        System.out.println("\n" + "Wchodzisz do jaskini i napotykasz rozbierzność dróg. Co wybierasz lewo czy prawo?" + "\n");
        String leftOrRight = in.nextLine();
        if (leftOrRight.equals("lewo")) {
            System.out.println("\n" + "Trafiłes w ślepy zaułek musisz wrócić do przejścia w prawo!" + "\n");
            System.out.println("Odwracasz się i próbujesz iść do przejścia w prawo ale napotykasz ogromnego pająka który cię atakauje" + "\n");
                int ambushChance = rnd.nextInt(13);
                    if (ambushChance > 2) {
                        System.out.println("Zostałeś trafiony!" + "\n");
                        hp--;
                    }
                    if (ambushChance <= 2) {
                        System.out.println("HA! Potwór Cię nie trafił!" + "\n");
                    }
            }
            if (leftOrRight.equals("prawo")) {
                System.out.println("\n" + "Naptkałeś wroga którym jest ogromny pająk! Musisz walczyć!");
            }
            int spiderHp = 6;
            do {
                if (hp <= 0) {
                    System.out.println("\n" + "Umrzyłeś!");
                    return;
                }
                System.out.println("\n" + "Twoje Życie " + hp + "\n");
                System.out.println("Życie ogromnego pająka " + spiderHp + "\n");
                System.out.println("Co robisz?(atak albo ucieczka)");
                String attackRun = in.nextLine();
                if (attackRun.equals("atak")) {
                    int chanceToHit = rnd.nextInt(11);
                    if (chanceToHit >= 5 && chanceToHit != 10) {
                        System.out.println("Trafiłeś ");
                        spiderHp--;
                    }
                    if (chanceToHit == 10) {
                        System.out.println("Trafiłeś krytycznie!" + "\n");
                        System.out.println("Trafiłeś go w oko i odciałeś mu jedną z nóg!");
                        spiderHp -= 2;
                    }
                    if (chanceToHit < 5) {
                        System.out.println("Chybiłeś");
                    }
                    if (spiderHp == 0){
                        System.out.println("\n" + "Wykończyleś pająka" + "\n");
                        System.out.println("Twoje Pozostałe życie: " + hp + "\n");
                        break;
                    }
                    System.out.println("\n" + "Czas na atak ogromnego pająka!" + "\n");
                    int spiderChanceToHit = rnd.nextInt(7);
                    if (spiderChanceToHit >= 3 && spiderChanceToHit != 6) {
                        System.out.println("Ogromny pająk Cię trafił!");
                        hp--;
                    }
                    if (spiderChanceToHit == 6) {
                        System.out.println("Ah dostałeś krytycznie!");
                        System.out.println("Ogromny pająk wbił Ci swoje kły!");
                        hp -= 2;
                    }
                    if (spiderChanceToHit < 3) {
                        System.out.println("Ogromny pająk Cię chybił!");
                    }
                }
                    if (attackRun.equals("Ucieczka")){
                        int chanceToRun = rnd.nextInt(11);
                        if (chanceToRun >= 9){
                            System.out.println("Udało Ci się uciec" + "\n");
                            System.out.println("Podczas ucieczki ogromny pająk Cię dopadł skacząc na Ciebie i owijając Cię w swoją sieć -- umarłeś");
                            return;
                        }
                            if (chanceToRun < 9){
                                System.out.println("Nie uciekłeś" + "\n");
                                System.out.println("Musisz dalej walczyć - Powodzenia!" + "\n");
                            }
                        }
            }while(spiderHp > 0);
        System.out.println("Uuf to była walka! Prawda?");
        String afterBattle = in.nextLine();
        if (afterBattle.equals("Prawda")){
            System.out.println("Świetnie dałeś sobie radę z tym ogromnym pająkiem teraz czas na minotaura!" + "\n");
        }
        if (afterBattle.equals("Nieprawda")){
            System.out.println("Tak czy tak pewnie został tylko minotaur, więc ruszajmy dalej!" + "\n");
        }
        {
            System.out.println("Kolejne rezwidlenie wybierasz lewo czy prawo?" + "\n");
            String leftRightWithReward = in.nextLine();
            if (leftRightWithReward.equals("lewo")) {
                System.out.println("\n" + "Trafiłeś na dwa gobliny, które jeszcze Cię nie zauważyły możesz jeszcze uciec. Co chcesz zrobić?(\"lecimy z kurwami\" lub \"uciekamy\")" + "\n");
                String attackOrNo = in.nextLine();
                if (attackOrNo.equals("lecimy z kurwami")) {
                    System.out.println("\n" + "Szarżujesz na te dwa gobliny, atakujesz oba tak szybko że same gobliny nie wiedziały co się stało przez co zdążyłeś odciać im oby głowy" + "\n");
                }
                if (attackOrNo.equals("uciekamy")) {
                    System.out.println("\n" + "Ty schowałeś się w przejściu z prawej i przeczekałeś aż gobliny sobie poszły i poszedłeś tam gdzie pierwotnie stały");
                }
            }
            if (leftRightWithReward.equals("prawo")) {
                System.out.println("\n" + "Trafiasz na skrzynkę. Co chcesz zrobić?(\"otwieram\" lub \"zostawiam i idę dalej\")" + "\n");
                String takeOrLose = in.nextLine();
                if (takeOrLose.equals("otwieram")) {
                    System.out.println("\n" + "W skrzyni znajduje się zajebisty magiczny miecz!" + "\n");
                }
                if (takeOrLose.equals("zostawiam i idę dalej")) {
                    System.out.println("\n" + "W skrzyni był zajebisty magiczny miecz ale Ty go nie potrzebujesz i idziesz dalej jak na kozaka przystało" + "\n");
                }
            }
        }
        System.out.println("Widzisz minotaura w oddali czas go zaatakować. \"Atakujemy znienacka\" czy \"szarżujemy?\"" + "\n");
        String attack = in.nextLine();
        if (attack.equals("Atakujemy znienacka")){
            System.out.println("\n" + "Skradasz się za skałami bo okazuje się że jest to ogromny pokój z tronem na środku" + "\n");
        }
        int weap = 2;
    }
}
