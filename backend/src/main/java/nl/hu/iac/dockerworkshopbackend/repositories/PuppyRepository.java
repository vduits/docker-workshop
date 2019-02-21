package nl.hu.iac.dockerworkshopbackend.repositories;

import nl.hu.iac.dockerworkshopbackend.domain.Puppy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface PuppyRepository extends JpaRepository<Puppy, Integer> {

}
