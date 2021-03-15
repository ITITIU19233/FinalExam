package FinalExam;

abstract class EnemyShip{
	private String name;
	private double amtDamage;
		public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmtDamage() {
		return amtDamage;
	}
	public void setAmtDamage(double amtDamage) {
		this.amtDamage = amtDamage;
	}
	
	public void followHeroShip() {
		
	}
	public void displayEnemyShip() {
		
	}
	public void enemyShipShoot() {
		
	}
}

class RocketEnemyShip extends EnemyShip{
	public RocketEnemyShip() {
		setName("Rocket");
		setAmtDamage(20.0);
	}
}
class UFOEnemyShip extends EnemyShip{
	public UFOEnemyShip() {
		setName("UFO");
		setAmtDamage(15.0);
	}
}

class EnemyShipFactory extends EnemyShip{
	public EnemyShip makeEnemyShip(String newShipType){
		
			        EnemyShip newShip = null;
		
			        if (newShipType.equals("U")){
				            return new UFOEnemyShip();
		
			        } else
		
			        if (newShipType.equals("R")){
	            return new RocketEnemyShip();
 		
			        } else return null;
					        		
			    }
}
public class Factory_Test {

}
