package nl.hu.iac.dockerworkshopbackend.util;

import javax.annotation.PostConstruct;
import nl.hu.iac.dockerworkshopbackend.domain.Pet;
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
    Pet pet = new Pet();
    pet.setName("Mitchell's Puppy");
    pet.setDescription("puppy die ie kwijt is");
    pet.setImage("https://d308toqq2zpasi.cloudfront.net/images/pet_listings/dog/f/dd/c4/id_5867130/7b641b/american-pit-bull-terrier-boxer-dog-for-adoption_large.jpeg");
    repository.save(pet);
  }

}
