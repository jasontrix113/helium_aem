package au.com.peppermoney.core.models;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Model(adaptables = Resource.class)

public class TestModel {

    private final Logger logger = LoggerFactory.getLogger(getClass());
    @Inject
    @Named("sling:resourceType")
    @Default(values = "No resourceType")
    protected String resourceType;

    @Inject
    @Optional
    private List<Resource> products;

    private List<Product> productsList = new ArrayList<>();

    public List<Product> getProductsList() {

                   return productsList;}

    public void setProductsList(List<Product> productsList) {

                   this.productsList = productsList;}

           @PostConstruct

    protected void init() {

    logger.info("—-<In init of Test Model >—–");

                   if (!products.isEmpty()) {

                                 for (Resource resource : products) {

                                                Product p1 = resource.adaptTo(Product.class);

                                                productsList.add(p1);}}}}

