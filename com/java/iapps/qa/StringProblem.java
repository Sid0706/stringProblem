package com.java.iapps.qa;

public class StringProblem {

	public String remove(String str, char removeChar) {
		StringBuilder sb = new StringBuilder();
		char[] letters = str.toCharArray();
		for (char c : letters) {
			if (c != removeChar) {
				sb.append(c);
			}
		}
		return sb.toString();
	}
}
