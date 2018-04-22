package com.cg.PersonDetails.persondetails.logic.api.to;

/**
 * @author vpriyada
 *
 */
public class PersonEto {

  private long id;

  private String name;

  private Integer age;

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
  public PersonEto() {
    super();
  }

}
