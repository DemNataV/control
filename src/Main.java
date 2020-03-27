public class Main {
    public static void main(String[] args) {
        WildAnimal wolf = new WildAnimal("Волк",(int) (Math.random()*15+1));
        System.out.println(wolf.toString());
        WildAnimal fox = new WildAnimal("Лис",(int) (Math.random()*15+1));
        System.out.println(fox.toString());
        WildAnimal bear = new WildAnimal("Медведь",(int) (Math.random()*15+1));
        System.out.println(bear.toString());

        Cat cat = new Cat(((int) (Math.random()*10)), 3, ((int) (Math.random()*5 +2))); cat.setName("Рыжий");
        System.out.println(cat.toString());

        Chicken chicken1 = new Chicken( ((int) (Math.random()*10)), 2, ((int) (Math.random()*2 +2))); chicken1.setName("Ципа");
        System.out.println(chicken1.toString());
        Chicken chicken2 = new Chicken(((int) (Math.random()*10)), 3, ((int) (Math.random()*2 +2))); chicken2.setName("Ципа-ципа");
        System.out.println(chicken2.toString());
        Chicken chicken3 = new Chicken(((int) (Math.random()*10)), 2, ((int) (Math.random()*2 +2))); chicken3.setName("Ципа-ципа-ципа");
        System.out.println(chicken3.toString());

        Rabbit rabbit1 = new Rabbit( ((int) (Math.random()*20+1)), 5, ((int) (Math.random()*4 +3))); rabbit1.setName("Дашка");
        System.out.println(rabbit1.toString());
        Rabbit rabbit2 = new Rabbit(((int) (Math.random()*20+1)), 4, ((int) (Math.random()*4 +3))); rabbit2.setName("Сашка");
        System.out.println(rabbit2.toString());

        Cow cow = new Cow(((int) (Math.random()*7)), 30, ((int) (Math.random()*10 +1))); cow.setName("Зорька");
        System.out.println(cow.toString());

        Farmer farmer = new Farmer();

        Farm farm = new Farm(farmer);
        farm.addWildAnimals(wolf, fox, bear);
        farm.addHomeAnimals(cat, chicken1, chicken2, chicken3, rabbit1, rabbit2, cow);

        for (int i = 0; i < 20; i++) {
            System.out.println("Начлся день " + (i+1));
            farm.passDay();
            System.out.println(farm.toString());
        }





    }
}
