package repo;


import Entity.ReaOTL;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ReaDao extends CassandraRepository<ReaOTL> {

    @Query("Select * from rea_poc_load1")
    List<ReaOTL> findByName();

}