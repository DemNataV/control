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


}
