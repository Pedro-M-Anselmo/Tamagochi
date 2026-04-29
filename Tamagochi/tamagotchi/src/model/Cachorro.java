package model;

public class Cachorro extends Animal {

    @Override
    public void brincar() {
        this.felicidade += 15;
        this.energia -= 10;
        this.fome += 10;
        ajustarLimites();
    }

    @Override
    public void comer() {
        this.fome -= 20;
        this.energia += 15;
        ajustarLimites();
    }

    @Override
    public void dormir() {
        this.energia += 15;
        this.fome += 10;
        ajustarLimites();
    }

    @Override
    public void turno() {
        this.energia -= 10;
        this.fome += 10;
        this.felicidade -= 5;
        ajustarLimites();
    }
}