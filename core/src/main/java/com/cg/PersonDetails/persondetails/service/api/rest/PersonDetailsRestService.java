package com.cg.PersonDetails.persondetails.service.api.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cg.PersonDetails.general.common.api.RestService;
import com.cg.PersonDetails.persondetails.logic.api.to.PersonEto;

/**
 * @author vpriyada
 *
 */
@Path("/PersonDetails")

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface PersonDetailsRestService extends RestService {

  @GET
  @Path("/viewall")

  List<PersonEto> viewAllPersonDetails();

  @POST
  @Path("/add")

  PersonEto addPersonDetails(PersonEto entity);

}
