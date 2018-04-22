package com.cg.PersonDetails.general.dataaccess.base.dao;

import com.cg.PersonDetails.general.dataaccess.api.BinaryObjectEntity;
import com.cg.PersonDetails.general.dataaccess.api.dao.BinaryObjectDao;

import javax.inject.Named;

/**
 * Implementation of {@link BinaryObjectDao}.
 *
 */
@Named
public class BinaryObjectDaoImpl extends ApplicationDaoImpl<BinaryObjectEntity> implements BinaryObjectDao {

  @Override
  public Class<BinaryObjectEntity> getEntityClass() {

    return BinaryObjectEntity.class;
  }

}
