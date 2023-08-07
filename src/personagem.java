public class personagem {
    private String nome;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
    this.nome = nome;
}

public void setIdade(int idade) {
        this.idade = idade;
    }

private int idade; 

    public int getIdade() {
    return idade;
}

    public void setVida(int vida) {
    this.vida = vida;
}

    private int vida = 100;
    private String escolha;
    public void setEscolha(String escolha) {
        this.escolha = escolha;
    }

    private int energia = 100;

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    void gastarenergia(int valor){
        this.energia -= valor;
        if (energia <= 0) {
            energia = 0;
            System.out.println("seu personagem morreu");
        }
    }
}
