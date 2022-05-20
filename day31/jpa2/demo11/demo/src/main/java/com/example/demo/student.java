package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class student {
  @Id
  int id;
  String name;

  @Column
  public int getInt() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setInt(int id) {
    this.id = id;
  }

  public void getName(String name) {
    this.name = name;
  }

  student(int id, String name) {
    this.id = id;
    this.name = name;

  }

  public student() {

  }

}
