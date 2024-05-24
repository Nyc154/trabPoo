package br.edu.unifil.lpoo.equipe.visao;

import br.edu.unifil.lpoo.equipe.controle.Controle;


import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Controle controle = new Controle();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarJogador(controle, scanner);
                    break;
                case 2:
                    cadastrarEquipe(controle, scanner);
                    break;
                case 3:
                    contratarJogador(controle, scanner);
                    break;
                case 4:
                    demitirJogador(controle, scanner);
                    break;
                case 5:
                    listarJogadoresEquipe(controle, scanner);
                    break;
                case 6:
                    listarJogadoresPorPosicao(controle, scanner);
                    break;
                case 9:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 9);
    }

    private static void exibirMenu() {
        System.out.println("Menu:");
        System.out.println("1 - Cadastrar jogador");
        System.out.println("2 - Cadastrar equipe");
        System.out.println("3 - Contratar jogador");
        System.out.println("4 - Demitir jogador");
        System.out.println("5 - Listar jogadores de um time");
        System.out.println("6 - Listar jogadores por posição");
        System.out.println("9 - Encerrar o programa");
    }

    private static void cadastrarJogador(Controle controle, Scanner scanner) {
        System.out.print("Nome do jogador: ");
        String nomeJogador = scanner.next();
        System.out.print("Posição do jogador: ");
        String posicaoJogador = scanner.next();
        controle.cadastrarJogador(nomeJogador, posicaoJogador);
    }

    private static void cadastrarEquipe(Controle controle, Scanner scanner) {
        System.out.print("Nome da equipe: ");
        String nomeEquipe = scanner.next();
        controle.cadastrarEquipe(nomeEquipe);
    }

    private static void contratarJogador(Controle controle, Scanner scanner) {
        System.out.print("Nome da equipe: ");
        String equipeContratar = scanner.next();
        System.out.print("Nome do jogador: ");
        String jogadorContratar = scanner.next();
        controle.contratarJogador(equipeContratar, jogadorContratar);
    }

    private static void demitirJogador(Controle controle, Scanner scanner) {
        System.out.print("Nome da equipe: ");
        String equipeDemitir = scanner.next();
        System.out.print("Nome do jogador: ");
        String jogadorDemitir = scanner.next();
        controle.demitirJogador(equipeDemitir, jogadorDemitir);
    }

    private static void listarJogadoresEquipe(Controle controle, Scanner scanner) {
        System.out.print("Nome da equipe: ");
        String equipeListar = scanner.next();
        System.out.println(controle.listarJogadoresEquipe(equipeListar));
    }

    private static void listarJogadoresPorPosicao(Controle controle, Scanner scanner) {
        System.out.print("Posição dos jogadores a listar: ");
        String posicaoListar = scanner.next();
        System.out.println(controle.listarJogadoresPorPosicao(posicaoListar));
    }
}
