package au.com.peppermoney.core.models;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.PostConstruct;

@Model(adaptables = Resource.class)
public class Product {
private final Logger logger = LoggerFactory.getLogger(getClass());

@ValueMapValue
private String product;

@ValueMapValue
private String email;

@PostConstruct
protected void init() {

logger.info("In init of State2 Model");}

public String getProduct() {

return product;}

public String getEmail() {

return email;}}
