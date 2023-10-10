package com.in28minutes.functionalProgramming;

public class testRunner {

	public static int solution(String ineq, String eq, int n, int m) {
		boolean check = false;

		StringBuilder sb = new StringBuilder();
		sb.append(ineq);
		sb.append(eq);

		if (sb.toString() == "<=") {
			check = (n <= m);
		} else if (sb.toString() == ">=") {
			check = (n >= m);
		} else if (sb.toString() == ">!") {
			check = (n > m);
		} else if (sb.toString() == "<!") {
			check = (n < m);
		}

		return check ? 1 : 0;
	}

	public static void main(String[] args) {
		int sol = solution(">", "=", 20, 50);
	}

}
