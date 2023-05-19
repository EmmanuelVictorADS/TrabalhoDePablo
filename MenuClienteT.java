package confeitariaEstagio;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuClienteT {
	
  MenuClienteT() {
	ArrayList<Cliente> clientes = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    while (true) {
    	System.out.println("===== Cadastro de Clientes =====");
        System.out.println("1. Cadastrar novo cliente");
        System.out.println("2. Mostrar lista de clientes");
        System.out.println("3. Remover cliente");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");

        try {
        	int opcao = scanner.nextInt();

            if (opcao == 4) {
            	System.out.println("Encerrando o programa...");
                break;
            }

        switch (opcao) {
        case 1:
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

            System.out.println("Cliente cadastrado com sucesso!");
            System.out.println();
            break;

           case 2:
        	   System.out.println("===== Lista de Clientes =====");
               if (clientes.isEmpty()) {
            	   System.out.println("Nenhum cliente cadastrado.");
               } else {
            	   for (Cliente cliente : clientes) {
            		   System.out.println("Nome: " + cliente.getNome());
                       System.out.println("Endereço: Rua " + cliente.getEndereco()[0] + ", Bairro " + cliente.getEndereco()[1]);
                       System.out.println("Telefone: " + cliente.getTelefone());
                       System.out.println("--------------------------");
                       }
               }
           System.out.println();
           break;

           case 3:
        	   System.out.println("===== Remover Cliente =====");
               if (clientes.isEmpty()) {
            	   System.out.println("Nenhum cliente cadastrado.");
               }else {
            	   scanner.nextLine();

                   System.out.print("Digite o nome do cliente a ser removido: ");
                   String nomeRemover = scanner.nextLine();

                   boolean clienteRemovido = false;
                   for (int i = 0; i < clientes.size(); i++) {
                	   Cliente cliente = clientes.get(i);

                       // comparar String sem distinção de maísculo e minúscula
                	   if (cliente.getNome().equalsIgnoreCase(nomeRemover)) {
                       clientes.remove(i);
                       clienteRemovido = true;
                       System.out.println("Cliente removido com sucesso!");
                       break;
                       }
                   }

               //inverter o valor booleano    
               if (!clienteRemovido) {
            	   System.out.println("Cliente não encontrado.");
                   }
               }
               System.out.println();
               break;

               default:
            	   System.out.println("Opção inválida! Tente novamente.");
                   System.out.println();
                   break;
               }
        } catch (InputMismatchException e) {
        	System.out.println("Opção inválida! Tente novamente.");
            scanner.nextLine(); // Limpar o buffer do scanner
            System.out.println();
            }
        
    }scanner.close();
  }
}
