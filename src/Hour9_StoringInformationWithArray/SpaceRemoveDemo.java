package Hour9_StoringInformationWithArray;

import java.util.Arrays;

//import java.lang.reflect.Array;


public class SpaceRemoveDemo {

	public static void main(String[] args) {
		
		String myName = "Tran Van Loi";
		
		char[] name = myName.toCharArray();
		System.out.println(name.length);
		
		for (int i = 0; i < name.length; i++) {
			char current = name[i];
			if (current != ' ') {
				System.out.print(current);
			}
			else {
				System.out.print(".");
			}
		}
		System.out.println();
		
		//Sort Array
		String name1 = myName.toLowerCase();
		System.out.println(name1);
		char[] sortName = name1.toCharArray();
		Arrays.sort(sortName);
		System.out.println(sortName);
		
	}
}
