package org.ehrbase.client.classgenerator.examples.smicsbefundcomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import java.lang.String;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;

@Entity
public class ErregerdetailsResistenzmechanismusCluster implements LocatableEntity {
  /**
   * SmICS Befund/SmICS-Ergebnis/Jedes Ereignis/Eigenschaften des beteiligten Erregers/Erregerdetails/Resistenzmechanismus/Resistenzmechanismus Bezeichnung
   */
  @Path("/items[at0017]/value|value")
  private String resistenzmechanismusBezeichnungValue;

  /**
   * SmICS Befund/SmICS-Ergebnis/Jedes Ereignis/Eigenschaften des beteiligten Erregers/Erregerdetails/Resistenzmechanismus/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setResistenzmechanismusBezeichnungValue(String resistenzmechanismusBezeichnungValue) {
     this.resistenzmechanismusBezeichnungValue = resistenzmechanismusBezeichnungValue;
  }

  public String getResistenzmechanismusBezeichnungValue() {
     return this.resistenzmechanismusBezeichnungValue ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
