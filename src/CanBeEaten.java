public interface CanBeEaten {
    default void eaten(HomeAnimal homeAnimal, Fermer fermer){
      homeAnimal.hp = 0;
      fermer.resurs = fermer.resurs + homeAnimal.ves;
    };
}
