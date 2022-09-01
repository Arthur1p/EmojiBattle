package aula7;

import java.util.Random;

public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    //Metodos publicos
    public void marcarLuta(Lutador a1, Lutador a2){
        if (a1.getCategoria().equals(a2.getCategoria()) && a1 != a2){

            this.aprovada = true;
            this.desafiado = a1;
            this.desafiante = a2;
        } else {
            this.aprovada = false;
            System.out.println("Luta não pode ser aprovada.");
        }
    }

    public void lutar(){
        if (this.aprovada){
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch(vencedor){
                case 0: //Empate
                    System.out.println("EMPATOU!!!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: //Desafiado vence
                    System.out.println(this.desafiado + " foi o vitorioso!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: //Desafiante vence
                    System.out.println(this.desafiante + " foi o vencedor!");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }

        } else {
            System.out.println("A luta não pode acontecer.");
        }
    }

    //Metodos especiais
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }


    
}
