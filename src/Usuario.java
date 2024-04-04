import java.util.ArrayList;
public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private ArrayList<Playlist> listaDePlaylists;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.listaDePlaylists = new ArrayList<>();
    }
    public void criarPlaylist(String nomePlaylist) {
        Playlist novaPlaylist = new Playlist(nomePlaylist, 0);
        listaDePlaylists.add(novaPlaylist);
    }

    public void adicionarMusicaAPlaylist(String nomePlaylist, Musica musica) {
        for (Playlist playlist : listaDePlaylists) {
            if (playlist.getNome().equals(nomePlaylist)) {
                playlist.adicionarMusica(musica);
                break;
            }
        }
    }

    public void removerMusicaDaPlaylist(String nomePlaylist, Musica musica) {
        for (Playlist playlist : listaDePlaylists) {
            if (playlist.getNome().equals(nomePlaylist)) {
                playlist.removerMusica(musica);
                break;
            }
        }
    }
}
