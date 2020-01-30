public class HomeDragon extends Dragon implements Guard {
    public HomeDragon(String name) {
        super(name);
    }
    @Override
    public void attack(Unit u) {
        System.out.println(String.format("%s: Р-р-р-р-р-р-р-р!", getName()));
    }

    @Override
    public void kick(Unit u) {
        System.out.println(String.format("%s: Ар-ар-ар-ар-ар-ар!", getName()));
    }

    @Override
    public void defend(Unit u) {
        System.out.println(String.format("%s: Гр-гр-гр-гр-гр-гр!", getName()));
    }

    @Override
    public void greet(Unit u) {
        System.out.println(String.format("%s: *тихий рык в сторону* %s!", getName(), u.getName()));
    }


}
