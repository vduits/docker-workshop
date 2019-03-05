package nl.hu.iac.dockerworkshopbackend.domain;

import java.sql.Blob;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Puppy {
  @Id
  @GeneratedValue
  private int puppyId;
  private String ras;
  private LocalDate geboorteDatum;
  private String opmerkingen;
  private String geslacht;
  private double standaardprijs;
  private boolean verkocht;
  private Klant klantid;
  private String naam;
  private String afbeelding;

}
