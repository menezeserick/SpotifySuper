package src;
public class Artist extends Music {
    private String GeneroMusical;
    private int Idade;
    private int QntSeguidores;
    private boolean ArtistaDisponivel;

    public Artist(String Nome, String GeneroMusical, int Idade, int QntSeguidores){
        super(nome);
        this.GeneroMusical = GeneroMusical;
        this.Idade = Idade;
        this.QntSeguidores = QntSeguidores;
}


    public void mostrarIdade() {
        System.out.println("A idade do artista " + this.nome + " é " + this.Idade);
    }

    public void mostrarGeneroMusical() {
        System.out.println("O genero musical do artista " + this.nome + " é " + this.GeneroMusical);
    }

    public void mostrarQntSeguidores() {
        System.out.println("A quantidade de seguidores do artista " + this.nome + " é " + this.QntSeguidores);
    }

    public void mostrarArtistaDisponivel() {
        if (this.ArtistaDisponivel = true) {
            System.out.println("O artista " + this.nome + " está disponível.");
        } else {
            System.out.println("O artista " + this.nome + " não está disponível no momento.");
        }

    }
}

