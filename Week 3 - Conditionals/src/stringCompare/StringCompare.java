package stringCompare;

public class StringCompare {

	public static void main(String[] args) {
		String name1 = "Tammy";
		String name2 = "Mark";
		String name3 = "Tammy";
		
		if (name1.equals(name2)) {
			System.out.println(name1 + " and " + name2 + " are the same.");
		}
		else {
			System.out.println(name1 + " and " + name2 + " are not the same.");
		}
		if (name1.equals(name3)) {
			System.out.println(name1 + " and " + name3 + " are the same.");
		}
		else {
			System.out.println(name1 + " and " + name3 + " are not the same.");
		}
		if (name1.compareTo(name2) < 0) {
			System.out.println(name1 + " is less than " + name2);
		}
		else if (name1.compareTo(name2) == 0) {
			System.out.println(name1 + " is equal to " + name2);
		}
		else {
			System.out.println(name1 + " is greater than " + name2);
		}
	}

}
