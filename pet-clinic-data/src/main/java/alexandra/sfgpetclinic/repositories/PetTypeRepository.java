package alexandra.sfgpetclinic.repositories;

import alexandra.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;


public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
