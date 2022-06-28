package alexandra.sfgpetclinic.services;

import alexandra.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet finfById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
