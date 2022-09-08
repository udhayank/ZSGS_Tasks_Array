package array;

public class Question1B {
	
	// Without using 
	
	static String[][] childAndFather = {{"luke", "shaw"}, 
			 							{"wayne", "rooney"}, 
			 							{"rooney", "ronaldo"}, 
			 							{"shaw", "rooney"}};
		
	public static void main(String[] args) {
		
		String[] children = new String[childAndFather.length];
		int childCount = 0;
		
		String grandFather = "ronaldo";
		
		for (String[] s:childAndFather) {
			if (grandFather == s[1]) {
				children[childCount++] = s[0];
			}
		}
		
		int grandChildCount = 0;
		
		for (int i=0; i<childCount; i++) {
			for (String[] s:childAndFather) {
				if (children[i] == s[1]) {
					grandChildCount++;
				}
			}
		}
		
		System.out.println(grandChildCount);

	}

}
