package com.alexandra.pet_clinic.services;

import com.alexandra.pet_clinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
