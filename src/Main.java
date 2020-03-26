public class Main {
    public static void main(String[] args) {
        WildAnimal wolf = new WildAnimal("Wolf",(int) (Math.random()*10));
        System.out.println(wolf.toString());
        WildAnimal fox = new WildAnimal("Fox",(int) (Math.random()*10));
        System.out.println(fox.toString());
        WildAnimal bear = new WildAnimal("Bear",(int) (Math.random()*10));
        System.out.println(bear.toString());

        Cat cat = new Cat(5, ((int) (Math.random()*10)), 3); cat.setName("Рыжий");
        System.out.println(cat.toString());

        Chicken chicken1 = new Chicken(3, ((int) (Math.random()*10)), 2); chicken1.setName("Ципа");
        System.out.println(chicken1.toString());
        Chicken chicken2 = new Chicken(4, ((int) (Math.random()*10)), 3); chicken2.setName("Ципа-ципа");
        System.out.println(chicken2.toString());
        Chicken chicken3 = new Chicken(5, ((int) (Math.random()*10)), 2); chicken3.setName("Ципа-ципа-ципа");
        System.out.println(chicken3.toString());

        Rabbit rabbit1 = new Rabbit(6, ((int) (Math.random()*10)), 5); rabbit1.setName("Дашка");
        System.out.println(rabbit1.toString());
        Rabbit rabbit2 = new Rabbit(5, ((int) (Math.random()*10)), 4); rabbit2.setName("Сашка");
        System.out.println(rabbit2.toString());

        Cow cow = new Cow(12, ((int) (Math.random()*10)), 30); cow.setName("Зорька");
        System.out.println(cow.toString());

        Farmer farmer = new Farmer();

        Farm farm = new Farm(farmer);
        farm.addWildAnimals(wolf, fox, bear);
        farm.addHomeAnimals(cat, chicken1, chicken2, chicken3, rabbit1, rabbit2, cow);

        for (int i = 0; i < 10; i++) {
            System.out.println("Начлся день " + i);
            farm.passDay();
            System.out.println(farm.toString());
        }





    }
}
