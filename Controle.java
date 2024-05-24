package br.edu.unifil.lpoo.equipe.controle;
import br.edu.unifil.lpoo.equipe.modelo.Equipe;
import br.edu.unifil.lpoo.equipe.modelo.Jogador;

import java.util.ArrayList;

public class Controle {
    private ArrayList<Jogador> jogadores;
    private ArrayList<Equipe> equipes;

    public Controle() {
        this.jogadores = new ArrayList<>();
        this.equipes = new ArrayList<>();
    }

    public void cadastrarJogador(String nome, String posicao) {
        Jogador jogador = new Jogador(nome, posicao);
        jogadores.add(jogador);
    }

    public void cadastrarEquipe(String nomeEquipe) {
        Equipe equipe = new Equipe(nomeEquipe);
        equipes.add(equipe);
    }

    public void contratarJogador(String nomeEquipe, String nomeJogador) {
        Equipe equipe = buscarEquipe(nomeEquipe);
        Jogador jogador = buscarJogador(nomeJogador);
        equipe.addJogador(jogador);
    }

    public void demitirJogador(String nomeEquipe, String nomeJogador) {
        Equipe equipe = buscarEquipe(nomeEquipe);
        Jogador jogador = buscarJogador(nomeJogador);
        equipe.removeJogador(jogador);
    }

    public String listarJogadoresEquipe(String nomeEquipe) {
        Equipe equipe = buscarEquipe(nomeEquipe);
        return equipe.listarJogadores();
    }

    public String listarJogadoresPorPosicao(String posicao) {
        StringBuilder jogadoresPorPosicao = new StringBuilder();
        for (Jogador jogador : jogadores) {
            if (jogador.getPosicao().equals(posicao)) {
                jogadoresPorPosicao.append(jogador.getNome()).append("\n");
            }
        }
        return jogadoresPorPosicao.toString();
    }

    private Jogador buscarJogador(String nomeJogador) {
        for (Jogador jogador : jogadores) {
            if (jogador.getNome().equals(nomeJogador)) {
                return jogador;
            }
        }
        throw new IllegalArgumentException("Jogador não encontrado.");
    }

    private Equipe buscarEquipe(String nomeEquipe) {
        for (Equipe equipe : equipes) {
            if (equipe.getNome().equals(nomeEquipe)) {
                return equipe;
            }
        }
        throw new IllegalArgumentException("Equipe não encontrada.");
    }
}
