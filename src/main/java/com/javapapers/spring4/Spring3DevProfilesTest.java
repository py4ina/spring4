package com.javapapers.spring4;

import com.javapapers.spring4.config.DevEmployeeConfig;
import com.javapapers.spring4.config.EmployeeConfig;
import com.javapapers.spring4.config.ProdEmployeeConfig;
import com.javapapers.spring4.domain.Employee;
import com.javapapers.spring4.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import java.util.List;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {EmployeeConfig.class,DevEmployeeConfig.class,ProdEmployeeConfig.class},loader=AnnotationConfigContextLoader.class)
@ActiveProfiles(value="dev")
public class Spring3DevProfilesTest {
    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void testDevDataSource() {
        EmployeeService service = (EmployeeService)applicationContext.getBean("employeeService");
        assertNotNull(service);
        List<Employee> employeeDetails = service.getEmployeeDetails();
        assertEquals(2, employeeDetails.size());
        assertEquals("Abc", employeeDetails.get(0).getName());
        assertEquals("Xyz", employeeDetails.get(1).getName());
    }
}
