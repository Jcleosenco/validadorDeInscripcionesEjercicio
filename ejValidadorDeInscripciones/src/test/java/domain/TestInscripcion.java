package domain;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class TestInscripcion {

    @Test
    public void testAprobadaTrue() {
        Alumno alumno = new Alumno("Juan");
        Materia algoritmos = new Materia("Algoritmos y Estructuras de Datos");
        Materia paradigmas = new Materia("Paradigmas de Programación");
        Materia diseñoSistemas = new Materia("Diseño de Sistemas");

        paradigmas.agregarCorrelativas(algoritmos);
        diseñoSistemas.agregarCorrelativas(paradigmas);

        alumno.agregarMateriasAprobadas(algoritmos, paradigmas);
        Inscripcion inscripcion = new Inscripcion(alumno);
        inscripcion.agregarMateria(diseñoSistemas);

        assertTrue(inscripcion.aprobada());
    }

    @Test
    public void testAprobadaFalse() {
        Alumno alumno = new Alumno("Maria");
        Materia algoritmos = new Materia("Algoritmos y Estructuras de Datos");
        Materia paradigmas = new Materia("Paradigmas de Programación");
        Materia diseñoSistemas = new Materia("Diseño de Sistemas");

        paradigmas.agregarCorrelativas(algoritmos);
        diseñoSistemas.agregarCorrelativas(paradigmas);

        alumno.agregarMateriasAprobadas(algoritmos);
        Inscripcion inscripcion = new Inscripcion(alumno);
        inscripcion.agregarMateria(diseñoSistemas);

        assertFalse(inscripcion.aprobada());
    }
}