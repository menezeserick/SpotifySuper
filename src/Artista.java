import java.util.ArrayList;

class Artista extends Usuario {
    private ArrayList<Album> listaDeAlbuns;
    private ArrayList<Musica> listaDeMusicas;

    public Artista(String nome, String email, String senha, int idade) {
        super(nome, email, senha);
        this.listaDeAlbuns = new ArrayList<>();
        this.listaDeMusicas = new ArrayList<>();
    }

    public void adicionarAlbum(Album album) {
        listaDeAlbuns.add(album);
    }

    public void adicionarMusicaPopular(Musica musica) {
        listaDeMusicas.add(musica);
    }

    public boolean verificarPopularidade(Musica musica) {
        return listaDeMusicas.contains(musica);
    }
}
