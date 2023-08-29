import java.util.Scanner;

public class Capitulo_Imagem extends capitulo {

    public Capitulo_Imagem(personagem pj, Scanner scan) {
        super(pj, scan);
        //TODO Auto-generated constructor stub
    }
    private String imagem;
    public String getImagem() {
        return imagem;
    }
    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
    public void mostra(){
        System.out.println(imagem);
        super.mostra();
         
    }
}
