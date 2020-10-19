package projectMain;

public class FlamesLogic {
	static String getResult(int difference) {
//		int temp = 0;
//		while (length > 1) {
//			System.out.println("Diff : " + difference + " length : " + length);
//			temp = difference % length;
//			System.out.println("temp : " + temp);
//			position = position + temp;
//			if (position > length)
//				position = position % length;
//			System.out.println("position : " + position);
//			try {
//				flames.deleteCharAt(position - 1);
//			} catch (StringIndexOutOfBoundsException e) {
//			}
//			position--;
//			System.out.println("Flames : " + flames);
//			length = flames.length();
//		}
//		return "";
		String result = null;
		String flames = "flames";
		StringBuilder sb3 = new StringBuilder(flames);

		char flameResult = 0;
		while (sb3.length() != 1) {
			int y = difference % sb3.length();
			String temp;
			if (y != 0) {
				temp = sb3.substring(y) + sb3.substring(0, y - 1); // taking substring (counting purpose)
			} else {
				temp = sb3.substring(0, sb3.length() - 1); // taking substring (counting purpose)
			}
			sb3 = new StringBuilder(temp);
			flameResult = sb3.charAt(0);
		}
		switch (flameResult) {
		case 'f':
			result = "Friends";
			break;
		case 'l':
			result = "Love";
			break;
		case 'a':
			result = "Affection";
			break;
		case 'm':
			result = "Marriage";
			break;
		case 'e':
			result = "Enemies";
			break;
		case 's':
			result = "Sibling";
			break;
		}
		return result;
	}
}
