public class King extends Unit {
    private static String[] phrases = {
        "Я король в моём королевстве, даже если это — королевство помойных ям",
        "На нудистском пляже трудно понять, кто король, а кто просто голый.",
        "Завтракай, как король! Обедай, как король! Ужинай, как король! И помни, ты не жирный. Ты король!",
        "В стране дураков, умный королём не станет.",
        "Короли знают о делах своих министров не больше, чем рогоносцы о делах своих жен.",
        "Гусь тоже думал, что купается, пока вода не закипела...",
        "Десять раз стрелял. Всё мимо. Тигр умер от смеха.",
        "Создайте ещё более понятный интерфейс, и мир создаст ещё более тупого юзера."
    };

    Writter writter;

    Guard[] guards = new Guard[3];

    public void setGuard(Guard guard) {
        for (int i = 0; i < guards.length; i++) {
            if (guards[i] == null) {
                guards[i] = guard;
                break;
            }
        }
    }

    public King(String name) {
        super(name);
    }

    public void setWritter(Writter writter) {
        this.writter = writter;
    }

    public void saySomething() {
        int randomIndex = (int)Math.floor(Math.random() * phrases.length);
        String text = String.format("%s: %s", getName(), phrases[randomIndex]);
        System.out.println(text);
        if (writter != null) {
            writter.write();
        }
    }

    public void callSecurity() {
        String text = String.format("%s: Эх..., как жаль, что у меня нет охраны!", getName());
        System.out.println(text);
        int randomIndex = (int)Math.floor(Math.random() * guards.length);
        Guard guard = guards[randomIndex];
        if (guard != null) {
            System.out.println(String.format("%s: Охрана! Сюда!", getName()));
            guard.greet(this);
        }
    }

    @Override
    public void moveTo(Point p) {
        System.out.println(String.format("%s: Пожалуй пройдусь в направлении %s", getName(), p));
        if (writter != null) {
            writter.follow(p);
        }
    }

}
