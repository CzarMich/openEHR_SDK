package org.ehrbase.client.classgenerator.examples.stationarerversorgungsfallcomposition.definition;

import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.shareddefinition.Language;

@Entity
@Archetype("openEHR-EHR-ADMIN_ENTRY.discharge_summary.v0")
public class EntlassungsdatenAdminEntry {
  @Path("/data[at0001]/items[at0040]/value|value")
  private String artDerEntlassungValue;

  @Path("/data[at0001]/items[at0002]/value|defining_code")
  private KlinischerZustandDesPatientenDefiningCode klinischerZustandDesPatientenDefiningCode;

  @Path("/data[at0001]/items[at0011 and name/value='Datum/Uhrzeit der Entlassung']/value|value")
  private TemporalAccessor datumUhrzeitDerEntlassungValue;

  @Path("/data[at0001]/items[at0050]/value|value")
  private String zusatzlicheInformationenValue;

  @Path("/data[at0001]/items[at0066]")
  private List<Cluster> letzterPatientenstandort;

  @Path("/data[at0001]/items[at0067]")
  private List<Cluster> zugewiesenerPatientenstandort;

  @Path("/subject")
  private PartyProxy subject;

  @Path("/language")
  private Language language;

  public void setArtDerEntlassungValue(String artDerEntlassungValue) {
     this.artDerEntlassungValue = artDerEntlassungValue;
  }

  public String getArtDerEntlassungValue() {
     return this.artDerEntlassungValue ;
  }

  public void setKlinischerZustandDesPatientenDefiningCode(
      KlinischerZustandDesPatientenDefiningCode klinischerZustandDesPatientenDefiningCode) {
     this.klinischerZustandDesPatientenDefiningCode = klinischerZustandDesPatientenDefiningCode;
  }

  public KlinischerZustandDesPatientenDefiningCode getKlinischerZustandDesPatientenDefiningCode() {
     return this.klinischerZustandDesPatientenDefiningCode ;
  }

  public void setDatumUhrzeitDerEntlassungValue(TemporalAccessor datumUhrzeitDerEntlassungValue) {
     this.datumUhrzeitDerEntlassungValue = datumUhrzeitDerEntlassungValue;
  }

  public TemporalAccessor getDatumUhrzeitDerEntlassungValue() {
     return this.datumUhrzeitDerEntlassungValue ;
  }

  public void setZusatzlicheInformationenValue(String zusatzlicheInformationenValue) {
     this.zusatzlicheInformationenValue = zusatzlicheInformationenValue;
  }

  public String getZusatzlicheInformationenValue() {
     return this.zusatzlicheInformationenValue ;
  }

  public void setLetzterPatientenstandort(List<Cluster> letzterPatientenstandort) {
     this.letzterPatientenstandort = letzterPatientenstandort;
  }

  public List<Cluster> getLetzterPatientenstandort() {
     return this.letzterPatientenstandort ;
  }

  public void setZugewiesenerPatientenstandort(List<Cluster> zugewiesenerPatientenstandort) {
     this.zugewiesenerPatientenstandort = zugewiesenerPatientenstandort;
  }

  public List<Cluster> getZugewiesenerPatientenstandort() {
     return this.zugewiesenerPatientenstandort ;
  }

  public void setSubject(PartyProxy subject) {
     this.subject = subject;
  }

  public PartyProxy getSubject() {
     return this.subject ;
  }

  public void setLanguage(Language language) {
     this.language = language;
  }

  public Language getLanguage() {
     return this.language ;
  }
}
