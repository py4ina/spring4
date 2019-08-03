package example.context.contextConfiguration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {BeanA.class, BeanB.class, TestBeanC.class})
public class SpringContextConfigurationClassesExample {
    @Autowired
    private BeanA beanA;
    @Autowired
    private BeanB beanB;
    @Autowired
    private TestBeanC beanC;

    @Test
    public void verifyBeans(){
        assertNotNull(beanA);
        assertNotNull(beanB);
        assertNotNull(beanC);
    }
}
