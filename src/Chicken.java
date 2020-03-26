public class Chicken
        extends HomeAnimal
        implements CanRes, CanBeEaten {
    public Chicken(int hp, int v, int ves) {
        super(hp, v, ves);
        this.type = "kura";
    }

    @Override
    public void farmRes(Farmer farmer) {
        int var = (int) (Math.random()*2+2);
        farmer.resurs = farmer.resurs + var;
        System.out.println("Фермер забрал ресурсы с цыпленка " + name + " " + var);
    }
}
