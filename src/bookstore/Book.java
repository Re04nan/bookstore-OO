package bookstore;

public class Book {
		
		// atributos
		String name;
		String description;
		Double price;
		String isbn; // um número de identificação (International Standard Book Number).
		Acthor acthor;

		public void viewBook() {
			System.out.println("Nome do livro: " + name);
			System.out.println("Descrição: " + description);
			System.out.println("Valor R$ " + price);
			System.out.println("ISBN : " + isbn);
			
			if(haveActhor()) {
				acthor.viewActhor();
			}
			
			System.out.println("*******");
		}
		
		public void percentageDiscount(double value) {
			this.price -= this.price * value;
		}
		
		public Boolean haveActhor() {
			Boolean acthor = this.acthor != null && this.acthor.verifyFields();
			return acthor;
		}
		
}
