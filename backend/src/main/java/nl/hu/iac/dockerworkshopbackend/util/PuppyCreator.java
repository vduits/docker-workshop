package nl.hu.iac.dockerworkshopbackend.util;

import javax.annotation.PostConstruct;
import nl.hu.iac.dockerworkshopbackend.domain.Puppy;
import nl.hu.iac.dockerworkshopbackend.repositories.PuppyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PuppyCreator {

  private PuppyRepository repository;

  @Autowired
  public PuppyCreator(PuppyRepository repository){
    this.repository = repository;
  }

  @PostConstruct
  public void init(){
    Puppy puppy = new Puppy(1,"Mitchell's Puppy");
    repository.save(puppy);
  }

}
