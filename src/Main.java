public class Main {

    public static void main(String[] args) {
    	King king = new King("Кимарк");
    	Wizard wizard = new Wizard("Пендальф");
    	Knight knight = new Knight("Фридрих");
        HomeDragon homeDragon = new HomeDragon("Чермонде");
     	king.setWritter(wizard);
     	king.setGuard(homeDragon);
		king.setGuard(knight);
        king.setGuard(wizard);
	    king.saySomething();
	    king.saySomething();
	    king.callSecurity();

	    Point p = new Point(2, 5);
	    king.moveTo(p);
    }
}
