package lab3_1;

import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import pl.com.bottega.ecommerce.sales.domain.invoicing.BookKeeper;
import pl.com.bottega.ecommerce.sales.domain.invoicing.Invoice;
import pl.com.bottega.ecommerce.sales.domain.invoicing.InvoiceFactory;
import pl.com.bottega.ecommerce.sales.domain.invoicing.InvoiceRequest;
import pl.com.bottega.ecommerce.sales.domain.invoicing.TaxPolicy;


public class TestBookKeeper {
	
	BookKeeper book;
	
	@Mock
	BookKeeper bookKeeper;
	
	@Mock
	InvoiceFactory invFactory;
	
	@Mock
	InvoiceRequest invReq;
	
	@Mock
	Invoice invoice;
	
	@Mock
	TaxPolicy taxPolicy;
	
	
	
	
	@Before
	public void before(){
		initMocks(this);// Initialize this mock objects
		when(bookKeeper.issuance(invReq, taxPolicy)).thenReturn(invoice);
		when(invoice.getItems().size()).thenReturn(1);
	}
	
	
	@Test
	public void testOneInvoiceRequest(){
		assertThat(bookKeeper.issuance(invReq, taxPolicy).getItems().size(), is(equalTo(1)));
	}
	
	
}
