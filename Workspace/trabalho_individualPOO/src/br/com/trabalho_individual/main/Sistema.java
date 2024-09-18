package br.com.trabalho_individual.main;

import br.com.trabalho_individual.entidade.Pessoa;
import br.com.trabalho_individual.entidade.Serie;
import java.util.ArrayList;
import java.util.List;

public class Sistema {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        List<Serie> series = new ArrayList<>();


        Menu menu = new Menu(pessoas, series);
        //menu
        menu.exibirMenu();
    }
}
