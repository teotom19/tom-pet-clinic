package com.ttomadakis.tompetclinic.services;

import com.ttomadakis.tompetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
