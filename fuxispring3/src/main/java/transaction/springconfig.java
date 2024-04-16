package transaction;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.ResourceBundle;

/**
 * @projectName: spring
 * @package: transaction
 * @className: springconfig
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/29 15:31
 * @version: 1.0
 */
@Configuration
@ComponentScan("transaction.Service")
@EnableTransactionManagement
public class springconfig {
    @Bean(name = "dataSource")
    public DataSource getDataSource(){
        ResourceBundle bundle = ResourceBundle.getBundle("jdbc.propertis");
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(bundle.getString("jdbc.driver"));
        dataSource.setUrl(bundle.getString("jdbc.url"));
        dataSource.setUsername(bundle.getString("jdbc.username"));
        dataSource.setPassword(bundle.getString("jdbc.password"));
        return dataSource;
    }
    @Bean(name = "txManager")
    public DataSourceTransactionManager getDataSourceTransactionManager(DataSource dataSource){
        DataSourceTransactionManager txManager = new DataSourceTransactionManager();
        txManager.setDataSource(dataSource);
        return txManager;
    }
}
