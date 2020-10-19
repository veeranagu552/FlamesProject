package projectMain;

import java.util.Scanner;

public class Names {
	private String firstName = null;
	private String secondName = null;
	private Scanner input = new Scanner(System.in);

	Names() {
		setFirstName();
		setSecondName();
	}

	public String getFirstName() {
		return firstName;
	}

	private void setFirstName() {
		do {
			System.out.print("Enter firstname : ");
			firstName = input.nextLine().trim();
			if (!isStringOnlyAlphabet(firstName)) {
				System.out.println("Enter only alphabets");
				firstName = "";
			}
		} while (firstName.equals(""));
	}

	private void setSecondName() {
		do {
			System.out.print("Enter secondname : ");
			secondName = input.nextLine().trim();
			if (!isStringOnlyAlphabet(secondName)) {
				System.out.println("Enter only alphabets");
				secondName = "";
			}
		} while (secondName.equals(""));
	}

	public String getSecondName() {
		return secondName;
	}

	private static boolean isStringOnlyAlphabet(String str) {
		return ((!str.equals("")) && (str != null) && (str.matches("^[a-zA-Z]*$")));
	}
}
