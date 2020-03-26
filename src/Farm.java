import java.util.Random;

public class Farm {
    Farmer farmer;
    HomeAnimal[] homeAnimals = new HomeAnimal[10];
    WildAnimal[] wildAnimals = new WildAnimal[3];

    public Farm(Farmer farmer) {
        this.farmer = farmer;
    }

    public Farmer getFarmer() {
        return farmer;
    }

    public void setFarmer(Farmer farmer) {
        this.farmer = farmer;
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
        if (var > 5) farmer.defender(wildAnimal);
        else if (wildAnimal.v > homeAnimal.v) homeAnimal.hp --;
    };

    void passDay(){
        if (farmer.resurs > 2){

            int n2 = 0;
            for (int i = 0; i < wildAnimals.length ; i++) {
                if (wildAnimals[i] != null && wildAnimals[i].hp > 0) n2 ++;
            }
            if(n2 > 0) {
                int nn2 = 0;
                WildAnimal[] ostWildAnimal = new WildAnimal[n2];
                for (int i = 0; i < wildAnimals.length; i++) {
                    if (wildAnimals[i] != null && wildAnimals[i].hp > 0) {
                        ostWildAnimal[nn2] = wildAnimals[i];
                        nn2++;
                    }
                }

                farmer.resurs = farmer.resurs - 2;
                int n1 = 0;
                for (int i = 0; i < homeAnimals.length; i++) {
                    if (homeAnimals[i] != null && homeAnimals[i].hp > 0) n1++;
                }
                int nn1 = 0;
                HomeAnimal[] ostHomeAnimal = new HomeAnimal[n1];
                for (int i = 0; i < homeAnimals.length; i++) {
                    if (homeAnimals[i] != null && homeAnimals[i].hp > 0) {
                        ostHomeAnimal[nn1] = homeAnimals[i];
                        nn1++;
                    }
                }

                Random random = new Random();
                //int dif1 = homeAnimals.length;

                attac(wildAnimals[random.nextInt(wildAnimals.length + 1)],
                        homeAnimals[random.nextInt(homeAnimals.length + 1)]);

                for (int i = 0; i < ostHomeAnimal.length; i++) {


                    farmer.corm(ostHomeAnimal[i]);
                    //ostHomeAnimal[i].
                }

                int n3 = 0;
                for (int i = 0; i < homeAnimals.length; i++) {
                    if (homeAnimals[i] != null && homeAnimals[i].hp > 0 && homeAnimals[i] instanceof CanRes) n3++;
                }
                int nn3 = 0;
                HomeAnimal[] ostResAnimal = new HomeAnimal[n3];
                for (int i = 0; i < homeAnimals.length; i++) {
                    if (homeAnimals[i] != null && homeAnimals[i].hp > 0) {
                        ostResAnimal[nn3] = homeAnimals[i];
                        nn3++;
                    }
                }

                int n4 = 0;
                for (int i = 0; i < homeAnimals.length; i++) {
                    if (homeAnimals[i] != null && homeAnimals[i].hp > 0 && homeAnimals[i] instanceof CanBeEaten) n4++;
                }
                int nn4 = 0;
                HomeAnimal[] ostEatenAnimal = new HomeAnimal[n4];
                for (int i = 0; i < homeAnimals.length; i++) {
                    if (homeAnimals[i] != null && homeAnimals[i].hp > 0) {
                        ostEatenAnimal[nn4] = homeAnimals[i];
                        nn4++;
                    }
                }

                if (n3 > 0) {
                    for (int i = 0; i < ostResAnimal.length; i++) {
                        //ostResAnimal[i].fa
                        ((CanRes) ostResAnimal[i]).farmRes(farmer);
                        //fermer.farmResurs(homeAnimals[i]);
                    }
                }
                else {
                    //ostResAnimal[i].fa
                int var = random.nextInt(ostEatenAnimal.length + 1);
                    ((CanBeEaten) ostEatenAnimal[var]).eaten(ostEatenAnimal[var], farmer);
                    //fermer.farmResurs(homeAnimals[i]);
                };
            }


             else System.out.println("Дикие животные проиграли");
        }


        else System.out.println("Фермер проиграл");

    };



}
