package strex1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot atom1 = new Atom("¾ÆÅè");
		atom1.setMovingStrategy(new FlyStrategy());;
		atom1.move();
		atom1.setAttackStrategy(new PunchStrategy());;
		atom1.attack();
		
		Robot taekwonV1 = new TaekwonV("ÅÂ±ÇV");
		taekwonV1.setMovingStrategy(new WalkStrategy());;
		taekwonV1.move();
		taekwonV1.setAttackStrategy(new MissileStrategy());;
		taekwonV1.attack();
		
	}

}
