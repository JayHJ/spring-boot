package cn.jayhe.springbootmybatis;

import cn.jayhe.springbootmybatis.service.DataSourceService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestService extends ApplicationTests {

    @Autowired
    DataSourceService dataSourceService;

    @Test
    public void testTransaction() {
        dataSourceService.saveRecords();
    }
}
