package src;
public class Artista  {
    private String nome;
    private String generoMusical;
    private int idade;
    private int qntSeguidores;
    private boolean artistaDisponivel;

    public Artista(String nome, String generoMusical, int idade, int qntSeguidores){
        this.nome = nome;
        this.generoMusical = generoMusical;
        this.idade = idade;
        this.qntSeguidores = qntSeguidores;
        this.artistaDisponivel = true;
    }


    public void mostrarIdade() {
        System.out.println("A idade do artista " + nome + " é " + idade);
    }

    public void mostrarGeneroMusical() {
        System.out.println("O genero musical do artista " + nome + " é " + generoMusical);
    }

    public void mostrarQntSeguidores() {
        System.out.println("A quantidade de seguidores do artista " + nome + " é " + qntSeguidores);
    }

    public void mostrarArtistaDisponivel() {
        if (this.artistaDisponivel = true) {
            System.out.println("O artista " + nome + " está disponível.");
        } else {
            System.out.println("O artista " + nome + " não está disponível no momento.");
        }
    }
}

