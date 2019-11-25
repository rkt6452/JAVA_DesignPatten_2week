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
	
	public String getName() {//�̸��� ���ο� ������ ����
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Robot(String name) {
		this.name = name; 
	}// �����ڷ� �̸� ���� (�̸� ���� �Ұ�)
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
