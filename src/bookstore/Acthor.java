package bookstore;

public class Acthor {
	
	String name;
	String email;
	String cpf;
	
	public void viewActhor(){
		System.out.println("Nome do Autor: " + name);
		System.out.println("E-mail: " + email);
		System.out.println("CPF: " + cpf);
	}
	
	public Boolean verifyFields() {
		if(this.name != null && this.email != null && this.cpf != null) {  
			return true;
		}
		return false;
	}

}
