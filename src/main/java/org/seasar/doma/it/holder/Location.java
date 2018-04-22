package org.seasar.doma.it.holder;

public class Location<T> {

  private final String value;

  public Location(final String value) {
    this.value = value;
  }

  public String getValue() {
    return this.value;
  }
}
