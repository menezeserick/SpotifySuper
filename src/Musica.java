package src;
public class Music extends Artista {
    public String titulo;
    private String album;
    private boolean reproduzindo;  

    public Music(String nome, String generoMusical, int idade, int qntSeguidores, String titulo, String album, boolean reproduzindo){
        super(nome, generoMusical, idade, qntSeguidores);
        this.titulo = titulo;
        this.album = album;
        this.reproduzindo = reproduzindo;
    }
}    

