package com.cg.PersonDetails.persondetails.dataaccess.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.PersonDetails.persondetails.dataaccess.api.Person;

/**
 * @author vpriyada
 *
 */
public interface IPersonDao extends JpaRepository<Person, Long> {

}
