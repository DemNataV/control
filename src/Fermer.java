public class Fermer {
    int resurs = 5;



    void corm(HomeAnimal homeAnimal){
       if(homeAnimal.hp <11) homeAnimal.hp ++;//max hp = 10
    };
    void defender(WildAnimal wildAnimal){
        int var = (int) (Math.random()*10);
        if (var > 5) wildAnimal.hp --;

    };
}
