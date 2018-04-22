package com.cg.PersonDetails.persondetails.dataaccess.api;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author vpriyada
 *
 */
@Entity
@Table(name = "PersonDetails")
public class Person {

  @Id
  private long id;

  private String name;

  private Integer age;

  /**
   * @return id
   */
  public long getId() {

    return this.id;
  }

  /**
   * @param id new value of {@link #getid}.
   */
  public void setId(long id) {

    this.id = id;
  }

  /**
   * @return name
   */
  public String getName() {

    return this.name;
  }

  /**
   * @param name new value of {@link #getname}.
   */
  public void setName(String name) {

    this.name = name;
  }

  /**
   * @return age
   */
  public Integer getAge() {

    return this.age;
  }

  /**
   * @param age new value of {@link #getage}.
   */
  public void setAge(Integer age) {

    this.age = age;
  }

  /**
   * The constructor.
   */
  public Person() {
    super();
  }

  /**
   * The constructor.
   *
   * @param name
   * @param age
   */
  public Person(String name, Integer age) {
    super();
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {

    return "Person [name=" + this.name + ", age=" + this.age + "]";
  }

}
