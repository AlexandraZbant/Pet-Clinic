package com.alexandra.pet_clinic.repositories;

import com.alexandra.pet_clinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
