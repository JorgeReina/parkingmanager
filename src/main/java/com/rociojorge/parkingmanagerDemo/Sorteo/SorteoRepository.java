package com.rociojorge.parkingmanagerDemo.Sorteo;

import java.util.ArrayList;
import java.util.List;

public class SorteoRepository {

    private ArrayList<Sorteo> sorteo;
    public  SorteoRepository() {
        sorteo = new ArrayList<>();
    }

    public List<Sorteo> getAll() {
        
        this.sorteo.clear();
        this.sorteo.add(new Sorteo("Sorteo 1", "08/02/2023", "Apto"));
        return this.sorteo;

    }

}
