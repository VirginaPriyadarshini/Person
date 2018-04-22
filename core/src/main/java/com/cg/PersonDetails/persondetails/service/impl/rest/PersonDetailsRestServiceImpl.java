package com.cg.PersonDetails.persondetails.service.impl.rest;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.cg.PersonDetails.persondetails.dataaccess.api.Person;
import com.cg.PersonDetails.persondetails.logic.api.IPersonDetails;
import com.cg.PersonDetails.persondetails.logic.api.to.PersonEto;
import com.cg.PersonDetails.persondetails.service.api.rest.PersonDetailsRestService;

/**
 * @author vpriyada
 *
 */
@Named("PersonDetailsRestServiceImpl")
@CrossOrigin(origins = { "http://localhost:4200" })
public class PersonDetailsRestServiceImpl implements PersonDetailsRestService {

  @Autowired
  private ResourceLoader resourceLoader;

  private IPersonDetails personDetails;

  private List<Person> person = new ArrayList<Person>();

  /**
   * @param persondetails new value of {@link #getpersondetails}.
   */
  @Inject
  public void setPersondetails(IPersonDetails personDetails) {

    this.personDetails = personDetails;
  }

  @Override
  public List<PersonEto> viewAllPersonDetails() {

    return this.personDetails.viewAllPersonDetails();
  }

  @Override
  public PersonEto addPersonDetails(PersonEto entity) {

    return this.personDetails.addPersonDetails(entity);
  }

}
