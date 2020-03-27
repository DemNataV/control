import java.util.Arrays;
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

    @Override
    public String toString() {
        return "Farm{" +
                "farmer=" + farmer +
                ", homeAnimals=" + Arrays.toString(homeAnimals) +
                ", wildAnimals=" + Arrays.toString(wildAnimals) +
                '}';
    }

    public void addHomeAnimals(HomeAnimal... animals) {
        for (int i = 0; i < homeAnimals.length; i++) {
            if (homeAnimals[i] == null) {
                for (int j = 0; j < animals.length; j++) {

                    homeAnimals[i + j] = animals[j];
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

                    wildAnimals[i + j] = animals[j];
                    //System.out.println(animals[i+j].name);


                }
                break;
            }
        }
    }

    void attac(WildAnimal wildAnimal, HomeAnimal homeAnimal){
        int var = (int) (Math.random()*10);
        if (var > 7) {
            farmer.defender(wildAnimal);
        }
        else if (wildAnimal.v > homeAnimal.v) {
            var = (int) (Math.random()*7 + 2);
            homeAnimal.hp = homeAnimal.hp - var;
            System.out.println(wildAnimal.name + " напал на " + homeAnimal.name + " с уроном " + var);
            if (homeAnimal.hp > 0) System.out.println("Здоровье " + homeAnimal.name + " - " + homeAnimal.hp);
            else System.out.println(homeAnimal.name + " умер");
        }
        else {
            System.out.println(homeAnimal.name + " убежал от  " + wildAnimal.name );
        }
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
                System.out.println("Фермер потратил 2 ресурса, осталось " + farmer.resurs);
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

                attac(ostWildAnimal[(int)(Math.random()*(ostWildAnimal.length-1))],
                        ostHomeAnimal[(int)(Math.random()*(ostHomeAnimal.length-1))]);

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
                    if (homeAnimals[i] != null && homeAnimals[i].hp > 0 && homeAnimals[i] instanceof CanRes) {
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
                    if (homeAnimals[i] != null && homeAnimals[i].hp > 0 && homeAnimals[i] instanceof CanBeEaten) {
                        ostEatenAnimal[nn4] = homeAnimals[i];
                        //System.out.println(ostEatenAnimal[nn4].name);
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
                int var1 = (int)(Math.random()*(ostEatenAnimal.length-1));
                    System.out.println(var1);
                    System.out.println(ostEatenAnimal);
                    //((CanBeEaten) ostEatenAnimal[var1]).eaten(ostEatenAnimal[var1], farmer);
                    //fermer.farmResurs(homeAnimals[i]);
                    farmer.eat(ostEatenAnimal[var1]);
                };
            }


             else System.out.println("Дикие животные проиграли");
        }


        else System.out.println("Фермер проиграл");

    };



}
