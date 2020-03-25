public interface CanRes {
    default void res(HomeAnimal homeAnimal){
      if (homeAnimal.type.equalsIgnoreCase("korova"))  homeAnimal.res = 2;
      else if (homeAnimal.type.equalsIgnoreCase("kura")) homeAnimal.res = 1;
      else homeAnimal.res = 0;

    };
}
