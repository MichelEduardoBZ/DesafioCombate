package Fighters;

public class Champions {

	private String name;
	private int life;
	private int atack;
	private int armor;

	public Champions(String name, int life, int atack, int armor) {
		super();
		this.name = name;
		this.life = life;
		this.atack = atack;
		this.armor = armor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getAtack() {
		return atack;
	}

	public void setAtack(int atack) {
		this.atack = atack;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public void takeDamage(int atackOtherChampion) {
		
		int calcLife = 0;
		
		if (atackOtherChampion > this.getArmor()) {
			calcLife = (this.getLife() + this.getArmor()) - atackOtherChampion;
		} else {
			calcLife = this.getLife() - 1;
		}
		 this.setLife(calcLife);
	}

	public void status() {

		if (this.getLife() <= 0) {
			System.out.println(this.getName() + ": 0 de vida (Morreu)");
		} else {
			System.out.println(this.getName() + ": " + this.getLife() + " de vida.");

		}
	}

}
