package bookstore;

public class RegisterBook {
	public static void main(String[] args) {
		
		Acthor acthor = new Acthor();
		acthor.name = "Hermione Granger";
		acthor.email = "hermionegranger@dev.com";
		acthor.cpf = "202.020.202-02";
		
		Book book = new Book();
		
		book.name = "Java";
		book.description = "Aprendendo a linguagem";
		book.price = 98.99;
		book.isbn = "978-85-66250-46-6";
		book.acthor = acthor;
		
		book.viewBook();
		
		Acthor acthorTwo = new Acthor();
		acthorTwo.name = "Hermione Granger & Severo Snape";
		acthorTwo.email = "wizard@dev.com";
		acthorTwo.cpf = "992.920.902-00";
		
		Book bookTwo = new Book();
		bookTwo.name = "Java com Spring Boot";
		bookTwo.description = "Trabalhando com micros serviços";
		bookTwo.price = 148.99;
		bookTwo.isbn = "948-88-66560-66-9";
		bookTwo.acthor = acthorTwo;
		bookTwo.viewBook();
		
	}
}
