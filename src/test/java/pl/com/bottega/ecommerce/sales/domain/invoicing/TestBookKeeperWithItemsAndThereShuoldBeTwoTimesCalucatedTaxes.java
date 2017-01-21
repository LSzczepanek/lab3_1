package pl.com.bottega.ecommerce.sales.domain.invoicing;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;
import pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductData;
import pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductType;
import pl.com.bottega.ecommerce.sharedkernel.Money;



public class TestBookKeeperWithItemsAndThereShuoldBeTwoTimesCalucatedTaxes {

    @Mock
    BookKeeper bookKeeper;
    @Mock
    InvoiceFactory invFactory;
    @Mock
    InvoiceRequest invRequest;
    @Mock
    RequestItem requestItem;
    @Mock
    RequestItem requestItem2;
    @Mock
    Invoice invoice;
    @Mock
    TaxPolicy taxPolicy;
    @Mock
    ProductData productData;
    @Mock
    Money money;
    @Mock
    Tax tax;
    
	@Before
	public void before(){
        invFactory = new InvoiceFactory();
        bookKeeper = new BookKeeper(invFactory);
        invRequest = mock(InvoiceRequest.class);
        
        requestItem = mock(RequestItem.class);
        
        requestItem2 = mock(RequestItem.class);
        taxPolicy = mock(TaxPolicy.class);
        productData = mock(ProductData.class);
        money = mock(Money.class);
        tax = mock(Tax.class);
        invoice = bookKeeper.issuance(invRequest, taxPolicy);
        ArrayList<RequestItem> requestItems = new ArrayList<>();
        requestItems.add(requestItem);
        requestItems.add(requestItem2);
        when(invRequest.getItems()).thenReturn(requestItems);
        when(invRequest.getClientData()).thenReturn(mock(ClientData.class));
        when(requestItem.getProductData()).thenReturn(productData);
        when(requestItem.getTotalCost()).thenReturn(Money.ZERO);
        when(tax.getAmount()).thenReturn(Money.ZERO);
        when(taxPolicy.calculateTax(any(ProductType.class),any(Money.class))).thenReturn(tax);    

        bookKeeper.issuance(invRequest, taxPolicy);
        
        
        
        
        //when(requestItem.getProductData()).thenReturn(mock(ProductData.class));
        //when(requestItem.getTotalCost()).thenReturn(Money.ZERO);
        //InvoiceRequest invoiceRequest = mock(InvoiceRequest.class);
        //when(invRequest.getClientData()).thenReturn(mock(ClientData.class));
       // when(invRequest.getItems()).thenReturn(Lists.newArrayList(requestItem, requestItem));
        //Tax tax = mock(Tax.class);
        //when(tax.getAmount()).thenReturn(Money.ZERO);
        //TaxPolicy taxPolicy = mock(TaxPolicy.class);
        //when(taxPolicy.calculateTax(any(ProductType.class),any(Money.class))).thenReturn(tax);
	}
	
	@Test
	public void testBookKeeperWithItemsAndThereShuoldBeTwoTimesCalucatedTaxes(){
		
		verify(taxPolicy, times(2)).calculateTax(any(ProductType.class),any(Money.class));
	}
    
    
}
