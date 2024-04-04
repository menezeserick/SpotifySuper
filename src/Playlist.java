import java.util.ArrayList;
import java.util.Random;

class Playlist {
    private String nome;
    private ArrayList<Musica> listaDeMusicas;
    private int qntDeMusicas;

    public Playlist(String nome, int qntDeMusicas) {
        this.nome = nome;
        this.qntDeMusicas = qntDeMusicas;
        this.listaDeMusicas = new ArrayList<Musica>(qntDeMusicas);
    }

    public void adicionarMusica(Musica musica) {
        listaDeMusicas.add(musica);
        qntDeMusicas++;
    }

    public void removerMusica(Musica musica) {
        listaDeMusicas.remove(musica);
        qntDeMusicas--;
    }

    public void ordemAleatoria() {
        Random random = new Random();
        for (int i = listaDeMusicas.size() - 1; i > 0; i--) {
            int aleatorio = random.nextInt(i + 1);
            Musica tempoMusica = listaDeMusicas.get(i);
            listaDeMusicas.set(i, listaDeMusicas.get(aleatorio));
            listaDeMusicas.set(aleatorio, tempoMusica);
        }
    }

    public String getNome(){
        return nome;
    }


}