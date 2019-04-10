package nl.hu.iac.dockerworkshopbackend.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Klant {
  @Id
  @GeneratedValue
  private int klantId;
  private String voornaam;
  private String tussenvoegsel;
  private String achternaam;
  private String telefoonnummer;
  private String emailadres;

  @java.beans.ConstructorProperties({"klantId", "voornaam", "tussenvoegsel", "achternaam",
      "telefoonnummer", "emailadres"})
  public Klant(int klantId, String voornaam, String tussenvoegsel, String achternaam,
      String telefoonnummer, String emailadres) {
    this.klantId = klantId;
    this.voornaam = voornaam;
    this.tussenvoegsel = tussenvoegsel;
    this.achternaam = achternaam;
    this.telefoonnummer = telefoonnummer;
    this.emailadres = emailadres;
  }

  public Klant() {
  }

  public int getKlantId() {
    return this.klantId;
  }

  public String getVoornaam() {
    return this.voornaam;
  }

  public String getTussenvoegsel() {
    return this.tussenvoegsel;
  }

  public String getAchternaam() {
    return this.achternaam;
  }

  public String getTelefoonnummer() {
    return this.telefoonnummer;
  }

  public String getEmailadres() {
    return this.emailadres;
  }

  public void setKlantId(int klantId) {
    this.klantId = klantId;
  }

  public void setVoornaam(String voornaam) {
    this.voornaam = voornaam;
  }

  public void setTussenvoegsel(String tussenvoegsel) {
    this.tussenvoegsel = tussenvoegsel;
  }

  public void setAchternaam(String achternaam) {
    this.achternaam = achternaam;
  }

  public void setTelefoonnummer(String telefoonnummer) {
    this.telefoonnummer = telefoonnummer;
  }

  public void setEmailadres(String emailadres) {
    this.emailadres = emailadres;
  }

  public boolean equals(final Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof Klant)) {
      return false;
    }
    final Klant other = (Klant) o;
    if (!other.canEqual((Object) this)) {
      return false;
    }
    if (this.getKlantId() != other.getKlantId()) {
      return false;
    }
    final Object this$voornaam = this.getVoornaam();
    final Object other$voornaam = other.getVoornaam();
    if (this$voornaam == null ? other$voornaam != null : !this$voornaam.equals(other$voornaam)) {
      return false;
    }
    final Object this$tussenvoegsel = this.getTussenvoegsel();
    final Object other$tussenvoegsel = other.getTussenvoegsel();
    if (this$tussenvoegsel == null ? other$tussenvoegsel != null
        : !this$tussenvoegsel.equals(other$tussenvoegsel)) {
      return false;
    }
    final Object this$achternaam = this.getAchternaam();
    final Object other$achternaam = other.getAchternaam();
    if (this$achternaam == null ? other$achternaam != null
        : !this$achternaam.equals(other$achternaam)) {
      return false;
    }
    final Object this$telefoonnummer = this.getTelefoonnummer();
    final Object other$telefoonnummer = other.getTelefoonnummer();
    if (this$telefoonnummer == null ? other$telefoonnummer != null
        : !this$telefoonnummer.equals(other$telefoonnummer)) {
      return false;
    }
    final Object this$emailadres = this.getEmailadres();
    final Object other$emailadres = other.getEmailadres();
    if (this$emailadres == null ? other$emailadres != null
        : !this$emailadres.equals(other$emailadres)) {
      return false;
    }
    return true;
  }

  protected boolean canEqual(final Object other) {
    return other instanceof Klant;
  }

  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    result = result * PRIME + this.getKlantId();
    final Object $voornaam = this.getVoornaam();
    result = result * PRIME + ($voornaam == null ? 43 : $voornaam.hashCode());
    final Object $tussenvoegsel = this.getTussenvoegsel();
    result = result * PRIME + ($tussenvoegsel == null ? 43 : $tussenvoegsel.hashCode());
    final Object $achternaam = this.getAchternaam();
    result = result * PRIME + ($achternaam == null ? 43 : $achternaam.hashCode());
    final Object $telefoonnummer = this.getTelefoonnummer();
    result = result * PRIME + ($telefoonnummer == null ? 43 : $telefoonnummer.hashCode());
    final Object $emailadres = this.getEmailadres();
    result = result * PRIME + ($emailadres == null ? 43 : $emailadres.hashCode());
    return result;
  }

  public String toString() {
    return "Klant(klantId=" + this.getKlantId() + ", voornaam=" + this.getVoornaam()
        + ", tussenvoegsel=" + this.getTussenvoegsel() + ", achternaam=" + this.getAchternaam()
        + ", telefoonnummer=" + this.getTelefoonnummer() + ", emailadres=" + this.getEmailadres()
        + ")";
  }
}
