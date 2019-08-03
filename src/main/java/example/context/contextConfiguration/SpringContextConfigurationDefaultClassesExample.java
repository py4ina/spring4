package example.context.contextConfiguration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class SpringContextConfigurationDefaultClassesExample {
    @Autowired
    private TestA testA;

    @Test
    public void verifyBeans() {
        assertNotNull(testA);
    }

    @Configuration
    static class TestA {

    }
}
