package model;

public abstract class Animal {
    protected int energia;
    protected int fome;
    protected int felicidade;

    public Animal() {
        this.energia = 100;
        this.fome = 0;
        this.felicidade = 50;
    }

    
    public abstract void brincar();
    public abstract void comer();
    public abstract void dormir();
    public abstract void turno();

    
    protected void ajustarLimites() {
        this.energia = Math.max(0, Math.min(100, this.energia));
        this.fome = Math.max(0, Math.min(100, this.fome));
        this.felicidade = Math.max(0, Math.min(100, this.felicidade));
    }

    // Getters
    public int getEnergia() { return energia; }
    public int getFome() { return fome; }
    public int getFelicidade() { return felicidade; }