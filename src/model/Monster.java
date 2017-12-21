/**
 * 
 */
package model;

/**
 * @author bentoune2u
 *
 */
public class Monster extends Character {

	/**
	 * @param game
	 */
	public Monster(Game game) {
		super(game);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see model.Character#isBlocked()
	 */
	@Override
	protected boolean isBlocked() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see model.Character#print()
	 */
	@Override
	void print() {
		// TODO Auto-generated method stub

	}

}
