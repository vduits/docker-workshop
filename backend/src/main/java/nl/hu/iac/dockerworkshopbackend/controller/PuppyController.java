package nl.hu.iac.dockerworkshopbackend.controller;

import java.util.Optional;
import nl.hu.iac.dockerworkshopbackend.domain.Puppy;
import nl.hu.iac.dockerworkshopbackend.repositories.PuppyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/puppy")
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

  @GetMapping(value="/{id}", produces = "application/json")
  public Puppy getPuppy(@PathVariable int id) {
    Optional<Puppy> puppy = repository.findById(id);
    return puppy.orElse(null);
  }


}
