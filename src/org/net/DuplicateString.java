package org.net;

public class DuplicateString {
	public static void main(String[] args) {
		String str = "schools";
		int count = 0;
		char[] cs = str.toCharArray();
		System.out.println("Duplicate Characters are:");
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (cs[i] == cs[j]) {
					System.out.println(cs[j]);
					count++;
					break;

				}

			}

		}

	}

}
