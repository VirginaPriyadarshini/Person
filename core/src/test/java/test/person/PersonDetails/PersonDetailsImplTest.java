package test.person.PersonDetails;

import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import com.cg.PersonDetails.persondetails.dataaccess.api.Person;
import com.cg.PersonDetails.persondetails.dataaccess.api.dao.IPersonDao;
import com.cg.PersonDetails.persondetails.logic.api.to.PersonEto;
import com.cg.PersonDetails.persondetails.logic.impl.PersonDetailsImpl;

import io.oasp.module.beanmapping.common.api.BeanMapper;
import io.oasp.module.test.common.base.ModuleTest;

/**
 * @author vpriyada
 *
 */
public class PersonDetailsImplTest extends ModuleTest {
  private static final long id = 1;

  private PersonDetailsImpl personDetailsImpl;

  @Rule
  public MockitoRule rule = MockitoJUnit.rule();

  @Mock
  private IPersonDao personDao;

  @Mock
  private PersonEto personEto;

  @Mock
  private Person personEntity;

  @Mock
  private BeanMapper beanMapper;

  @Before
  public void init() {

    this.personDetailsImpl = new PersonDetailsImpl();
    this.personDetailsImpl.setDao(this.personDao);
    this.personDetailsImpl.setBeanMapper(this.beanMapper);

  }

  @After
  public void clean() {

    this.beanMapper = null;
    this.personDao = null;
    this.personDetailsImpl = null;
  }

  @Test
  public void testViewAllPersonDetails() {

    List<PersonEto> allTables = this.personDetailsImpl.viewAllPersonDetails();

    assertThat(allTables).isNotNull();
  }

  @Test
  public void testAddPersonDetails() {

    Class<PersonEto> targetClass = PersonEto.class;
    this.personEto.setAge(22);
    this.personEto.setName("virgina");

    when(this.beanMapper.map(this.personEntity, Person.class)).thenReturn(this.personEntity);
    when(this.personDao.save(this.personEntity)).thenReturn(this.personEntity);
    when(this.beanMapper.map(this.personEntity, targetClass)).thenReturn(this.personEto);
    PersonEto resultEto = this.personDetailsImpl.addPersonDetails(this.personEto);

  }

}
