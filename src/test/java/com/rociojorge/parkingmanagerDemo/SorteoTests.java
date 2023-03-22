package com.rociojorge.parkingmanagerDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.rociojorge.parkingmanagerDemo.sorteo.domain.Sorteo;

public class SorteoTests {
    
    private Sorteo sorteo;

    @BeforeEach
        public void init(){
        this.sorteo = new Sorteo ("Sorteo 1", "22/02/23", "Aprobado");
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
}
