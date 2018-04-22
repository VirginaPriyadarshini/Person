package test.person.PersonDetails;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.cg.PersonDetails.persondetails.logic.api.to.PersonEto;
import com.cg.PersonDetails.persondetails.logic.impl.PersonDetailsImpl;
import com.cg.PersonDetails.persondetails.service.impl.rest.PersonDetailsRestServiceImpl;

import io.oasp.module.test.common.base.ModuleTest;

/**
 * @author vpriyada
 *
 */

@RunWith(MockitoJUnitRunner.class)
public class PersonDetailsRestServiceImplTest extends ModuleTest {

  @InjectMocks
  private PersonDetailsRestServiceImpl personDetailsRestServiceImpl;

  @Mock
  private PersonDetailsImpl personDetailsImpl;

  @Test
  public void testViewAllPersonDetails() {

    long id = 1L;
    final List<PersonEto> list = new ArrayList();
    final PersonEto personDetailsEto = new PersonEto();
    personDetailsEto.setAge(22);
    personDetailsEto.setName("Virgina");
    list.add(personDetailsEto);
    final List<PersonEto> expected = list;
    final List<PersonEto> actual = this.personDetailsRestServiceImpl.viewAllPersonDetails();

  }

  @Test
  public void testAddHPersonDetail() {

    final Long id = 1L;
    final PersonEto personDetailsEto = new PersonEto();
    personDetailsEto.setAge(22);
    personDetailsEto.setName("Virgina");
    final PersonEto expected = personDetailsEto;
    final PersonEto actual = this.personDetailsRestServiceImpl.addPersonDetails(personDetailsEto);

  }

}
