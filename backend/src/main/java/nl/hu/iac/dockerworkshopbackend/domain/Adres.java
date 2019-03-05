package nl.hu.iac.dockerworkshopbackend.domain;

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
public class Adres {

  @Id
  @GeneratedValue
  private int adresId;
  private String provincie;
  private String woonplaats;
  private String straatnaam;
  private String huisnummer;
  private String postcode;
  @OneToOne
  private Klant klantId;
}
