package org.ehrbase.client.classgenerator.examples.testalltypesenv1composition.definition;

import com.nedap.archie.rm.datavalues.encapsulated.DvParsable;
import com.nedap.archie.rm.generic.PartyProxy;
import java.lang.String;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.shareddefinition.Language;

@Entity
@Archetype("openEHR-EHR-INSTRUCTION.test_all_types.v1")
public class TestAllTypesInstruction {
  @Path("/activities[at0001]/description[at0002]/items[at0003]/value|value")
  private Temporal partialDateValue;

  @Path("/activities[at0001]/description[at0002]/items[at0004]/value|value")
  private TemporalAccessor partialDatetimeValue;

  @Path("/activities[at0001]/timing")
  private DvParsable timing;

  @Path("/subject")
  private PartyProxy subject;

  @Path("/narrative|value")
  private String narrativeValue;

  @Path("/language")
  private Language language;

  @Path("/expiry_time|value")
  private TemporalAccessor expiryTimeValue;

  public void setPartialDateValue(Temporal partialDateValue) {
     this.partialDateValue = partialDateValue;
  }

  public Temporal getPartialDateValue() {
     return this.partialDateValue ;
  }

  public void setPartialDatetimeValue(TemporalAccessor partialDatetimeValue) {
     this.partialDatetimeValue = partialDatetimeValue;
  }

  public TemporalAccessor getPartialDatetimeValue() {
     return this.partialDatetimeValue ;
  }

  public void setTiming(DvParsable timing) {
     this.timing = timing;
  }

  public DvParsable getTiming() {
     return this.timing ;
  }

  public void setSubject(PartyProxy subject) {
     this.subject = subject;
  }

  public PartyProxy getSubject() {
     return this.subject ;
  }

  public void setNarrativeValue(String narrativeValue) {
     this.narrativeValue = narrativeValue;
  }

  public String getNarrativeValue() {
     return this.narrativeValue ;
  }

  public void setLanguage(Language language) {
     this.language = language;
  }

  public Language getLanguage() {
     return this.language ;
  }

  public void setExpiryTimeValue(TemporalAccessor expiryTimeValue) {
     this.expiryTimeValue = expiryTimeValue;
  }

  public TemporalAccessor getExpiryTimeValue() {
     return this.expiryTimeValue ;
  }
}
