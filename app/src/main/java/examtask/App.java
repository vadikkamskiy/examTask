
package examtask;

public class App {
    public static void main(String[] args) {
        System.out.println(PalindromeCheck("А роза упала на лапу Азора"));
    }
    // public static Boolean PalindromeCheck(String s){
	// 	if(s == null) throw new IllegalArgumentException("пустая строка");

	// 	String clean = s.toUpperCase().replaceAll("[^A-ZА-Я]","");
	// 	char[] chars = clean.toCharArray();

	// 	for(int i = 0 ; i<chars.length / 2 ; i++){
	// 		if(chars[i] != chars[chars.length - 1 - i]){
	// 			return false;
	// 		}
	// 	}
	// 	return true;
	// }
}
