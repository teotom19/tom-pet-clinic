package com.ttomadakis.tompetclinic.services;

import com.ttomadakis.tompetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
