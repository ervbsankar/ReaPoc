package Entity;

import org.springframework.context.annotation.Primary;
import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

/**
 * Created by A513915 on 7/29/2015.
 */

@Table(value = "rea_poc_load2")
public class ReaOTL {

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

    @Column(value = "oh_q")
    private float ohQty;

    @Column(value = "oo_q")
    private float ooQty;

    @Column(value = "ow_q")
    private float owQty;

    @Column(value = "lib_q")
    private float libQty;

    @Column(value = "tran_q")
    private float tranQty;

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

    public float getOhQty() {
        return ohQty;
    }

    public void setOhQty(float ohQty) {
        this.ohQty = ohQty;
    }

    public float getOoQty() {
        return ooQty;
    }

    public void setOoQty(float ooQty) {
        this.ooQty = ooQty;
    }

    public float getOwQty() {
        return owQty;
    }

    public void setOwQty(float owQty) {
        this.owQty = owQty;
    }

    public float getLibQty() {
        return libQty;
    }

    public void setLibQty(float libQty) {
        this.libQty = libQty;
    }

    public float getTranQty() {
        return tranQty;
    }

    public void setTranQty(float tranQty) {
        this.tranQty = tranQty;
    }
}
