import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		
		Scanner ler = new Scanner(System.in);
		
		PessoaFisica pf = new PessoaFisica();
		int menu;
			
		do {
			System.out.println("Tela Principal " +
					"\n-----------------" +
					"\n1 - Cadastrar pessoa" +
					"\n2 - Mostrar os dados" +
					"\n3 - Dados alterados" +	
					"\n0 - Sair");

			menu = ler.nextInt();
			if(menu == 1) { // CADASTRAR PF
				System.out.println("Digite o nome:");
				pf.setNome(ler.next());
				
				System.out.println("Digite o CPF:");
				pf.setCpf(ler.next());

			}
			else if(menu == 2) { // MOSTRAR DADOS
				System.out.println("Nome: " + pf.getNome());
				System.out.println("Nome: " + pf.getCpf());
			}
			else if(menu == 3) { // DADOS ALTERADOS
				System.out.println("Nome em minusculo: " + pf.toLowerCase());
				System.out.println("Quantidade de caracteres: " + pf.lenght());
				System.out.println("Posição da letra a: " + pf.indexOf());
			}
		}while(menu != 0);
	}
}
