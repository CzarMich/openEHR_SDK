package org.ehrbase.client.classgenerator.examples.smicsbefundcomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.String;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;

public class StandortClusterContainment extends Containment {
  public SelectAqlField<StandortCluster> STANDORT_CLUSTER = new AqlFieldImp<StandortCluster>(StandortCluster.class, "", "StandortCluster", StandortCluster.class, this);

  public SelectAqlField<String> STANDORTTYP_VALUE = new AqlFieldImp<String>(StandortCluster.class, "/items[at0040]/value|value", "standorttypValue", String.class, this);

  public SelectAqlField<String> STANDORTBESCHREIBUNG_VALUE = new AqlFieldImp<String>(StandortCluster.class, "/items[at0046]/value|value", "standortbeschreibungValue", String.class, this);

  public SelectAqlField<String> STANDORTSCHLUSSEL_VALUE = new AqlFieldImp<String>(StandortCluster.class, "/items[at0048]/value|value", "standortschlusselValue", String.class, this);

  public SelectAqlField<String> STATION_VALUE = new AqlFieldImp<String>(StandortCluster.class, "/items[at0027]/value|value", "stationValue", String.class, this);

  public SelectAqlField<String> ZIMMER_VALUE = new AqlFieldImp<String>(StandortCluster.class, "/items[at0029]/value|value", "zimmerValue", String.class, this);

  public ListSelectAqlField<Cluster> DETAILS = new ListAqlFieldImp<Cluster>(StandortCluster.class, "/items[at0047]", "details", Cluster.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(StandortCluster.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private StandortClusterContainment() {
    super("openEHR-EHR-CLUSTER.location.v1");
  }

  public static StandortClusterContainment getInstance() {
    return new StandortClusterContainment();
  }
}
