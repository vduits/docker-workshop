package nl.hu.iac.dockerworkshopbackend.domain;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

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

  @java.beans.ConstructorProperties({"petId", "ras", "geboorteDatum", "opmerkingen", "geslacht",
      "standaardprijs", "verkocht", "klantId", "name", "image", "description"})
  public Pet(int petId, String ras, LocalDate geboorteDatum, String opmerkingen, String geslacht,
      double standaardprijs, boolean verkocht, Klant klantId, String name, String image,
      String description) {
    this.petId = petId;
    this.ras = ras;
    this.geboorteDatum = geboorteDatum;
    this.opmerkingen = opmerkingen;
    this.geslacht = geslacht;
    this.standaardprijs = standaardprijs;
    this.verkocht = verkocht;
    this.klantId = klantId;
    this.name = name;
    this.image = image;
    this.description = description;
  }

  public Pet() {
  }

  public int getPetId() {
    return this.petId;
  }

  public String getRas() {
    return this.ras;
  }

  public LocalDate getGeboorteDatum() {
    return this.geboorteDatum;
  }

  public String getOpmerkingen() {
    return this.opmerkingen;
  }

  public String getGeslacht() {
    return this.geslacht;
  }

  public double getStandaardprijs() {
    return this.standaardprijs;
  }

  public boolean isVerkocht() {
    return this.verkocht;
  }

  public Klant getKlantId() {
    return this.klantId;
  }

  public String getName() {
    return this.name;
  }

  public String getImage() {
    return this.image;
  }

  public String getDescription() {
    return this.description;
  }

  public void setPetId(int petId) {
    this.petId = petId;
  }

  public void setRas(String ras) {
    this.ras = ras;
  }

  public void setGeboorteDatum(LocalDate geboorteDatum) {
    this.geboorteDatum = geboorteDatum;
  }

  public void setOpmerkingen(String opmerkingen) {
    this.opmerkingen = opmerkingen;
  }

  public void setGeslacht(String geslacht) {
    this.geslacht = geslacht;
  }

  public void setStandaardprijs(double standaardprijs) {
    this.standaardprijs = standaardprijs;
  }

  public void setVerkocht(boolean verkocht) {
    this.verkocht = verkocht;
  }

  public void setKlantId(Klant klantId) {
    this.klantId = klantId;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public boolean equals(final Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof Pet)) {
      return false;
    }
    final Pet other = (Pet) o;
    if (!other.canEqual((Object) this)) {
      return false;
    }
    if (this.getPetId() != other.getPetId()) {
      return false;
    }
    final Object this$ras = this.getRas();
    final Object other$ras = other.getRas();
    if (this$ras == null ? other$ras != null : !this$ras.equals(other$ras)) {
      return false;
    }
    final Object this$geboorteDatum = this.getGeboorteDatum();
    final Object other$geboorteDatum = other.getGeboorteDatum();
    if (this$geboorteDatum == null ? other$geboorteDatum != null
        : !this$geboorteDatum.equals(other$geboorteDatum)) {
      return false;
    }
    final Object this$opmerkingen = this.getOpmerkingen();
    final Object other$opmerkingen = other.getOpmerkingen();
    if (this$opmerkingen == null ? other$opmerkingen != null
        : !this$opmerkingen.equals(other$opmerkingen)) {
      return false;
    }
    final Object this$geslacht = this.getGeslacht();
    final Object other$geslacht = other.getGeslacht();
    if (this$geslacht == null ? other$geslacht != null : !this$geslacht.equals(other$geslacht)) {
      return false;
    }
    if (Double.compare(this.getStandaardprijs(), other.getStandaardprijs()) != 0) {
      return false;
    }
    if (this.isVerkocht() != other.isVerkocht()) {
      return false;
    }
    final Object this$klantId = this.getKlantId();
    final Object other$klantId = other.getKlantId();
    if (this$klantId == null ? other$klantId != null : !this$klantId.equals(other$klantId)) {
      return false;
    }
    final Object this$name = this.getName();
    final Object other$name = other.getName();
    if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
      return false;
    }
    final Object this$image = this.getImage();
    final Object other$image = other.getImage();
    if (this$image == null ? other$image != null : !this$image.equals(other$image)) {
      return false;
    }
    final Object this$description = this.getDescription();
    final Object other$description = other.getDescription();
    if (this$description == null ? other$description != null
        : !this$description.equals(other$description)) {
      return false;
    }
    return true;
  }

  protected boolean canEqual(final Object other) {
    return other instanceof Pet;
  }

  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    result = result * PRIME + this.getPetId();
    final Object $ras = this.getRas();
    result = result * PRIME + ($ras == null ? 43 : $ras.hashCode());
    final Object $geboorteDatum = this.getGeboorteDatum();
    result = result * PRIME + ($geboorteDatum == null ? 43 : $geboorteDatum.hashCode());
    final Object $opmerkingen = this.getOpmerkingen();
    result = result * PRIME + ($opmerkingen == null ? 43 : $opmerkingen.hashCode());
    final Object $geslacht = this.getGeslacht();
    result = result * PRIME + ($geslacht == null ? 43 : $geslacht.hashCode());
    final long $standaardprijs = Double.doubleToLongBits(this.getStandaardprijs());
    result = result * PRIME + (int) ($standaardprijs >>> 32 ^ $standaardprijs);
    result = result * PRIME + (this.isVerkocht() ? 79 : 97);
    final Object $klantId = this.getKlantId();
    result = result * PRIME + ($klantId == null ? 43 : $klantId.hashCode());
    final Object $name = this.getName();
    result = result * PRIME + ($name == null ? 43 : $name.hashCode());
    final Object $image = this.getImage();
    result = result * PRIME + ($image == null ? 43 : $image.hashCode());
    final Object $description = this.getDescription();
    result = result * PRIME + ($description == null ? 43 : $description.hashCode());
    return result;
  }

  public String toString() {
    return "Pet(petId=" + this.getPetId() + ", ras=" + this.getRas() + ", geboorteDatum=" + this
        .getGeboorteDatum() + ", opmerkingen=" + this.getOpmerkingen() + ", geslacht=" + this
        .getGeslacht() + ", standaardprijs=" + this.getStandaardprijs() + ", verkocht=" + this
        .isVerkocht() + ", klantId=" + this.getKlantId() + ", name=" + this.getName() + ", image="
        + this.getImage() + ", description=" + this.getDescription() + ")";
  }
}
