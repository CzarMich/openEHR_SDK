package org.ehrbase.client.classgenerator.examples.patientenaufenthaltcomposition.definition;

import java.lang.String;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;

@Entity
@Archetype("openEHR-EHR-CLUSTER.location.v1")
public class StandortCluster {
  @Path("/items[at0040]/value|value")
  private String standorttypValue;

  @Path("/items[at0046]/value|value")
  private String standortbeschreibungValue;

  @Path("/items[at0048]/value|defining_code")
  private StandortschlusselDefiningCode standortschlusselDefiningCode;

  @Path("/items[at0024]/value|value")
  private String campusValue;

  @Path("/items[at0025]/value|value")
  private String gebaudegruppeValue;

  @Path("/items[at0028]/value|value")
  private String ebeneValue;

  @Path("/items[at0027 and name/value='Stationskennung']/value|value")
  private String stationskennungValue;

  @Path("/items[at0029 and name/value='Zimmerkennung']/value|value")
  private String zimmerkennungValue;

  @Path("/items[at0034 and name/value='Bettplatzkennung']/value|value")
  private String bettplatzkennungValue;

  @Path("/items[openEHR-EHR-CLUSTER.device.v1 and name/value='Details zum Bett']")
  private DetailsZumBettCluster detailsZumBett;

  public void setStandorttypValue(String standorttypValue) {
     this.standorttypValue = standorttypValue;
  }

  public String getStandorttypValue() {
     return this.standorttypValue ;
  }

  public void setStandortbeschreibungValue(String standortbeschreibungValue) {
     this.standortbeschreibungValue = standortbeschreibungValue;
  }

  public String getStandortbeschreibungValue() {
     return this.standortbeschreibungValue ;
  }

  public void setStandortschlusselDefiningCode(
      StandortschlusselDefiningCode standortschlusselDefiningCode) {
     this.standortschlusselDefiningCode = standortschlusselDefiningCode;
  }

  public StandortschlusselDefiningCode getStandortschlusselDefiningCode() {
     return this.standortschlusselDefiningCode ;
  }

  public void setCampusValue(String campusValue) {
     this.campusValue = campusValue;
  }

  public String getCampusValue() {
     return this.campusValue ;
  }

  public void setGebaudegruppeValue(String gebaudegruppeValue) {
     this.gebaudegruppeValue = gebaudegruppeValue;
  }

  public String getGebaudegruppeValue() {
     return this.gebaudegruppeValue ;
  }

  public void setEbeneValue(String ebeneValue) {
     this.ebeneValue = ebeneValue;
  }

  public String getEbeneValue() {
     return this.ebeneValue ;
  }

  public void setStationskennungValue(String stationskennungValue) {
     this.stationskennungValue = stationskennungValue;
  }

  public String getStationskennungValue() {
     return this.stationskennungValue ;
  }

  public void setZimmerkennungValue(String zimmerkennungValue) {
     this.zimmerkennungValue = zimmerkennungValue;
  }

  public String getZimmerkennungValue() {
     return this.zimmerkennungValue ;
  }

  public void setBettplatzkennungValue(String bettplatzkennungValue) {
     this.bettplatzkennungValue = bettplatzkennungValue;
  }

  public String getBettplatzkennungValue() {
     return this.bettplatzkennungValue ;
  }

  public void setDetailsZumBett(DetailsZumBettCluster detailsZumBett) {
     this.detailsZumBett = detailsZumBett;
  }

  public DetailsZumBettCluster getDetailsZumBett() {
     return this.detailsZumBett ;
  }
}
