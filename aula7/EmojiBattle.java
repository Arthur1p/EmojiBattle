package aula7;

public class EmojiBattle {

    //Lembrar do f após os dados float
    public static void main(String[] args) {
        Lutador a[] = new Lutador[6];
        
        a[0] = new Lutador("Tyson", "Estados Unidos", 26, 81f, 1.83f, 40, 5, 2);
        a[1] = new Lutador("Carlos", "Brasil", 30, 82f, 1.90f, 10, 2, 3);
        a[2] = new Lutador("Uden", "Alemanha", 23, 56.6f, 1.60f, 30, 15, 0);
        a[3] = new Lutador("Brian", "Dinamarca", 40, 57f, 1.73f, 15, 15, 3);


        Luta EMJ = new Luta();
        EMJ.marcarLuta(a[0], a[1]);
        EMJ.lutar();
        a[0].status();
        a[1].status();

    }
    
}
