package me.itzg.somelib.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Author {
  @Id
  long id;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  String name;
}
