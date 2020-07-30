public class Banana implements Fruit{
    @Override
    public String toString() {
        return "香蕉";
    }


    public void eatBy(Eat eat) {
        eat.eat(this);
    }
}
