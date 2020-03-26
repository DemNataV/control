public class Cow
        extends HomeAnimal
        implements CanBeEaten, CanRes {
    //static  final  type = "korova";

    public Cow(int hp, int v, int ves) {
        super(hp, v, ves);
        this.type = "korova";
    }

    @Override
    public void farmRes(Farmer farmer) {
        farmer.resurs = farmer.resurs + (int) (Math.random()*2+5);
    }
}
