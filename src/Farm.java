import java.util.Random;

public class Farm {
    Fermer fermer;
    HomeAnimal[] homeAnimals = new HomeAnimal[10];
    WildAnimal[] wildAnimals = new WildAnimal[10];

    public Farm(Fermer fermer) {
        this.fermer = fermer;
    }

    public Fermer getFermer() {
        return fermer;
    }

    public void setFermer(Fermer fermer) {
        this.fermer = fermer;
    }

    public HomeAnimal[] getHomeAnimals() {
        return homeAnimals;
    }

    public void setHomeAnimals(HomeAnimal[] homeAnimals) {
        this.homeAnimals = homeAnimals;
    }

    public WildAnimal[] getWildAnimals() {
        return wildAnimals;
    }

    public void setWildAnimals(WildAnimal[] wildAnimals) {
        this.wildAnimals = wildAnimals;
    }

    public void addHomeAnimals(HomeAnimal... animals) {
        for (int i = 0; i < homeAnimals.length; i++) {
            if (homeAnimals[i] == null) {
                for (int j = 0; j < animals.length; j++) {

                    animals[i + j] = homeAnimals[j];
                    //System.out.println(animals[i+j].name);


                }
                break;
            }
        }
    }

    public void addWildAnimals(WildAnimal... animals) {
        for (int i = 0; i < wildAnimals.length; i++) {
            if (wildAnimals[i] == null) {
                for (int j = 0; j < animals.length; j++) {

                    animals[i + j] = wildAnimals[j];
                    //System.out.println(animals[i+j].name);


                }
                break;
            }
        }
    }

    void attac(WildAnimal wildAnimal, HomeAnimal homeAnimal){
        int var = (int) (Math.random()*10);
        if (var > 5) fermer.defender(wildAnimal);
        else if (wildAnimal.v > homeAnimal.v) homeAnimal.hp --;
    };

    void passDay(){
        if (fermer.resurs > 2){
            fermer.resurs = fermer.resurs -2;
            int n1 = 0;
            for (int i = 0; i < homeAnimals.length ; i++) {
                if (homeAnimals[i] != null && homeAnimals[i].hp > 0) n1 ++;
            }
            int nn1 = 0;
            HomeAnimal[] ostHomeAnimal = new HomeAnimal[n1];
            for (int i = 0; i < homeAnimals.length ; i++) {
                if (homeAnimals[i] != null && homeAnimals[i].hp > 0) {
                    ostHomeAnimal[nn1] = homeAnimals[i];
                    nn1++;
                }
            }

                int n2 = 0;
                for (int i = 0; i < wildAnimals.length ; i++) {
                    if (wildAnimals[i] != null && wildAnimals[i].hp > 0) n2 ++;
                }
                int nn2 = 0;
                WildAnimal[] ostWildAnimal = new WildAnimal[n2];
                for (int i = 0; i < wildAnimals.length ; i++) {
                    if (wildAnimals[i] != null && wildAnimals[i].hp > 0) {
                        ostWildAnimal[nn2] = wildAnimals[i];
                        nn1++;
                    }

                }

            Random random = new Random();
                //int dif1 = homeAnimals.length;

                attac(wildAnimals[random.nextInt(wildAnimals.length+1)],
                        homeAnimals[random.nextInt(homeAnimals.length+1)]);

            for (int i = 0; i < ostHomeAnimal.length ; i++) {


                fermer.corm(ostHomeAnimal[i]);
                ostHomeAnimal[i].res
            }



        }
        else System.out.println("fermer proigral");

    };



}
