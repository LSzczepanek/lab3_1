package pl.com.bottega.ecommerce.sales.domain.invoicing;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;


public class TestBookKeeper {
	
    @Mock
    BookKeeper bookKeeper;
    @Mock
    InvoiceFactory invFactory;
    @Mock
    InvoiceRequest invRequest;
    @Mock
    RequestItem requestItem;
    @Mock
    Invoice invoice;
    @Mock
    TaxPolicy taxPolicy;
	
	
	
	@Before
	public void before(){
        invFactory = mock(InvoiceFactory.class);
        bookKeeper = new BookKeeper(invFactory);
        invRequest = mock(InvoiceRequest.class);
        requestItem = mock(RequestItem.class);
        ArrayList<RequestItem> requestItems = new ArrayList<>();
        requestItems.add(requestItem);
        when(invRequest.getItems()).thenReturn(requestItems);
        taxPolicy = mock(TaxPolicy.class);
        invoice = bookKeeper.issuance(invRequest, taxPolicy);
	}
	
    @Test
    public void testOneInvoiceRequest() {

        assertThat(invoice.getItems().size(), is(equalTo(1)));
    }
	
	
}
