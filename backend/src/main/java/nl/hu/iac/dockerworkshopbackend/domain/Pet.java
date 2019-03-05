package nl.hu.iac.dockerworkshopbackend.domain;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Pet {
  @Id
  @GeneratedValue
  private int petId;
  private String ras;
  private LocalDate geboorteDatum;
  private String opmerkingen;
  private String geslacht;
  private double standaardprijs;
  private boolean verkocht;
  @OneToOne
  private Klant klantId;
  private String name;
  private String image;
  private String description;

}
