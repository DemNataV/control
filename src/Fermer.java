public class Fermer {
    int resurs = 5;



    void corm(HomeAnimal homeAnimal){
       if(homeAnimal.hp <11) homeAnimal.hp ++;//max hp = 10
    };
    void defender(WildAnimal wildAnimal){
         wildAnimal.hp --;

    };
    void eat(HomeAnimal animal){
        if (resurs > 1) resurs = resurs -2;
        else animal.hp = 0;

    };
}
