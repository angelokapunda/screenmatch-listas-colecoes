package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PrincipalListas {

    public static void main(String[] args) {

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(8);
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Serie lost = new Serie("Lost", 2000);
        lost.avalia(7);
        Filme filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);

        ArrayList<Titulo> list = new ArrayList<>();
        list.add(filmeDoPaulo);
        list.add(meuFilme);
        list.add(outroFilme);
        list.add(lost);


        for (Titulo item : list) {
            System.out.println(item);
            if (item instanceof Filme filme)
            System.out.println("Classificação :" + filme.getClassificacao());
        }

        Collections.sort(list);

        ArrayList<String> buscaNome = new ArrayList<>();
        buscaNome.add("Capunda");
        buscaNome.add("Bambucga");
        buscaNome.add("Hermengildo");

        System.out.println("--------------------------------------------------------------------------");
        System.out.println(buscaNome);

        Collections.sort(buscaNome);
        System.out.println(buscaNome);

        Collections.sort(list);
        System.out.println(list);


    }
}
