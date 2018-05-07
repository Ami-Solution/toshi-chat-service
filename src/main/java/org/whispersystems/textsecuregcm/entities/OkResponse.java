package org.whispersystems.textsecuregcm.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.annotations.VisibleForTesting;

public class OkResponse {

  @JsonProperty
  private boolean ok;

  @VisibleForTesting
  public OkResponse() {}

  public OkResponse(boolean ok) {
    this.ok = ok;
  }

  public boolean getOk() {
    return ok;
  }
}
