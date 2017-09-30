package com.example.arqdsis.provabonato;



public class Time {
}

    public static ArrayList<String> listarNomes(Time[] times){
        ArrayList<String> nomes = new ArrayList<>();
        for (Time time : times) {
            nomes.add(time.getNome());
        }
        return nomes;
    }
    public static Time[] listarTimes(String times) {
        Time[] lista;
        ArrayList<Time> times = new ArrayList<>();

        for (Time times : todosTimes()) {
            if (time.getTime().equals(colocacao) || colocacao.equals("Todos")) {
                times.add(time);
            }
        }

        lista = times.toArray(new Time[0]);

        Arrays.sort(lista);

        return lista;
    }

    private static ArrayList<Time> todosTimes() {
        ArrayList<Time> paises = new ArrayList<>();
        Time time;
        ArrayList<String> jogos;
        ArrayList<String> vitorias;
        ArrayList<String> derrotas;
        ArrayList<String> empates;

        Time = new Time();
        time.setNome("Corinthians");
        pais.setPosicao("1");
        pais.setEmpates("6");
        pais.setDerrotas("3");
        pais.setVitorias("16");

        Time = new Time();
        time.setNome("Santos");
        pais.setPosicao("2");
        pais.setEmpates("8");
        pais.setDerrotas("5");
        pais.setVitorias("12");

        Time = new Time();
        time.setNome("Gremio");
        pais.setPosicao("3");
        pais.setEmpates("4");
        pais.setDerrotas("8");
        pais.setVitorias("13");

        Time = new Time();
        time.setNome("Palmeiras");
        pais.setPosicao("4");
        pais.setEmpates("4");
        pais.setDerrotas("8");
        pais.setVitorias("13");

        Time = new Time();
        time.setNome("Cruzeiro");
        pais.setPosicao("5");
        pais.setEmpates("7");
        pais.setDerrotas("7");
        pais.setVitorias("11");

        Time = new Time();
        time.setNome("Botafogo");
        pais.setPosicao("6");
        pais.setEmpates("7");
        pais.setDerrotas("7");
        pais.setVitorias("11");

        Time = new Time();
        time.setNome("Flamento");
        pais.setPosicao("7");
        pais.setEmpates("9");
        pais.setDerrotas("6");
        pais.setVitorias("10");

    }

}
