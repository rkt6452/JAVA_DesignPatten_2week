package strex1;

public abstract class Robot {
	
	private String name;
	private MovingStrategy movingStrategy;
	private AttackStrategy attackStrategy;
	
	public void attack() {
		this.attackStrategy.attack();
	}
	public void move() {
		this.movingStrategy.move();
	}
	
	public String getName() {//이름을 새로운 값으로 리셋
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Robot(String name) {
		this.name = name; 
	}// 생성자로 이름 생성 (이름 조정 불가)
	public MovingStrategy getMovingStrategy() {
		return movingStrategy;
	}
	public void setMovingStrategy(MovingStrategy movingStrategy) {
		this.movingStrategy = movingStrategy;
	}
	public AttackStrategy getAttackStrategy() {
		return attackStrategy;
	}
	public void setAttackStrategy(AttackStrategy attackStrategy) {
		this.attackStrategy = attackStrategy;
	}


}
