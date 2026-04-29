import model.Gato;
import model.Dragao;
import model.Cachorro;

public class Main {
    public static void main(String[] args) {
        
        Gato meuGato = new Gato();
        Dragao meuDragao = new Dragao();

        System.out.println("--- Status Inicial ---");
        System.out.println("Gato - Energia: " + meuGato.getEnergia() + " | Felicidade: " + meuGato.getFelicidade());

        
        System.out.println("\n> Hora de brincar com o gato!");
        meuGato.brincar();

        System.out.println("> O Dragão está comendo...");
        meuDragao.comer();

      
        System.out.println("\n--- Status Final ---");
        System.out.println("Gato - Energia: " + meuGato.getEnergia() + " | Felicidade: " + meuGato.getFelicidade());
        System.out.println("Dragão - Fome: " + meuDragao.getFome() + " | Energia: " + meuDragao.getEnergia());
    }
}