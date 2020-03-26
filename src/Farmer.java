public class Farmer {
    int resurs = 5;



    void corm(HomeAnimal homeAnimal){
       if(homeAnimal.hp <11) homeAnimal.hp ++;//max hp = 10
    };
    void defender(WildAnimal wildAnimal){
         wildAnimal.hp --;

    };
    void eat(HomeAnimal animal){
       animal.hp = 0;
       resurs =resurs + animal.ves;

    };

    void farmResurs(HomeAnimal homeAnimal) {
        if (homeAnimal.type.equalsIgnoreCase("korova"))  resurs = resurs + (int) (Math.random()*2+5);
        else if (homeAnimal.type.equalsIgnoreCase("kura")) resurs = resurs + (int) (Math.random()*2+2);
        else homeAnimal.resurs = 0;
    };

}
