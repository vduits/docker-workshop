package nl.hu.iac.dockerworkshopbackend.domain;

import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Klant {
  private int klantId;
  private String voornaam;
  private String tussenvoegsel;
  private String achternaam;
  private String telefoonnummer;
  private String emailadres;
}
