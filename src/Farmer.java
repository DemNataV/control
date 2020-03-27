public class Farmer {
    int resurs = 5;

    @Override
    public String toString() {
        return "Farmer{" +
                "resurs=" + resurs +
                '}';
    }

    void corm(HomeAnimal homeAnimal){
       if(homeAnimal.hp > 0 && homeAnimal.hp < homeAnimal.hpmax) {
           homeAnimal.hp++;//max hp = 10

           System.out.println("Фермер покормил " + homeAnimal.name + " -" + " здоровье " + homeAnimal.hp);
       }
        System.out.println("Фермер покормил " + homeAnimal.name + " -" + " здоровье " + homeAnimal.hp);
    };

    void defender(WildAnimal wildAnimal){
         wildAnimal.hp --;
        System.out.println("Фермер прогнал " + wildAnimal.name + " осталось посещений " + wildAnimal.hp);

    };
    void eat(HomeAnimal animal){
       animal.hp = 0;
       resurs =resurs + animal.ves;
        System.out.println("Фермер съел " + animal.name);

    };

    void farmResurs(HomeAnimal homeAnimal) {
        if (homeAnimal.type.equalsIgnoreCase("korova"))  resurs = resurs + (int) (Math.random()*2+5);
        else if (homeAnimal.type.equalsIgnoreCase("kura")) resurs = resurs + (int) (Math.random()*2+2);
        else homeAnimal.resurs = 0;
    };

}
