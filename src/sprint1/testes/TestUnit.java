package sprint1.testes;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TestUnit {
@Rule
public ExpectedException exception=ExpectedException.none();
public Validation validation;
@Before
public void beforecoding()
{
validation=new Validation();	
}
@Test
public void testNotBlankchaine()
{
assertTrue(validation.verifchaine("teste"));	

}
@Test 
public void testNotBlankNumber()
{
assertTrue(validation.verifchaine(String.valueOf(30)));	
}
}
