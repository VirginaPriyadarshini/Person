package com.cg.PersonDetails.general.service.impl.rest;

import javax.inject.Named;

import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.module.SimpleModule;


import io.oasp.module.json.common.base.ObjectMapperFactory;

/**
 * The MappingFactory class to resolve polymorphic conflicts within the PersonDetails application.
 */
@Named("ApplicationObjectMapperFactory")
public class ApplicationObjectMapperFactory extends ObjectMapperFactory {

  /**
   * The constructor.
   */
  public ApplicationObjectMapperFactory() {

    super();
    // register polymorphic base classes
    

    NamedType[] subtypes;
    // register mapping for polymorphic sub-classes
    
  }
}
