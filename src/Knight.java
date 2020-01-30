public class Knight extends Unit implements Guard{

    public Knight(String name) {
        super(name);
    }

    @Override
    public void attack(Unit u) {
        System.out.println(String.format("%s: Получай, жалкое утробище!", getName()));
    }

    @Override
    public void kick(Unit u) {
        System.out.println(String.format("%s: Проваливай и не возвращайся!", getName()));
    }

    @Override
    public void defend(Unit u) {
        System.out.println(String.format("%s: Никто не подступится, я на защите!", getName()));
    }

    @Override
    public void greet(Unit u) {
        System.out.println(String.format("%s: Приветствую вас, %s!", getName(), u.getName()));
    }
}
