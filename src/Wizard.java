public class Wizard extends Unit implements Writter, Guard {

    public Wizard(String name) {
        super(name);
    }

    @Override
    public void write() {
        double r = Math.random();
        String text = (Math.random() > 0.5) ? "Хм..., видимо важно, запишу." : "WTF!";
        System.out.println(getName() + ": " + text);
    }

    @Override
    public void follow(Point p) {
        System.out.println(String.format("%s: Да мой король, следую за вами", getName()));
    }
    @Override
    public void attack(Unit u) {
        System.out.println(String.format("%s: Я испепелю тебя своими чарами!", getName()));
    }

    @Override
    public void kick(Unit u) {
        System.out.println(String.format("%s: Лучше уходи по хорошему!", getName()));
    }

    @Override
    public void defend(Unit u) {
        System.out.println(String.format("%s: Если потребуется, я создам магический щит!", getName()));
    }

    @Override
    public void greet(Unit u) {
        System.out.println(String.format("%s: Доброго времени суток, %s!", getName(), u.getName()));
    }
}
