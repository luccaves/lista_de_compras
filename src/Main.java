import com.sun.source.tree.WhileLoopTree;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    //Inicialização dos OBJETOS
    static Scanner userInput = new Scanner(System.in);
    static ArrayList<String> shoppinngList = new ArrayList<String>();

    //Inicialização de VARIÁVEIS
    static boolean systemRun = true;
    static int optionMenu;

    //Métodos de visualização de MENU
    static void showPrincipalMenu() {
        System.out.println("--------------------------------");
        System.out.println("        LISTA DE COMPRAS");
        System.out.println("--------------------------------");
        System.out.println("Escolha a opção desejada:");
        System.out.println("0 -> SAIR");
        System.out.println("1 -> EXIBIR LISTA");
        System.out.println("2 -> CRIA LISTA");
        System.out.println("3 -> EDITAR LISTA");
        System.out.println("4 -> EXCLUIR LISTA");

    }
    public static void main(String[] args) {

        while (systemRun) {
            showPrincipalMenu();
            System.out.print(">>> ");
            optionMenu = userInput.nextInt();
        }


    }

}