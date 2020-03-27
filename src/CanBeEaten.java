public interface CanBeEaten {
    default void eaten(HomeAnimal homeAnimal){
      homeAnimal.hp = 0;
      //farmer.resurs = farmer.resurs + homeAnimal.ves;
    };
}
