package com.rociojorge.parkingmanagerDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.rociojorge.parkingmanagerDemo.sorteo.domain.Sorteo;
import com.rociojorge.parkingmanagerDemo.sorteo.domain.Status;

public class SorteoTests {
    
    private Sorteo sorteo;

    @BeforeEach
        public void init(){
        this.sorteo = new Sorteo ("Sorteo 1", "22/02/23", Status.Nuevo);
        }

        @Test
        public void check_sorteo_descripcion() {
            //Arrange
            String expected = "Sorteo 1";
            //Act
            String actual = sorteo.getDescripcion();
            //Assert
            assertEquals(expected, actual);
        }

        @Test
        public void check_sorteo_fecha() {
            String expected = "22/02/23";
            String actual = sorteo.getFecha();
            assertEquals(expected, actual);
        }

        @Test
        public void check_sorteo_estado() {
            String expected = "Aprobado";
            Status actual = sorteo.getEstado();
            assertEquals(expected, actual);
        }

        @Test
        public void check_set_descripcion(){
            
            String expected = "Sorteo prueba";
            sorteo.setDescripcion("Sorteo prueba");
            String actual = sorteo.getDescripcion();
            assertEquals(actual,expected);

        }

        @Test
        public void check_set_fecha(){
            
            String expected = "15/09/2025";
            sorteo.setFecha("15/09/2025");
            String actual = sorteo.getFecha();
            assertEquals(actual,expected);

        }

        @Test
        public void check_set_estado(){
            
            Status expected = Status.Cancelado;
            sorteo.setEstado(Status.Cancelado);
            Status actual = sorteo.getEstado();
            assertEquals(actual,expected);

        }

}
