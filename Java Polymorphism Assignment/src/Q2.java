
public class Q2 {
	static public class Monster {
		protected String name;
		
		public Monster(String name) {
		this.name = name;
		}
		
		public String attack() {
		return "Err.. I don't know how to attack!";
		}
	}

	static public class FireMonster extends Monster {
		
		public FireMonster(String name) {
		super(name);
		}
		
		public String attack() {
		return name + " Attack with fire!";
		}
	}

	static public class WaterMonster extends Monster {
		
		public WaterMonster(String name) {
		super(name);
		}
		
		public String attack() {
		return name + " Attack with water!";
		}
	}
	
	static public class StoneMonster extends Monster {
		
		public StoneMonster(String name) {
		super(name);
		}
			
		public String attack() {
		return name + " Attack with stones!";
		}
	}

	public static void main(String[] args) {
		
		Monster m1 = new FireMonster("Fire Lion"); 
		Monster m2 = new WaterMonster("Strike"); 
		Monster m3 = new StoneMonster("Blizzard");
		
		System.out.println(m1.attack()); 
		System.out.println(m2.attack()); 
		System.out.println(m3.attack()); 
		
		m1 = new StoneMonster("Metamorphic");
		System.out.println(m1.attack()); 
		
		Monster m4 = new Monster("Green");
		System.out.println(m4.attack()); 
		}
}
