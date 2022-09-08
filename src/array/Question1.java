package array;

import java.util.ArrayList;
import java.util.List;

public class Question1 {
	
	static String[][] childAndFather = {{"luke", "shaw"}, 
			 							{"wayne", "rooney"}, 
			 							{"rooney", "ronaldo"}, 
			 							{"shaw", "rooney"}};
		
	public static void main(String[] args) {
		
		List<String> children = new ArrayList<>();
		List<String> grandChildren = new ArrayList<>();		
		
		findSon("ronaldo", children);
		
		for (String father:children) {
			findSon(father, grandChildren);
		}
		
		System.out.println(grandChildren.size());

	}
	
	static void findSon(String father, List<String> children) {		
		
		for (String[] s:childAndFather) {
			if (s[1] == father) {
				children.add(s[0]);
			}
		}				
		
	}

}
