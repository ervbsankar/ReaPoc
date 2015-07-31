package repo;


import Entity.ReaOtl;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ReaDao extends CassandraRepository<ReaOtl> {

    @Query("Select * from rea_poc_load2 where dept_i = ?0 and class_i = ?1 and item_i = ?2")
    List<ReaOtl> findOtlItem(@Param("dept") Integer dept,@Param("clas") Integer clas,
                         @Param("item") Integer item);

    @Query("Select * from rea_poc_load2 where dept_i = ?0 and class_i = ?1")
    List<ReaOtl> findOtlClas(@Param("dept") Integer dept,
                             @Param("clas") Integer clas);

    @Query("Select * from rea_poc_load2 where dept_i = ?0")
    List<ReaOtl> findOtlDept(@Param("dept") Integer dept);

}