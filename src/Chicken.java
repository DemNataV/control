public class Chicken
        extends HomeAnimal
        implements CanRes, CanBeEaten {
    public Chicken(int hp, int v, int ves) {
        super(hp, v, ves);
        this.type = "kura";
    }

    @Override
    public void farmRes(Farmer farmer) {
        farmer.resurs = farmer.resurs + (int) (Math.random()*2+4);
    }
}
