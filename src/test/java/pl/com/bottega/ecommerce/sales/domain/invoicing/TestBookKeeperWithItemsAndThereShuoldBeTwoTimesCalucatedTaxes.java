package pl.com.bottega.ecommerce.sales.domain.invoicing;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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
    	
    }
    
    
    
}
