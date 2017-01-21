package lab3_1;

import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.Request;
import org.mockito.Mock;

import pl.com.bottega.ecommerce.sales.domain.invoicing.*;


public class TestBookKeeper {
	
	
	BookKeeper bookKeeper;
	
	@Mock
	InvoiceFactory invFactory;
	
	@Mock
	InvoiceRequest incReq;
	
	@Mock
	Invoice invoice;
	
	
	@BeforeClass
	public void before(){
		initMocks(this);// Initialize this mock objects
		
	}
	
	@Before
	public void beforeMethod(){
		bookKeeper = new BookKeeper(invFactory);
		
	}
	
	@Test
	public void testOneInvoiceRequest(){
		
	}
}
