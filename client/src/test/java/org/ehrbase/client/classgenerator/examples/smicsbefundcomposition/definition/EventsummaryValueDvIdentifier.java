package org.ehrbase.client.classgenerator.examples.smicsbefundcomposition.definition;

import com.nedap.archie.rm.datavalues.DvIdentifier;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

@Entity
@OptionFor("DV_IDENTIFIER")
public class EventsummaryValueDvIdentifier implements RMEntity, EventsummaryValueChoice {
  /**
   * SmICS Befund/context/Eventsummary/Beteiligte Personen/value/value
   */
  @Path("")
  private DvIdentifier value;

  public void setValue(DvIdentifier value) {
     this.value = value;
  }

  public DvIdentifier getValue() {
     return this.value ;
  }
}
