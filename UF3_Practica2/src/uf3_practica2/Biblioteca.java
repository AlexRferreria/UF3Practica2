package uf3_practica2;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Copia> copies;

    public Biblioteca() {
        this.copies = new ArrayList();
    }

    public List<Copia> getCopies() {
        return copies;
    }

    public void setCopies(List<Copia> copies) {
        this.copies = copies;
    }
    
    
}
