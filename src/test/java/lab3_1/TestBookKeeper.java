package lab3_1;

import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import java.util.Collection;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.Request;
import org.mockito.Mock;

import pl.com.bottega.ecommerce.sales.domain.invoicing.BookKeeper;
import pl.com.bottega.ecommerce.sales.domain.invoicing.Invoice;
import pl.com.bottega.ecommerce.sales.domain.invoicing.InvoiceFactory;
import pl.com.bottega.ecommerce.sales.domain.invoicing.InvoiceRequest;
import pl.com.bottega.ecommerce.sales.domain.invoicing.RequestItem;


public class TestBookKeeper {
	
	
	BookKeeper bookKeeper;
	
	@Mock
	InvoiceFactory invFactory;
	
	@Mock
	InvoiceRequest invReq;
	
	@Mock
	Invoice invoice;
	
	@Mock
	RequestItem reqItem;
	
	
	@BeforeClass
	public void before(){
		initMocks(this);// Initialize this mock objects
		when(invReq.getItems()).thenReturn();
	}
	
	@Before
	public void beforeMethod(){
		invFactory = new InvoiceFactory();
		bookKeeper = new BookKeeper(invFactory);
		
	}
	
	@Test
	public void testOneInvoiceRequest(){
		bookKeeper;
	}
	
	
}
