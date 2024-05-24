package br.edu.unifil.lpoo.equipe.modelo;


import java.util.ArrayList;

public class Equipe {
    private String nome;
    private ArrayList<Jogador> jogadores;

    public Equipe(String nome) {
        this.nome = nome;
        this.jogadores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null) {
            throw new IllegalArgumentException("Nome da equipe não pode ser nulo.");
        }
        this.nome = nome;
    }

    public void addJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    public void removeJogador(Jogador jogador) {
        jogadores.remove(jogador);
    }

    public String listarJogadores() {
        StringBuilder listaJogadores = new StringBuilder();
        for (Jogador jogador : jogadores) {
            listaJogadores.append(jogador.getNome()).append("\n");
        }
        return listaJogadores.toString();
    }

    public Jogador getJogador(String nomeJogador) {
        for (Jogador jogador : jogadores) {
            if (jogador.getNome().equals(nomeJogador)) {
                return jogador;
            }
        }
        throw new IllegalArgumentException("Jogador não encontrado na equipe.");
    }
}