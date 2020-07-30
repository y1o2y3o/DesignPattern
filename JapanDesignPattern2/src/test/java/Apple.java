public class Apple implements Fruit {
    @Override
    public String toString() {
        return "苹果";
    }


    public void eatBy(Eat eat) {
        eat.eat(this);
    }
}
