package alexandra.sfgpetclinic.services;

import alexandra.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

   Owner finfById(Long id);

   Owner save(Owner owner);

   Set<Owner> findAll();
}
