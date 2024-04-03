package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Materia {
    public String nombre;
    public List<Materia> correlativas;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.correlativas = new ArrayList<>();
    }

    public List<Materia> getCorrelativas() {
        return this.correlativas;
    }

    public void agregarCorrelativas(Materia ... correlativas) {
        Collections.addAll(this.correlativas, correlativas);
    }
}
