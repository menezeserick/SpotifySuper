package src;
import java.util.ArrayList;
public class Album {
    private String titulo;
    private Artista artista;
    private ArrayList<Musica> musicas;

    public Album(String titulo, Artista artista) {
        this.titulo = titulo;
        this.artista = artista;
        this.musicas = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }

    public void listarMusicas() {
        System.out.println("Músicas do álbum " + titulo + " de " + artista.getNome() + ":");
        for (Musica musica : musicas) {
            System.out.println(musica.getTitulo());
        }
    }
}

}
