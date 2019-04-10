package nl.hu.iac.dockerworkshopbackend.controller;

import java.util.List;
import java.util.Optional;
import nl.hu.iac.dockerworkshopbackend.domain.Pet;
import nl.hu.iac.dockerworkshopbackend.repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("api/pet")
public class PetController {

  private PetRepository repository;

  @Autowired
  public PetController(PetRepository repository){
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

  @PostMapping(consumes = "application/json")
  public void savePet(@RequestBody Pet pet){
    System.out.println(pet);
    repository.save(pet);
  }

  @DeleteMapping(value="/{id}")
  public void deletePet(@PathVariable int id){
    repository.deleteById(id);
  }



}
