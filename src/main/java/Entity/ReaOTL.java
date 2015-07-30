package Entity;

import org.springframework.context.annotation.Primary;
import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

/**
 * Created by A513915 on 7/29/2015.
 */

@Table(value = "rea_poc_load1")
public class ReaOtl {

    @PrimaryKey
    private ReaOtlPrimaryKey primaryKey;

    @Column( value= "dd_q")
    private float ddQty;

    @Column(value = "bi_q")
    private float biQty;

    @Column(value = "otl_q")
    private float otlQty;

    @Column(value = "pbi_q")
    private float pbiQty;

    public ReaOtlPrimaryKey getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(ReaOtlPrimaryKey primaryKey) {
        this.primaryKey = primaryKey;
    }

    public float getDdQty() {
        return ddQty;
    }

    public void setDdQty(float ddQty) {
        this.ddQty = ddQty;
    }

    public float getBiQty() {
        return biQty;
    }

    public void setBiQty(float biQty) {
        this.biQty = biQty;
    }

    public float getPbiQty() {
        return pbiQty;
    }

    public void setPbiQty(float pbiQty) {
        this.pbiQty = pbiQty;
    }

    public float getOtlQty(){
        return otlQty;
    }

    public void setOtlQty(float otlQty) {
        this.otlQty = otlQty;
    }
}
