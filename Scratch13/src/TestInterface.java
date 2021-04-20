public class TestInterface {
    public static void main(String[] args) {
        Edible1 stuff = new Chick();
        System.out.println(eat(stuff));

        stuff = new Duck();
        System.out.println(eat(stuff));

        stuff = new Broccoli();
        System.out.println(eat(stuff));
    }

    public static String eat(Edible1 stuff) {
       return stuff.howToEat1();
    }
}

interface Edible1 {
    public String howToEat1();
}
class Chick implements Edible1 {
    @Override
    public String howToEat1() {
        return "Fry it";
    }
}

class Duck implements Edible1 {
    @Override
    public String howToEat1() {
        return "Roast it";
    }
}

class Broccoli implements Edible1 {
    @Override
    public String howToEat1() {
        return "Stir-fry it";
    }
}


