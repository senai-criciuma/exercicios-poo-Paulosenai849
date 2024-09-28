package Carro;

public class Carro {
    private String marca;
    private int modelo;
    private int ano;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public void acelerar(){
        System.out.println("o carro esta acelerando");
    }
    public void frear(){
        System.out.println("o carro esta freando");
    }
    public void darRe(){
        System.out.println("o carro esta dando re");
    }
}
