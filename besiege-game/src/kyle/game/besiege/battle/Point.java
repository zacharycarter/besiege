package kyle.game.besiege.battle;

import kyle.game.besiege.battle.Unit.Orientation;

public class Point {
	public int pos_x;
	public int pos_y;
	public Orientation orientation;
	
	public Point(int pos_x, int pos_y) {
		this.pos_x = pos_x;
		this.pos_y = pos_y;
	}
}
