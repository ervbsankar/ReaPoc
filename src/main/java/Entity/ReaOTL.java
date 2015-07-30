package Entity;

import org.springframework.context.annotation.Primary;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

/**
 * Created by A513915 on 7/29/2015.
 */

@Table
public class ReaOTL {

    @PrimaryKey
    private Integer Dept;
}
