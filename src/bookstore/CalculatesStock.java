package bookstore;

public class CalculatesStock {
	
	public static void main(String[] args) {
		
		Double bookJava = 98.99;
		Double bookPython = 88.99;
		
		Double sum = bookJava + bookPython;
		
		System.out.println("Total em estoque: R$ " + sum);
		
		if(sum < 150) {
			System.out.println("Estoque abaixo do esperado!");
		} else if (sum > 2000) {
			System.out.println("Estoque muito acima do ideal!");
		}
	}
}
