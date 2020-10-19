package projectMain;

public class CancellationLogic {
	private int[] firstNameCount = new int[26];
	private int[] secondNameCount = new int[26];
	private int difference = 0;

	CancellationLogic(String firstName, String secondName) {
		fillFirstNameArray(firstName);
		fillSecondNameArray(secondName);
	}

	private void fillFirstNameArray(String firstName) {
		for (int i = 0; i < firstName.length(); i++) {
			System.out.println(firstName.charAt(i));
			firstNameCount[(int) firstName.charAt(i) - 97]++;
		}
	}

	private void fillSecondNameArray(String secondName) {
		for (int i = 0; i < secondName.length(); i++)
			secondNameCount[(int) secondName.charAt(i) - 97]++;
	}

	public int getDifference() {
		for (int i = 0; i < 26; i++) {
			int diff = Math.abs(firstNameCount[i] - secondNameCount[i]);
			System.out.println((char) (97 + i) + " : " + diff);
			difference = difference + diff;
		}
		return difference;
	}
}
