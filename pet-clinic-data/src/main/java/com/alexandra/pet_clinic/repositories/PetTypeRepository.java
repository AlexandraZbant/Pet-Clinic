package com.alexandra.pet_clinic.repositories;

import com.alexandra.pet_clinic.model.PetType;
import org.springframework.data.repository.CrudRepository;


public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
