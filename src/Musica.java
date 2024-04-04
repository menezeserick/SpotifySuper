import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Musica extends Album {
    private String tituloMusica;
    private int duracao;
    private String genero;

    public Musica(String titulo, String artista, String dataDeLancamento, String tituloMusica, int duracao, String genero) {
        super(titulo, artista, dataDeLancamento);
        this.tituloMusica = tituloMusica;
        this.duracao = duracao;
        this.genero = genero;
    }

    public void reproduzir() {
        System.out.println("Reproduzindo '" + tituloMusica + "' por " + getArtista());
    }

    public void pausar() {
        System.out.println("Música pausada");
    }

    public void avancar() {
        System.out.println("Avançando para a próxima música");
    }

    public int getDuracao() {
        return duracao;
    }
}
