
public class Main {

	public static void main(String[] args) {
		
		String name = "Dark-Side";
		
//		boolean result = name.equalsIgnoreCase("dark-side");
//		int result = name.length();
//		char result = name.charAt(0);
//		int result = name.indexOf("s");
//		boolean result = name.isEmpty();
//		String result = name.toUpperCase();
//		String result = name.toLowerCase();
//		String result = name.trim();
//		String result = name.replace('k', 'r');
		name = name.concat("-is-learning-Java");
		String result[] = name.split("-");
		
		
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

	}

}
