package sprint1.testes;

import org.junit.Before;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import sprint1.services.ActionService;
import sprint1.services.ClientService;

public class TestMock {
@Before
public void initMocks()
{
MockitoAnnotations.initMocks(this);	
}
@InjectMocks
ActionService actservice;
@InjectMocks
ClientService clservice;


}
