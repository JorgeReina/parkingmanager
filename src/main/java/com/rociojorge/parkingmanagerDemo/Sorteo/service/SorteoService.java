package com.rociojorge.parkingmanagerDemo.sorteo.service;

import com.rociojorge.parkingmanagerDemo.sorteo.domain.*;

public interface SorteoService {
    
    public Iterable<Sorteo> getAll();
    
    public void register(SorteoDao sorteoDao);
    
}
