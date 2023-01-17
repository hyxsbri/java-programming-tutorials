

//문자열에서 마지막 단어 반환
public class Main2 {

	public static char function(String input) {
		return input.charAt(input.length()-1);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Hello World의 마지막 단어는 "+ function("Hello World"));

	}  

}
