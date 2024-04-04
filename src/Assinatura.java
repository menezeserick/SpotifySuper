package src;

public class Assinatura {
        private String nome;
        private float precoMensal;
        private int numeroMaximoMusicas;
    
        public PlanoAssinatura(String nome, float precoMensal, int numeroMaximoMusicas){
            this.nome = nome;
            this.precoMensal = precoMensal;
            this.numeroMaximoMusicas = numeroMaximoMusicas;
        }
    
        public String getNome() {
            return nome;
        }
    
        public double getPrecoMensal() {
            return precoMensal;
        }
    
        public int getNumeroMaximoMusicas() {
            return numeroMaximoMusicas;
        }
    
        public void exibirDetalhes() {
            System.out.println("Plano: " + nome);
            System.out.println("Preço Mensal: R$" + precoMensal);
            System.out.println("Número Máximo de Músicas: " + numeroMaximoMusicas);
        }
}

