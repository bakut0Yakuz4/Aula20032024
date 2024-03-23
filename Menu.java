package Aula20032024;

import java.util.ArrayList;

public class Menu {
    public void listar(ArrayList<Usuario> u) {
        System.out.println("\nListando usuarios...");
        for (Usuario usuario : u) {
            System.out.println("\n");
            System.out.println("Nome: " + usuario.getNome());
            System.out.println("Idade: " + usuario.getIdade());
            System.out.println("RG: " + usuario.getRG());
            System.out.println("Endereço: " + usuario.getEndereco());
            System.out.println("CPF: " + usuario.getCPF());
        }
    }
    public void menuI() {
        System.out.println("---- Menu ----:");
        System.out.println("1 - Cadastrar usuário");
        System.out.println("2 - Sair");
    }

    public static void main(String[] args) {
        Menu menu = new Menu();

        Usuario u1 = new Usuario("Abner", 90, "113213401", "Rua das Ruas", "01233212394");
        Usuario u2 = new Usuario("Maria", 30, "113443322", "Rua das outras Ruas", "01233869403");
        Usuario u3 = new Usuario("Pedro", 35, "665445644", "Rua das Avenidas", "85940323945");

        ArrayList<Usuario> u = new ArrayList<>();
        u.add(u1);
        u.add(u2);
        u.add(u3);

        menu.menuI();
        menu.listar(u);
    }
}

