import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //Inicialização dos OBJETOS
    static Scanner userInput = new Scanner(System.in);
    static ArrayList<String> shoppingList = new ArrayList<>();

    //Inicialização de VARIÁVEIS
    static boolean systemRun = true;
    static int optionMenu;
    static String item;


    ///Métodos principais
    //Métodos de visualização de MENU
    static void showPrincipalMenu() {
        System.out.println("--------------------------------");
        System.out.println("        LISTA DE COMPRAS");
        System.out.println("--------------------------------");
        System.out.println("Escolha a opção desejada:");
        System.out.println("0 -> SAIR (Encerra o programa)");
        System.out.println("1 -> EXIBIR LISTA");
        System.out.println("2 -> ADICIONAR ITEM A LISTA");
        System.out.println("3 -> EDITAR LISTA");
    }

    //Exibir os itens da lista
    static void showList() {

        //checa se a lista ja existe antes de exibi-la na tela
        if (shoppingList.isEmpty()) {
            System.out.println("A lista esta vázia.");

        } else {
            for (int indiceItem = 0; indiceItem < shoppingList.size(); indiceItem++) {
                System.out.printf("%d - ", indiceItem+1);
                System.out.printf("%s\n", shoppingList.get(indiceItem));
            }
        }

    }

    // Adicionar itens  da lista
    static void addNewItem() {
        boolean goBack = false;
        while (!goBack) {
            System.out.println("Digite o nome do produto ('<b' para voltar): ");
            item = userInput.nextLine();

            if (item.equals("<b")) {
                goBack = true;
                // validação basica de verificar se o campo esta vazio
            } else if (item.isBlank()) {
                System.out.println("Digite um valor váligo.");
            } else {
                shoppingList.add(item);
                System.out.format("'%s' adicionado a lista\n", item);
            }
        }
    }

    //Edita os itens da lista
    static void editList() {

        boolean goBack = false;
        while (!goBack) {
            showList();
            System.out.println("Digite o numero do item que deseja editar: ");
            int indexItem = userInput.nextInt() - 1;
            if (indexItem < 0 || indexItem > shoppingList.size() - 1) {

                System.out.println("Item inválido, tente novamente.");
                break;
            } else {
                System.out.println("Digite o novo valor do item: ");

                //limpa buffer
                userInput.nextLine();

                String newValue = userInput.nextLine();
                shoppingList.set(indexItem, newValue);
                goBack = true;
            }
            System.out.println("Segue a lista alterada...");
            showList();
        }
    }

    //Sistema principal
    public static void main(String[] args) {

        while (systemRun) {
            showPrincipalMenu();
            System.out.print(">>> ");
            optionMenu = userInput.nextInt();
            // Limpa o resíduo de buffer do Scanner
            userInput.nextLine();

            // Verifica a escolha no MENU principal
            switch (optionMenu) {
                // Se for 0 encerra o programa
                case 0:
                    System.out.println("Programa encerrado...");
                    systemRun = false;
                    break;
                case 1:
                    showList();
                    break;
                case 2:
                    addNewItem();
                    break;
                case 3:
                    editList();
                    break;
                default:
                    System.out.println("Entrada inválida, tente novamente!");
            }
        }
    }
}