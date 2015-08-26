package Hour9_StoringInformationWithArray;

public class CoutingCharInString {

	public static void main(String[] args) {
		
		String[] phrase = {"TRAN VAN LOI", "LE CONG VINH", "NGUYEN VAN DUC",
				"TRINH DINH DUNG", "CAO THANH TRUNG"};
		//System.out.println(phrase.length);
		int[] letterCount = new int[26];
		for (int count = 0; count < phrase.length; count++) {
			String current = phrase[count];
			char[] letters = current.toCharArray();
			for (int count2 = 0; count2 < letters.length; count2++) {
				char lett = letters[count2];
				if ((lett >= 'A') & (lett <= 'Z')) {
					letterCount[lett - 'A']++;
				}
			}
		}
		
		for (char count = 'A'; count <= 'Z'; count++) {
			System.out.println(count + ": " + letterCount[count - 'A'] + " ");
		}
		System.out.println();
	}
}
