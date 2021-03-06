package config;

import com.datastax.driver.core.AuthProvider;
import com.datastax.driver.core.PlainTextAuthProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
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

   @Autowired
    private Environment env;

    /* Properties are not working. Come back later*/

    @Bean
    @Lazy
    @Override
    public CassandraClusterFactoryBean cluster() {
        CassandraClusterFactoryBean cluster = new CassandraClusterFactoryBean();
        cluster.setContactPoints(env.getProperty("cassandra.contactpoints"));
        cluster.setPort(Integer.parseInt(env.getProperty("cassandra.port")));
        AuthProvider authProvider = new PlainTextAuthProvider(
                env.getProperty("cassandra.username"),env.getProperty("cassandra.password"));
        cluster.setAuthProvider(authProvider);
        return cluster;
    }

    @Override
    protected String getKeyspaceName() {
        return env.getProperty("cassandra.keyspace");
    }

    @Bean
    @Lazy
    @Override
    public CassandraMappingContext cassandraMapping() throws  ClassNotFoundException {
        return new BasicCassandraMappingContext();
    }
}
