package initializationandcleanup;

class Person {
    public void eat(Apple apple) {
        Apple app = apple.getPeeled();
        System.out.println("I am eating the apple!");
    }
}

class Peeler {
    public static Apple peel(Apple apple) {
        System.out.println("Peeler is peeling the apple");
        return apple;
    }
}

class Apple {
    public Apple getPeeled() {
        System.out.println("you will get the peeled apple");
        return Peeler.peel(this);
    }
}

class PassingThis {
    public static void main(String[] args) {
        Person nobody = new Person();
        nobody.eat(new Apple());
    }
}