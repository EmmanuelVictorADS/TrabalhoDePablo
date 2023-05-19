package confeitariaEstagio;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuPrincipal {
	
  MenuPrincipal() {
	Scanner scanner = new Scanner(System.in);
	
    MenuPrincipalOpcoes principalOpcoes;
    MenuClienteOpcoes clienteOpcoes;
    MenuLojaOpcoes lojaOpcoes;
    LojaTortasOpcoes tortasOpcoes;
    LojaSalgadosOpcoes salgadosOpcoes;
    
    MenuFuncionarioOpcoes funcionarioOpcoes;
    
	ArrayList<Cliente> clientes = new ArrayList<>();

    do {
        // Exibir o menu principal
        System.out.println("\n=== Menu Principal da Confeitaria ===");
        System.out.println("[1] - Gerenciar Clientes");
        System.out.println("[2] - Loja");
        System.out.println("[3] - Gerenciar Funcionarios");
        System.out.println("[4] - Sair");
        System.out.println("--------------------");
        System.out.println("[5] - CLASSES TESTES");
        System.out.print("Escolha uma opção: ");
        int escolhaPrincipal = scanner.nextInt();

        switch (escolhaPrincipal) {
            case 1:
            	principalOpcoes = MenuPrincipalOpcoes.OPCAO_1;
                do {
                	System.out.println("\n===== Cadastro de Clientes =====");
                    System.out.println("[1] - Cadastrar novo cliente");
                    System.out.println("[2] - Mostrar lista de clientes");
                    System.out.println("[3] - Remover cliente");
                    System.out.println("[4] - Voltar ao	 Menu Principal");
                    System.out.print("Escolha uma opção: ");
                    int clienteEscolha = scanner.nextInt(); 
                    
                    switch (clienteEscolha) {
                        case 1:
                        	clienteOpcoes = MenuClienteOpcoes.CLIENTEOPCAO_1;
                        	scanner.nextLine(); 

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

                            System.out.println("\nCliente cadastrado com sucesso!");
                            break;
                            
                        case 2:
                        	clienteOpcoes = MenuClienteOpcoes.CLIENTEOPCAO_2;
                        	System.out.println("\n===== Lista de Clientes =====");
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
                        	clienteOpcoes = MenuClienteOpcoes.CLIENTEOPCAO_3;
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
                            
                        case 4:
                        	clienteOpcoes = MenuClienteOpcoes.VOLTAR;
                            break;
                            
                        default:
                            System.out.println("Opção inválida! Tente novamente.");
                            continue;
                    }

                    if (clienteOpcoes == MenuClienteOpcoes.VOLTAR) {
                        break;
                    }

                } while (true);
            break;    
                
            case 2:
                principalOpcoes = MenuPrincipalOpcoes.OPCAO_2;
                do {
                    System.out.println("\n===== Produtos da Loja =====");
                    System.out.println("[1] - Bolos");
                    System.out.println("[2] - Tortas");
                    System.out.println("[3] - Salgados");
                    System.out.println("[4] - Doces");
                    System.out.println("[5] - Bebidas");
                    System.out.println("[6] - Voltar ao Menu Principal");
                    System.out.print("Escolha uma opção: ");
                    int escolhaTeste = scanner.nextInt();

                    switch (escolhaTeste) {
                        case 1:
                            lojaOpcoes = MenuLojaOpcoes.LOJAOPCAO_1;
                            break;
                            
                        case 2:
                            lojaOpcoes = MenuLojaOpcoes.LOJAOPCAO_2;
                            do {
                                System.out.println("\n===== Tortas =====");
                                System.out.println("[1] - Torta de Limão     | R$: 49,91");
                                System.out.println("[2] - Torta de Frango    | R$: 57,10");
                                System.out.println("[3] - Torta de Chocolate | R$: 79,56");
                                System.out.println("[4] - Torta de Morango   | R$: 74,20");
                                System.out.println("[5] - Voltar ao Menu da Loja");
                                System.out.print("Escolha uma opção: ");
                                int escolhaTorta = scanner.nextInt();

                                switch (escolhaTorta) {
                                    case 1:
                                    	tortasOpcoes = LojaTortasOpcoes.TORTA_LIMAO;
                                        break;
                                        
                                    case 2:
                                    	tortasOpcoes = LojaTortasOpcoes.TORTA_FRANGO;
                                        break;
                                        
                                    case 3:
                                    	tortasOpcoes = LojaTortasOpcoes.TORTA_CHOCOLATE;
                                        break;
                                        
                                    case 4:
                                    	tortasOpcoes = LojaTortasOpcoes.TORTA_MORANGO;
                                        break;
                                        
                                    case 5:
                                    	tortasOpcoes = LojaTortasOpcoes.VOLTAR;
                                        break;
                                        
                                    default:
                                        System.out.println("Opção inválida! Tente novamente.");
                                        continue;
                                }

                                if (tortasOpcoes == LojaTortasOpcoes.VOLTAR) {
                                    break;
                                }
                            } while (true);
                        break;
                            
                        case 3:
                            lojaOpcoes = MenuLojaOpcoes.LOJAOPCAO_3;
                            do {
                                System.out.println("\n===== Tortas =====");
                                System.out.println("[1] - Coxinha de Frango | R$: 4,25");
                                System.out.println("[2] - Pastel de Frango  | R$: 4,25");
                                System.out.println("[3] - Empada            | R$: 6,25");
                                System.out.println("[4] - Bolinho de Queijo | R$: 3,50");
                                System.out.println("[5] - Voltar ao Menu da Loja");
                                System.out.print("Escolha uma opção: ");
                                int escolhaSalgado = scanner.nextInt();

                                switch (escolhaSalgado) {
                                    case 1:
                                    	salgadosOpcoes = LojaSalgadosOpcoes.COXINHA_FRANGO;
                                        break;
                                        
                                    case 2:
                                    	salgadosOpcoes = LojaSalgadosOpcoes.PASTEL_FRANGO;
                                        break;
                                        
                                    case 3:
                                    	salgadosOpcoes = LojaSalgadosOpcoes.EMPADA;
                                        break;
                                        
                                    case 4:
                                    	salgadosOpcoes = LojaSalgadosOpcoes.BOLINHO_QUEIJO;
                                        break;
                                        
                                    case 5:
                                    	salgadosOpcoes = LojaSalgadosOpcoes.VOLTAR;
                                        break;
                                        
                                    default:
                                        System.out.println("Opção inválida! Tente novamente.");
                                        continue;
                                }

                                if (salgadosOpcoes == LojaSalgadosOpcoes.VOLTAR) {
                                    break;
                                }
                            } while (true);
                        break;
                            
                        case 4:
                            lojaOpcoes = MenuLojaOpcoes.LOJAOPCAO_4;
                            break;
                            
                        case 5:
                            lojaOpcoes = MenuLojaOpcoes.LOJAOPCAO_5;
                            break;
                            
                        case 6:
                            lojaOpcoes = MenuLojaOpcoes.VOLTAR;
                            break;
                            
                        default:
                            System.out.println("Opção inválida! Tente novamente.");
                            continue;
                    }

                    if (lojaOpcoes == MenuLojaOpcoes.VOLTAR) {
                        break;
                    }
                } while (true);
            break;
                
            case 3:
                principalOpcoes = MenuPrincipalOpcoes.OPCAO_3;
                System.out.println("Menu de Gerenciar Funcionarios em Manutenção");
                break;
                
            case 4:
                principalOpcoes = MenuPrincipalOpcoes.SAIR;
                break;
                
            case 5:
                principalOpcoes = MenuPrincipalOpcoes.OPCAO_4;
                do {
                    System.out.println("\n===== CLASSES TESTES =====");
                    System.out.println("[1] - COMBO");
                    System.out.println("[2] - FUNCIONARIO");
                    System.out.println("[3] - FUNCIONARIO 2.0");
                    System.out.println("[4] - ???");
                    System.out.println("[5] - ???");
                    System.out.println("[6] - Voltar ao Menu Principal");
                    System.out.print("Escolha uma opção: ");
                    int escolhaCTeste = scanner.nextInt();

                    switch (escolhaCTeste) {
                        case 1:
                        	tortasOpcoes = LojaTortasOpcoes.TORTA_LIMAO;
                        	ComboP2.fazercombo(20, 10, 10);
                            break;
                            
                        case 2:
                        	tortasOpcoes = LojaTortasOpcoes.TORTA_FRANGO;
                        	FuncionarioP2 f1 = new FuncionarioP2();
                    	    f1.setNome("Jorge");
                    	    f1.setCargo("atendente");
                    	    f1.setHorario("de 08:00 às 14:00");
                    	    f1.setRealizadas("limpar mesas, recolher pratos, anotar pedidosdos clientes");
                    	    f1.setPendentes("repor o estoque e levar o lixo");
                    	    f1.registro();
                            break;
                            
                        case 3:
                        	tortasOpcoes = LojaTortasOpcoes.TORTA_CHOCOLATE;
                        	FuncionarioP3 f2 = new FuncionarioP3();
                    	    f2.setNome("Jorge");
                    	    f2.setCargo("atendente");
                    	    f2.setHorario("de 08:00 às 14:00");
                    	    f2.setRealizadas("limpar mesas, recolher pratos, anotar pedidosdos clientes");
                    	    f2.setPendentes("repor o estoque e levar o lixo");
                    	    f2.registro();
                            break;

                            
                        case 4:
                        	tortasOpcoes = LojaTortasOpcoes.TORTA_MORANGO;
                            break;
                            
                        case 5:
                        	tortasOpcoes = LojaTortasOpcoes.VOLTAR;
                            break;
                            
                        case 6:
                        	tortasOpcoes = LojaTortasOpcoes.VOLTAR;
                            break;
                            
                        default:
                            System.out.println("Opção inválida! Tente novamente.");
                            continue;
                    }

                    if (tortasOpcoes == LojaTortasOpcoes.VOLTAR) {
                        break;
                    }
                } while (true);
            break;
                
            default:
                System.out.println("Opção inválida! Tente novamente.");
                continue; 
        }

        if (principalOpcoes == MenuPrincipalOpcoes.SAIR) {
            break; 
        }

    } while (true);

  scanner.close();
  }
}
