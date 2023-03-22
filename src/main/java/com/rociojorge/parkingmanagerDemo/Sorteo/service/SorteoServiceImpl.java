package com.rociojorge.parkingmanagerDemo.sorteo.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rociojorge.parkingmanagerDemo.sorteo.domain.*;

@Service
public class SorteoServiceImpl implements SorteoService{

    private SorteoRepository sorteoRepository;

    @Autowired
    public SorteoServiceImpl(SorteoRepository sorteoRepository){
        this.sorteoRepository = sorteoRepository;
    }

    @Override
    public Iterable<Sorteo> getAll() {
        return this.sorteoRepository.findAll();
    }

    @Override
    public void register(SorteoDao sorteoDao) {

        Sorteo sorteo = new Sorteo(null, null, null);
        BeanUtils.copyProperties(sorteoDao, sorteo);
        this.sorteoRepository.save(sorteo);
    }
    
}

