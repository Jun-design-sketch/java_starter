package com.in28minutes.tips.nonaccess.package1;

class Player {
	private String name;
	private static int count = 0;

	public Player(String name) {
		super();
		this.name = name;
		count++;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the count
	 */
	static public int getCount() {
//		System.out.println(name);
		return count;
	}
}

public class StaticModifierRunner {
	public static final int SECONDS_IN_MINUTE = 60;
	public static final int MINUTES_IN_HOUR = 60;
	public static final int HOURS_IN_DAY = 24;
	public static final int SECONDS_IN_DAY = SECONDS_IN_MINUTE * MINUTES_IN_HOUR * HOURS_IN_DAY;

	public static void main(String[] args) {
		System.out.println(0x80000000);
		System.out.println(Integer.MIN_VALUE);

		System.out.println(60 * 60 * 24);
		System.out.println(SECONDS_IN_DAY);

		Player player1 = new Player("Ronaldo");
		System.out.println(Player.getCount());
		Player player2 = new Player("Federer");
		System.out.println(Player.getCount());

	}
}
