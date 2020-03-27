public class Chicken
        extends HomeAnimal
        implements CanRes, CanBeEaten {

    //int hpmax = 3;

    public Chicken(int v, int ves, int hpmax) {
        super(v, ves, hpmax);
        this.type = "kura";
        this.hp = hpmax;
    }

    @Override
    public void farmRes(Farmer farmer) {
        if (hp > 0) {
            int var = (int) (Math.random() * 2);
            farmer.resurs = farmer.resurs + var;
            System.out.println("Фермер забрал ресурсы с цыпленка " + name + " " + var);
        }
    }
}
