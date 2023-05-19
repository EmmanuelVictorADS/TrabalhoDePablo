package confeitariaEstagio;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuCliente {
	
	ArrayList<Cliente> clientes = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    
    public Cliente ClientePrimeiraOpcao() {
    	scanner.nextLine(); // Limpar o buffer do scanner

        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a rua do endereço do cliente: ");
        String rua = scanner.nextLine();

        System.out.print("Digite o bairro do endereço do cliente: ");
        String bairro = scanner.nextLine();

        System.out.print("Digite o telefone do cliente: ");
        String telefone = scanner.nextLine();

        String[] endereco = {rua, bairro};

        Cliente novoCliente = new Cliente(nome, endereco, telefone);
        clientes.add(novoCliente);
        
        System.out.println("Cliente " + this.clientes.get(0) + " cadastrado com sucesso");
        return this.clientes.get(0);
        
    }

}
