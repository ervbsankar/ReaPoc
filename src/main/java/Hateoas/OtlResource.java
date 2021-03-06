package Hateoas;

import org.springframework.hateoas.ResourceSupport;

/**
 * Created by A513915 on 7/30/2015.
 */
public class OtlResource extends ResourceSupport {

    private Integer deptId;
    private Integer classId;
    private Integer itemId;
    private Integer storeId;
    private float ddQty;
    private float biQty;
    private float pbiQty;
    private float otlQty;
    private float ohQty;
    private float ooQty;
    private float owQty;
    private float libQty;
    private float tranQty;
    private float srcNode;

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

    public float getOtlQty() {
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

    public void setTranQty(float tranQty)
    {
        this.tranQty = tranQty;
    }

    public float getSrcNode() {
        return srcNode;
    }

    public void setSrcNode(float srcNode) {
        this.srcNode = srcNode;
    }
}
