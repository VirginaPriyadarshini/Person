package com.cg.PersonDetails.persondetails.logic.api;

import java.util.List;

import com.cg.PersonDetails.persondetails.logic.api.to.PersonEto;

/**
 * @author vpriyada
 *
 */
public interface IPersonDetails {

  List<PersonEto> viewAllPersonDetails();

  PersonEto addPersonDetails(PersonEto entity);

}
