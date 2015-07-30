package config;

import com.datastax.driver.core.AuthProvider;
import com.datastax.driver.core.PlainTextAuthProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.cassandra.config.CassandraClusterFactoryBean;
import org.springframework.data.cassandra.config.java.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.mapping.BasicCassandraMappingContext;
import org.springframework.data.cassandra.mapping.CassandraMappingContext;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@Configuration
@PropertySource(value = {"classpath:cassandra.properties"})
@EnableCassandraRepositories(basePackages = {"repo"})
public class CassandraConfig extends AbstractCassandraConfiguration {

   /* @Autowired
    private Environment env;*/

    /* Properties are not working. Come back later*/

    @Bean
    @Override
    public CassandraClusterFactoryBean cluster() {
        CassandraClusterFactoryBean cluster = new CassandraClusterFactoryBean();
        cluster.setContactPoints("75.73.199.231");
        /*cluster.setPort(Integer.parseInt(env.getProperty("cassandra.port")));*/
        cluster.setPort(9042);
        AuthProvider authProvider = new PlainTextAuthProvider("cassandra","cassandra");
        cluster.setAuthProvider(authProvider);
        return cluster;
    }

    @Override
    protected String getKeyspaceName() {
        return "rea_poc";
    }

    @Bean
    @Override
    public CassandraMappingContext cassandraMapping() throws  ClassNotFoundException {
        return new BasicCassandraMappingContext();
    }
}
