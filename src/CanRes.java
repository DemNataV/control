public interface CanRes {
    /*default void res(HomeAnimal homeAnimal){
      if (homeAnimal.type.equalsIgnoreCase("korova"))  homeAnimal.resurs = 2;
      else if (homeAnimal.type.equalsIgnoreCase("kura")) homeAnimal.resurs = 1;
      else homeAnimal.resurs = 0;

    };*/

    void farmRes(Farmer farmer);
}
