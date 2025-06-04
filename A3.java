import java.util.Scanner;
public class A3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    boolean fufando = true;
    while (fufando) {
        System.out.println("\nComo podemos ajudar? ");
        System.out.println("1 - extorno");
         System.out.println("2 - Solicitar atendimento");
          System.out.println("3 - Denúncia de golpe");
          System.out.println("4 - Sair");
          int escolha = sc.nextInt();
          switch (escolha) {
            case 1:
            System.out.println("Não estamos funicoando no momento ");
            break;
            case 2:
            System.out.println("Não estamos funicoando no momento ");
            break;
            case 3:
            System.out.println("ai papai");
            break;
            case 4:
            fufando = false;
            System.out.println("Obrigado pela paciencia!");
            break;
            default:
            System.out.println("Opção inválida");
            }
            


    }
}
}