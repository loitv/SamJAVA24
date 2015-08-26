package Hour9_StoringInformationWithArray;

public class CharCount {

	public static void main(String[] args) {
		
		String name = "TRAN VAN LOI";
		char[] letters = name.toCharArray();
		int[] letterCount = new int[26];
		/*
		char lett = letters[10];
		System.out.println(lett);
		System.out.println(letterCount[lett - 'A']++);
		*/
		for (int count = 0; count < letters.length; count++) {
			char lett = letters[count];
			if (lett >= 'A' & lett <= 'Z') {
				letterCount[lett - 'A']++;
			}
		}
		//int a = 'Z' - 'A';
		//char b = 'Z';
		//letterCount['C' - 'A']++;
		System.out.println(letterCount['N' - 'A']);
	
	}
}
