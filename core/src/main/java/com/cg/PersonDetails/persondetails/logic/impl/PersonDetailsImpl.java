package com.cg.PersonDetails.persondetails.logic.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cg.PersonDetails.general.logic.base.AbstractComponentFacade;
import com.cg.PersonDetails.persondetails.dataaccess.api.Person;
import com.cg.PersonDetails.persondetails.dataaccess.api.dao.IPersonDao;
import com.cg.PersonDetails.persondetails.logic.api.IPersonDetails;
import com.cg.PersonDetails.persondetails.logic.api.to.PersonEto;

/**
 * @author vpriyada
 *
 */
@Named("PersonDetailsImpl")
@Transactional
public class PersonDetailsImpl extends AbstractComponentFacade implements IPersonDetails {

  private IPersonDao dao;

  /**
   * @return dao
   */
  public IPersonDao getDao() {

    return this.dao;
  }

  /**
   * @param dao new value of {@link #getdao}.
   */
  @Inject
  public void setDao(IPersonDao dao) {

    this.dao = dao;
  }

  private static final Logger LOG = LoggerFactory.getLogger(PersonDetailsImpl.class);

  /**
   * The constructor.
   */
  public PersonDetailsImpl() {
    super();
  }

  /**
   * The constructor.
   *
   * @param dao
   */
  public PersonDetailsImpl(IPersonDao dao) {
    super();
    this.dao = dao;
  }

  @Override
  public List<PersonEto> viewAllPersonDetails() {

    List<Person> person = getDao().findAll();

    return getBeanMapper().mapList(person, PersonEto.class);

  }

  @Override
  public PersonEto addPersonDetails(PersonEto entity) {

    Person person = getBeanMapper().map(entity, Person.class);
    return getBeanMapper().map(getDao().save(person), PersonEto.class);
  }

}
