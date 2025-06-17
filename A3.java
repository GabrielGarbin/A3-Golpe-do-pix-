import java.util.Scanner;
import java.util.HashMap;
import java.io.*;

public class A3 {
    private static final String FILE_NAME = "denuncias.dat";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        boolean found = false;

        // Cria os dados do cliente e do golpista 
        A3clientes clientes = new A3clientes("Jorge Silva", 1, "Maria Santos", 2, "Alberto rodrigues", 3);

        // Cria uma transação de exemplo com os CPFs do cliente e golpista
        A3Transacao transacao = new A3Transacao(1, "Pagamento de conta", 150.75, "Pix", "07-08-2025", clientes.getCpf1(), clientes.getCpf2());

        // Cria um retorno de transação para o cliente e golpista2
        A3Retorno retorno = new A3Retorno(150.75, "Pix", "07-08-2025", clientes.getCpf1(), clientes.getCpf3());

        // Contador de denúncias por CPF
        HashMap<Integer, Integer> contadorDenuncias = loadDenuncias();

        while (running) { // Loop que permite a repetição do programa
            System.out.println("\nQual é seu problema: ");
            System.out.println("1 - Atendimento ao cliente");
            System.out.println("2 - Transferência não funcionando");
            System.out.println("3 - Denúncia de golpe");
            if (found) {
             System.out.println("5 - Estorno do banco");
        }
            System.out.println("4 - Resetar denúncias");
            System.out.println("0 - Sair");
    

            int Numero = sc.nextInt(); // Lê o número escolhido pelo usuário
            switch (Numero) {
                case 1:
                    System.out.println("Não estamos funcionando no momento, tente novamente mais tarde");
                    break;
                case 2:
                    System.out.println("Não estamos funcionando no momento, tente novamente mais tarde");
                    break;
                case 3:
                    found = true;
                // Pega o nome do cliente pelo cpf
                    System.out.println("\nDigite seu CPF:");
                    int Cpf = sc.nextInt();
                    System.out.println("Digite o CPF do golpista:");
                    int CpfGolpista = sc.nextInt();
                    String nomeCliente = "";
                    if (Cpf == clientes.getCpf1()) {
                        nomeCliente = clientes.getNome1();
                    } else if (Cpf == clientes.getCpf2()) {
                        nomeCliente = clientes.getNome2();
                    } else if (Cpf == clientes.getCpf3()) {
                        nomeCliente = clientes.getNome3();
                    } else {
                        nomeCliente = "CPF não encontrado";
                        System.exit(Cpf); // Sai do programa caso não exista o CPF
                    }

                    System.out.println("\nO seu CPF é: " + Cpf + " : " + nomeCliente);

                    // Procura o nome do golpista pelo CPF
                    String nomeGolpista = "";
                    if (CpfGolpista == clientes.getCpf1()) {
                        nomeGolpista = clientes.getNome1();
                    } else if (CpfGolpista == clientes.getCpf2()) {
                        nomeGolpista = clientes.getNome2();
                    } else if (CpfGolpista == clientes.getCpf3()) {
                        nomeGolpista = clientes.getNome3();
                    } else {
                        nomeGolpista = "CPF não encontrado";
                        System.exit(CpfGolpista); // Sai do programa caso não exista o CPF
                    }

                    System.out.println("\nO CPF do golpista é: " + CpfGolpista + " : " + nomeGolpista);

                    // Atualiza o contador de denúncias
                    int count = contadorDenuncias.getOrDefault(CpfGolpista, 0) + 1;
                    contadorDenuncias.put(CpfGolpista, count);
                    saveDenuncias(contadorDenuncias);
                                    // Definicão de limite de denuncias 
                    System.out.println("Denúncias para o CPF " + CpfGolpista + ": " + count);
                    if (count >= 3) {
                        System.out.println("A conta do CPF " + CpfGolpista + " foi bloqueada devido a múltiplas denúncias.");
                        System.exit (0);
                    }
                    for (int i = 0; i < 4 ; i++) { // Contador de 4 segundos 
                        System.out.println("("+ i+")");
                         try {
                             Thread.sleep(1000); // Espera um segundo
                         }  catch (InterruptedException e) {
                        }
                    }
                            // Detalhes da Transação 
                    System.out.println("\nDetalhes da transação:");
                    System.out.println("ID: " + transacao.getId());
                    System.out.println("Descrição: " + transacao.getDescricao());
                    System.out.println("Valor: " + transacao.getValor());
                    System.out.println("Tipo: " + transacao.getTipo());
                    System.out.println("Data: " + transacao.getData());
                    System.out.println("CPF do Pagador: " + CpfGolpista + "  " + nomeGolpista);
                    System.out.println("CPF do Recebedor: " + Cpf + " " + nomeCliente);
                              
                    // Pede o CPF que o cliente vai mandar o dinheiro
                    System.out.println("\n" + nomeCliente + " Qual o CPF que você  mandou o dinheiro");
                    int CpfGolpista2 = sc.nextInt();
                    String nomeGolpista2 = "";
                    if (CpfGolpista2 == Cpf) { // Procuara o nome do cliente pelo CPF
                        nomeGolpista2 = "não pode ser o mesmo";
                        System.out.println("Não foi encontrada a transferência");
                        System.exit(0);
                    } else if (CpfGolpista2 == clientes.getCpf1()) {
                        nomeGolpista2 = clientes.getNome1();
                    } else if (CpfGolpista2 == clientes.getCpf2()) {
                        nomeGolpista2 = clientes.getNome2();
                    } else if (CpfGolpista2 == clientes.getCpf3()) {
                        nomeGolpista2 = clientes.getNome3();
                    } else {
                        nomeGolpista2 = "CPF não encontrado";
                         System.exit(CpfGolpista2); // Sai do programa caso não exista o CPF
                    }
                    for (int i = 0; i < 4 ; i++) { // Contador de 4 segundos
                        System.out.println("("+ i+")");
                         try {
                             Thread.sleep(1000); // Espera 1 segundo
                         }  catch (InterruptedException e) {
                        }
                    }
                    System.out.println("\nDetalhes da transação:");
                    System.out.println("Valor: " + retorno.getValor());
                    System.out.println("Tipo: " + retorno.getTipo());
                    System.out.println("Data: " + retorno.getData());
                    System.out.println("CPF do Pagador: " + Cpf + " " + nomeCliente);
                    System.out.println("CPF do Recebedor: " + CpfGolpista2 + " " + nomeGolpista2);
                    break;
                case 4:
                    contadorDenuncias.clear(); // Limpa a lista de denúncias
                    saveDenuncias(contadorDenuncias);
                    System.out.println("Denúncias resetadas com sucesso."); 
                    break;
                case 5:
                // Pede o CPF para Estorno do dinheiro
            System.out.println("\nDigite seu CPF:");
                    int Cpf1 = sc.nextInt();
                    String nomeCliente1 = "";
                    if (Cpf1 == clientes.getCpf1()) { // Procura o nome do cliente pelo CPF
                        nomeCliente1 = clientes.getNome1();
                    } else if (Cpf1 == clientes.getCpf2()) {
                        nomeCliente1 = clientes.getNome2();
                    } else if (Cpf1 == clientes.getCpf3()) {
                        nomeCliente1 = clientes.getNome3();
                    } else {
                        nomeCliente1 = "CPF não encontrado";
                        System.exit(Cpf1); // Sai do programa caso não exista o CPF
                    }
                    for (int i = 0; i < 4 ; i++) { // Contador de 4 segundos
                        System.out.println("("+ i+")");
                         try {
                             Thread.sleep(1000); // Espera 1 segundo
                         }  catch (InterruptedException e) {
                        }
                    }
                        // Detalhes do Estorno
                    System.out.println("\nDetalhes do estorno da transação:");
                    System.out.println("Valor: " + retorno.getValor());
                    System.out.println("Tipo: " + retorno.getTipo());
                    System.out.println("Data: " + retorno.getData());
                    System.out.println("CPF do Recebedor do Estorno: " + Cpf1 + " " + nomeCliente1);
                    System.out.println("\n Estorno realizado pelo banco");
                    break;
                    case 0:
                    running = false; // Sai do loop
                    System.out.println("Obrigado pela paciência!");
                    break;
                default: // Caso o usuário digite uma opção inválida
                    System.out.println("Opção inválida");
                    sc.close();
            }
        }      
        }
                        // Contador de denuncias 
    private static HashMap<Integer, Integer> loadDenuncias() {
        HashMap<Integer, Integer> map = new HashMap<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            map = (HashMap<Integer, Integer>) ois.readObject();
        } catch (FileNotFoundException e) {
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro ao carregar denúncias: " + e.getMessage());
        }
        return map;
    }
    
                        // Salvar denuncias mesmo apos finalizar o sistema
    private static void saveDenuncias(HashMap<Integer, Integer> map) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(map);
        } catch (IOException e) {
            System.out.println("Erro ao salvar denúncias: " + e.getMessage());
        }
    }
}
