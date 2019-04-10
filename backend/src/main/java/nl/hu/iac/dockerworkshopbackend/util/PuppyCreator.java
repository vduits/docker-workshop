package nl.hu.iac.dockerworkshopbackend.util;

import javax.annotation.PostConstruct;
import nl.hu.iac.dockerworkshopbackend.domain.Pet;
import nl.hu.iac.dockerworkshopbackend.repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PuppyCreator {

  private PetRepository repository;

  @Autowired
  public PuppyCreator(PetRepository repository){
    this.repository = repository;
  }

  @PostConstruct
  public void init(){
    Pet pet = new Pet();
    pet.setName("Sara");
    pet.setDescription("Pet looking for a new home");
    pet.setImage("https://i.redd.it/gokh4edu7br21.jpg");
    repository.saveAndFlush(pet);

//    Pet pet4 = new Pet();
//    pet.setName("Rub II");
//    pet.setDescription("The better twin");
//    pet.setImage("https://i.imgur.com/d2mt4M6.jpg");
//    repository.save(pet4);
  }

}
