package test.com.cl9p.domain;

import com.cl9p.controllers.UserService;
import com.cl9p.domain.User;
import com.cl9p.exceptions.FindAllUsersConstraintException;
import org.hibernate.validator.method.MethodConstraintViolation;
import org.hibernate.validator.method.MethodConstraintViolationException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import java.util.ArrayList;
import java.util.Set;

import static org.junit.Assert.fail;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:test-context.xml")
public class UserTest {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private User u;
    @Autowired
    private UserService us;

    @Test
    public void testUserValidation() {
        Set<ConstraintViolation<User>> constraintViolationSet = Validation.buildDefaultValidatorFactory().getValidator().validate(u);
        for (ConstraintViolation<User> constraintViolation : constraintViolationSet) {
            logger.info(constraintViolation.getPropertyPath() + " => " + constraintViolation.getMessage());
        }
        Assert.notNull(u);
    }

    @Test
    public void testUserMethodValidation() {
        try {
            Set<User> users = us.findAllUsers();
            fail("Expected " + FindAllUsersConstraintException.class.getSimpleName() + " wasn't thrown.");
            Assert.notNull(users);
        } catch (MethodConstraintViolationException e) {
            Set<MethodConstraintViolation<?>> violations = e.getConstraintViolations();
            for (MethodConstraintViolation violation : violations) {
                logger.info(violation.getPropertyPath() + " => " + violation.getMessage());
            }
        }



    }

}
