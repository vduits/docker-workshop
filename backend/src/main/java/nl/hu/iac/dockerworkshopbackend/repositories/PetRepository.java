package nl.hu.iac.dockerworkshopbackend.repositories;

import nl.hu.iac.dockerworkshopbackend.domain.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface PetRepository extends JpaRepository<Pet, Integer> {

}
