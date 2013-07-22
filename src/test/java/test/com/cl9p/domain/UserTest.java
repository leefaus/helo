package test.com.cl9p.domain;

import com.cl9p.controllers.UserService;
import com.cl9p.domain.User;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.util.Assert;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import java.util.ArrayList;
import java.util.Set;

@ContextConfiguration("classpath:test-context.xml")
public class UserTest extends AbstractJUnit4SpringContextTests {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private User u;
    @Autowired
    private UserService us;

    @Test
    public void testUserValidation() {
        Set<ConstraintViolation<User>> constraintViolationSet = Validation.buildDefaultValidatorFactory().getValidator().validate(u);
        for (ConstraintViolation<User> constraintViolation : constraintViolationSet) {
            System.out.println(constraintViolation.getPropertyPath() + "=>" + constraintViolation.getMessage());
        }
        Assert.notNull(u);
    }

    @Test
    public void testUserMethodValidation() {

        ArrayList<User> users = us.findAllUsers();

        Assert.notNull(users);
    }

}
