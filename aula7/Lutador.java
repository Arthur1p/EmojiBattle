package aula7;

public class Lutador {
    //Atributos
    private String nome, nacionalidade;
    private int idade;
    private float peso, altura;
    private String categoria;
    private int vitorias, derrotas, empates;
    
    //Métodos péblicos
    public void apresentar(){
        System.out.println("_____________________________________________________");
        System.out.println("Apresentando o lutador " + this.getNome() + "!!!");
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("Com apenas " + this.getIdade() + " anos!");
        System.out.println("Pesando aproximadamente " +this.getPeso() + "Kg!");
        System.out.println("Com " + this.getVitorias() + " vitorias e " + this.getDerrotas() + " derrotas");
        System.out.println("e " + this.getEmpates() + " empates!");
    }

    public void status(){
        System.out.println("--------------------------------------------");
        System.out.println(this.getNome() + " é da categoria " + this.getCategoria());
        System.out.println(this. getVitorias() + " vitorias.");
        System.out.println(this. getDerrotas() + " derrotas.");
        System.out.println(this. getEmpates() + " empates.");

    }

    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    //Métodos especiais

    public Lutador(String no, String na, int id, float pe, float al, int vi, int de,
            int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.setPeso(pe);
        this.altura = al;
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso < 52.2){
            this.categoria = "Invalido";
        } else if(this.peso <= 70.3){
            this.categoria = "Leve";
        } else if(this.peso <= 83.9){
            this.categoria = "Médio";
        } else if(this.peso <= 120.2){
            this.categoria = "Pesado";
        } else {
            this.categoria = "Invalido";
        }
    
    
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

}
