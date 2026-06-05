import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //Inicialização dos OBJETOS
    static Scanner userInput = new Scanner(System.in);
    static ArrayList<String> shoppinngList = new ArrayList<>();

    //Inicialização de VARIÁVEIS
    static boolean systemRun = true;
    static int optionMenu;
    static String item;


    //Métodos de visualização de MENU
    static void showPrincipalMenu() {
        System.out.println("--------------------------------");
        System.out.println("        LISTA DE COMPRAS");
        System.out.println("--------------------------------");
        System.out.println("Escolha a opção desejada:");
        System.out.println("0 -> SAIR (Encerra o programa)");
        System.out.println("1 -> EXIBIR LISTA");
        System.out.println("2 -> CRIAR LISTA");
//        System.out.println("3 -> EDITAR LISTA");
//        System.out.println("4 -> EXCLUIR LISTA");

    }

    ///Métodos principais
    //Exibir os itens da lista
    static void showList() {

        //checa se a lista ja existe antes de exibi-la na tela
        if (shoppinngList.isEmpty()) {
            System.out.println("A lista esta vázia.");

        } else {
            for (int indiceItem = 0; indiceItem < shoppinngList.size(); indiceItem++) {
                System.out.printf("%d - ", indiceItem+1);
                System.out.printf("%s\n",shoppinngList.get(indiceItem));
            }
        }

    }

    // Adicionar itens  alista
    static void addNewItem(String item) {
        shoppinngList.add(item);
    }

    public static void main(String[] args) {

        while (systemRun) {
            showPrincipalMenu();
            System.out.print(">>> ");
            optionMenu = userInput.nextInt();

            // Verifica a escolha no MENU principal
            switch (optionMenu) {
                // Se for 0 enncerra o programa
                case 0:
                    System.out.println("Programa encerrado...");
                    systemRun = false;

                case 1:
                    showList();

            }
        }


    }

}