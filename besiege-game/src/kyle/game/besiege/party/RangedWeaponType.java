package kyle.game.besiege.party;

/* contains information about a specific weapon type */
public class RangedWeaponType {
	public enum Type {BOW, CROSSBOW, THROWN, FIREARM};
	
	public String name;
	
	public int atkMod;
	public int range;
	public int accuracy;
	public int rate;
	
	public boolean oneHand;
	public boolean blunt;
	 
	public Type type;
	
	public void setType(String typeString) {
		if (typeString.equals("bow"))
			type = Type.BOW;
		if (typeString.equals("crossbow"))
			type = Type.CROSSBOW;
		if (typeString.equals("thrown"))
			type = Type.THROWN;
		if (typeString.equals("firearm"))
			type = Type.FIREARM;
	}
}
