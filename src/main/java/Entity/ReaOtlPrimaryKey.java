package Entity;


import org.springframework.cassandra.core.PrimaryKeyType;
import org.springframework.data.cassandra.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.mapping.PrimaryKeyColumn;

import java.io.Serializable;

/**
 * Created by A513915 on 7/30/2015.
 */
@PrimaryKeyClass
public class ReaOtlPrimaryKey implements Serializable{

    @PrimaryKeyColumn(name="dept_i",ordinal = 0,type= PrimaryKeyType.PARTITIONED)
    private Integer deptId;

    @PrimaryKeyColumn(name="class_i",ordinal = 1,type= PrimaryKeyType.PARTITIONED)
    private Integer classId;

    @PrimaryKeyColumn(name="item_i",ordinal = 2,type= PrimaryKeyType.PARTITIONED)
    private Integer itemId;

    @PrimaryKeyColumn(name="loc_i",ordinal = 3,type= PrimaryKeyType.PARTITIONED)
    private Integer storeId;

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }
}
