package org.ehrbase.client.phenotypes.optentities.ehrbase.vita.com.openehrconfirmedcovid19infectionreportv0composition.definition;

import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import ehrbase.vita.com.shareddefinition.Language;
import java.time.temporal.TemporalAccessor;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;

public class TravelEventObservationContainment extends Containment {
  public SelectAqlField<TravelEventObservation> TRAVEL_EVENT_OBSERVATION = new AqlFieldImp<TravelEventObservation>(TravelEventObservation.class, "", "TravelEventObservation", TravelEventObservation.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(TravelEventObservation.class, "/protocol[at0007]/items[at0021]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(TravelEventObservation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<TemporalAccessor> ORIGIN_VALUE = new AqlFieldImp<TemporalAccessor>(TravelEventObservation.class, "/data[at0001]/origin|value", "originValue", TemporalAccessor.class, this);

  public ListSelectAqlField<TravelEventRecentTravelChoice> RECENT_TRAVEL = new ListAqlFieldImp<TravelEventRecentTravelChoice>(TravelEventObservation.class, "/data[at0001]/events[at0002]", "recentTravel", TravelEventRecentTravelChoice.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(TravelEventObservation.class, "/language", "language", Language.class, this);

  private TravelEventObservationContainment() {
    super("openEHR-EHR-OBSERVATION.travel_event.v0");
  }

  public static TravelEventObservationContainment getInstance() {
    return new TravelEventObservationContainment();
  }
}
