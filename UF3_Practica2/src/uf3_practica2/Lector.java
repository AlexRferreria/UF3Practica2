package uf3_practica2;

public class Lector {

    private String[] llibresPrestec;

    private int maxLlibres;

    public Lector(int maxLlibres) {
        this.maxLlibres = 3;
        this.llibresPrestec = new String[maxLlibres];
    }

    public String[] getLlibresPrestec() {
        return llibresPrestec;
    }

    public void setLlibresPrestec(String[] llibresPrestec) {
        this.llibresPrestec = llibresPrestec;
    }

    public int getMaxLlibres() {
        return maxLlibres;
    }

    public void setMaxLlibres(int maxLlibres) {
        this.maxLlibres = maxLlibres;
    }
    
    
}
