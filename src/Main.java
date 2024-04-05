import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao Spotify!");
        exibirMenu();
        System.out.println("Até mais!");
    }

    public static void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        Usuario usuario = null;
        int opcao;
        do {
            System.out.println("\nSelecione uma opção:");
            System.out.println("1. Cadastrar Usuário");
            System.out.println("2. Criar Playlist");
            System.out.println("3. Adicionar Música à Playlist");
            System.out.println("4. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

        