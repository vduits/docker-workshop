package nl.hu.iac.dockerworkshopbackend.controller;

import java.util.List;
import java.util.Optional;
import nl.hu.iac.dockerworkshopbackend.domain.Pet;
import nl.hu.iac.dockerworkshopbackend.repositories.PuppyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("api/pet")
public class PuppyController {

  private PuppyRepository repository;

  @Autowired
  public PuppyController(PuppyRepository repository){
    this.repository = repository;
  }

  @GetMapping("/ping")
  public String ping(){
    return "pong";
  }


  @GetMapping(value="", produces = "application/json")
  public List<Pet> getAllPets() {
    List<Pet> puppy = repository.findAll();
    return puppy;
  }

  @GetMapping(value="/{id}", produces = "application/json")
  public Pet getPuppy(@PathVariable int id) {
    Optional<Pet> puppy = repository.findById(id);
    return puppy.orElse(null);
  }




}
