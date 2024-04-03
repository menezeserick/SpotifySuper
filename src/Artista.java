public class Artist {
    private String GeneroMusical;
    private int Idade;
    private int QntSeguidores;
    private boolean ArtistaDisponivel;

    public Artista extends Music(String Nome, String GeneroMusical, int Idade, int QntSeguidores){
        super(nome);
        this.GeneroMusical = genero;
        this.Idade = idade;
        this.QntSeguidores = QuantidadeSeguidores;
    }

    public void mostrarIdade() {
        System.out.println("A idade do artista " + this.Nome + " é " + this.Idade);
    }

    public void mostrarGeneroMusical() {
        System.out.println("O genero musical do artista " + this.Nome + " é " + this.GeneroMusical);
    }

    public void mostrarQntSeguidores() {
        System.out.println("A quantidade de seguidores do artista " + this.Nome + " é " + this.QntSeguidores);
    }

    public void mostrarArtistaDisponivel() {
        if (this.ArtistaDisponivel = true) {
            System.out.println("O artista " + this.Nome + " está disponível.");
        } else {
            System.out.println("O artista " + this.Nome + " não está disponível no momento.");
        }

    }
}

