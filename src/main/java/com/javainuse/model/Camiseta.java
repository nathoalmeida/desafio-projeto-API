package com.javainuse.model;



import java.util.Objects;


public class Camiseta {


    private String id;

    private String tamanho;

    private String cor;

    private String estampa;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getEstampa() {
        return estampa;
    }

    public void setEstampa(String estampa) {
        this.estampa = estampa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Camiseta camiseta = (Camiseta) o;
        return Objects.equals(id, camiseta.id) && Objects.equals(tamanho, camiseta.tamanho) && Objects.equals(cor, camiseta.cor) && Objects.equals(estampa, camiseta.estampa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tamanho, cor, estampa);
    }

    @Override
    public String toString() {
        return "Camiseta{" +
                "id='" + id + '\'' +
                ", tamanho='" + tamanho + '\'' +
                ", cor='" + cor + '\'' +
                ", estampa='" + estampa + '\'' +
                '}';
    }
}
