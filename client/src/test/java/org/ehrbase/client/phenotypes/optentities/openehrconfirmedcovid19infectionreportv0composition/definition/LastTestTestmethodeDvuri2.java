package org.ehrbase.client.phenotypes.optentities.openehrconfirmedcovid19infectionreportv0composition.definition;

import java.net.URI;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;

@Entity
@OptionFor("DV_URI")
public class LastTestTestmethodeDvuri2 implements LastTestTestmethodeChoice {
  @Path("|value")
  private URI testmethodeValue;

  public void setTestmethodeValue(URI testmethodeValue) {
     this.testmethodeValue = testmethodeValue;
  }

  public URI getTestmethodeValue() {
     return this.testmethodeValue ;
  }
}