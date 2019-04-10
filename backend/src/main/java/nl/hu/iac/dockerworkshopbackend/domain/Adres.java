package nl.hu.iac.dockerworkshopbackend.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

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

  @java.beans.ConstructorProperties({"adresId", "provincie", "woonplaats", "straatnaam",
      "huisnummer", "postcode", "klantId"})
  public Adres(int adresId, String provincie, String woonplaats, String straatnaam,
      String huisnummer, String postcode, Klant klantId) {
    this.adresId = adresId;
    this.provincie = provincie;
    this.woonplaats = woonplaats;
    this.straatnaam = straatnaam;
    this.huisnummer = huisnummer;
    this.postcode = postcode;
    this.klantId = klantId;
  }

  public Adres() {
  }

  public int getAdresId() {
    return this.adresId;
  }

  public String getProvincie() {
    return this.provincie;
  }

  public String getWoonplaats() {
    return this.woonplaats;
  }

  public String getStraatnaam() {
    return this.straatnaam;
  }

  public String getHuisnummer() {
    return this.huisnummer;
  }

  public String getPostcode() {
    return this.postcode;
  }

  public Klant getKlantId() {
    return this.klantId;
  }

  public void setAdresId(int adresId) {
    this.adresId = adresId;
  }

  public void setProvincie(String provincie) {
    this.provincie = provincie;
  }

  public void setWoonplaats(String woonplaats) {
    this.woonplaats = woonplaats;
  }

  public void setStraatnaam(String straatnaam) {
    this.straatnaam = straatnaam;
  }

  public void setHuisnummer(String huisnummer) {
    this.huisnummer = huisnummer;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  public void setKlantId(Klant klantId) {
    this.klantId = klantId;
  }

  public boolean equals(final Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof Adres)) {
      return false;
    }
    final Adres other = (Adres) o;
    if (!other.canEqual((Object) this)) {
      return false;
    }
    if (this.getAdresId() != other.getAdresId()) {
      return false;
    }
    final Object this$provincie = this.getProvincie();
    final Object other$provincie = other.getProvincie();
    if (this$provincie == null ? other$provincie != null
        : !this$provincie.equals(other$provincie)) {
      return false;
    }
    final Object this$woonplaats = this.getWoonplaats();
    final Object other$woonplaats = other.getWoonplaats();
    if (this$woonplaats == null ? other$woonplaats != null
        : !this$woonplaats.equals(other$woonplaats)) {
      return false;
    }
    final Object this$straatnaam = this.getStraatnaam();
    final Object other$straatnaam = other.getStraatnaam();
    if (this$straatnaam == null ? other$straatnaam != null
        : !this$straatnaam.equals(other$straatnaam)) {
      return false;
    }
    final Object this$huisnummer = this.getHuisnummer();
    final Object other$huisnummer = other.getHuisnummer();
    if (this$huisnummer == null ? other$huisnummer != null
        : !this$huisnummer.equals(other$huisnummer)) {
      return false;
    }
    final Object this$postcode = this.getPostcode();
    final Object other$postcode = other.getPostcode();
    if (this$postcode == null ? other$postcode != null : !this$postcode.equals(other$postcode)) {
      return false;
    }
    final Object this$klantId = this.getKlantId();
    final Object other$klantId = other.getKlantId();
    if (this$klantId == null ? other$klantId != null : !this$klantId.equals(other$klantId)) {
      return false;
    }
    return true;
  }

  protected boolean canEqual(final Object other) {
    return other instanceof Adres;
  }

  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    result = result * PRIME + this.getAdresId();
    final Object $provincie = this.getProvincie();
    result = result * PRIME + ($provincie == null ? 43 : $provincie.hashCode());
    final Object $woonplaats = this.getWoonplaats();
    result = result * PRIME + ($woonplaats == null ? 43 : $woonplaats.hashCode());
    final Object $straatnaam = this.getStraatnaam();
    result = result * PRIME + ($straatnaam == null ? 43 : $straatnaam.hashCode());
    final Object $huisnummer = this.getHuisnummer();
    result = result * PRIME + ($huisnummer == null ? 43 : $huisnummer.hashCode());
    final Object $postcode = this.getPostcode();
    result = result * PRIME + ($postcode == null ? 43 : $postcode.hashCode());
    final Object $klantId = this.getKlantId();
    result = result * PRIME + ($klantId == null ? 43 : $klantId.hashCode());
    return result;
  }

  public String toString() {
    return "Adres(adresId=" + this.getAdresId() + ", provincie=" + this.getProvincie()
        + ", woonplaats=" + this.getWoonplaats() + ", straatnaam=" + this.getStraatnaam()
        + ", huisnummer=" + this.getHuisnummer() + ", postcode=" + this.getPostcode() + ", klantId="
        + this.getKlantId() + ")";
  }
}
