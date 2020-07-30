public class Test {

    @org.junit.Test
    public void test(){
        Banana banana = new Banana();
        Apple apple = new Apple();
        Eat eat = new Eat();
        banana.eatBy(eat);
        eat.eat(banana);
        apple.eatBy(eat);
        eat.eat(apple);
    }
}
