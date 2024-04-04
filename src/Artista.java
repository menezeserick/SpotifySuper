package src;
public class Artista extends Music {
    private String generoMusical;
    private int idade;
    private int qntSeguidores;
    private boolean artistaDisponivel;

    public Artista(String nome, String generoMusical, int idade, int qntSeguidores){
        super(nome);
        this.generoMusical = generoMusical;
        this.idade = idade;
        this.qntSeguidores = qntSeguidores;
    }


    public void mostrarIdade() {
        System.out.println("A idade do artista " + this.nome + " é " + this.idade);
    }

    public void mostrarGeneroMusical() {
        System.out.println("O genero musical do artista " + this.nome + " é " + this.generoMusical);
    }

    public void mostrarQntSeguidores() {
        System.out.println("A quantidade de seguidores do artista " + this.nome + " é " + this.qntSeguidores);
    }

    public void mostrarArtistaDisponivel() {
        if (this.artistaDisponivel = true) {
            System.out.println("O artista " + this.nome + " está disponível.");
        } else {
            System.out.println("O artista " + this.nome + " não está disponível no momento.");
        }

    }
}

