package com.javapapers.spring4;

import com.javapapers.spring4.config.DevEmployeeConfig;
import com.javapapers.spring4.config.EmployeeConfig;
import com.javapapers.spring4.config.EmployeeDataSourceConfig;
import com.javapapers.spring4.config.ProdEmployeeConfig;
import com.javapapers.spring4.domain.Employee;
import com.javapapers.spring4.service.EmployeeService;
import com.javapapers.spring4.util.DataSource;
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
@ContextConfiguration(classes= {EmployeeConfig.class,ProdEmployeeConfig.class},loader=AnnotationConfigContextLoader.class)
@ActiveProfiles(value="prod")
public class Spring3ProdProfilesTest {
    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void testProdDataSource() {
        EmployeeService service = (EmployeeService)applicationContext.getBean("employeeService");
        assertNotNull(service);
        List<Employee> employeeDetails = service.getEmployeeDetails();
        assertEquals(3, employeeDetails.size());
        assertEquals("Ramu", employeeDetails.get(0).getName());
        assertEquals("Charan", employeeDetails.get(1).getName());
        assertEquals("Joe", employeeDetails.get(2).getName());
//        DataSource dataSource = (DataSource) applicationContext.getBean("dataSource");
    }
}
