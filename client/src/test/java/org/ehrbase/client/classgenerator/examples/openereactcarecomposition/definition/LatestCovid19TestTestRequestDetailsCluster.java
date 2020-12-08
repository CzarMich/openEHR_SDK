package org.ehrbase.client.classgenerator.examples.openereactcarecomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.util.List;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;

@Entity
public class LatestCovid19TestTestRequestDetailsCluster implements LocatableEntity {
  /**
   * open_eREACT-Care/Assessment/Covid/Latest Covid-19 test/Test request details/Requester
   */
  @Path("/items[at0090]")
  private Cluster requester;

  /**
   * open_eREACT-Care/Assessment/Covid/Latest Covid-19 test/Test request details/Distribution list
   */
  @Path("/items[at0035]")
  private List<Cluster> distributionList;

  /**
   * open_eREACT-Care/Assessment/Covid/Latest Covid-19 test/Test request details/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setRequester(Cluster requester) {
     this.requester = requester;
  }

  public Cluster getRequester() {
     return this.requester ;
  }

  public void setDistributionList(List<Cluster> distributionList) {
     this.distributionList = distributionList;
  }

  public List<Cluster> getDistributionList() {
     return this.distributionList ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
