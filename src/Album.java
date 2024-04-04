import java.util.ArrayList;
import java.util.List;

class Album {
    private String titulo;
    private String artista;
    private List<Musica> listaDeMusicas;
    private String dataDeLancamento;

    public Album(String titulo, String artista, String dataDeLancamento) {
        this.titulo = titulo;
        this.artista = artista;
        this.dataDeLancamento = dataDeLancamento;
        this.listaDeMusicas = new ArrayList<>();
    }

    public void adicionarMusica(Musica musica) {
        listaDeMusicas.add(musica);
    }

    public void removerMusica(Musica musica) {
        listaDeMusicas.remove(musica);
    }

    public int obterDuracaoTotal() {
        int duracaoTotal = 0;
        for (Musica musica : listaDeMusicas) {
            duracaoTotal += musica.getDuracao();
        }
        return duracaoTotal;
    }
    public String getArtista(){
        return artista;
    }
}