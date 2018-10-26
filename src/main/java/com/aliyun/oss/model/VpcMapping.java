package com.aliyun.oss.model;

public class VpcMapping {

    private String vpcId;

    private String instIp;

    private int instPort;

    private String refName;

    private String refType;

    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public String getInstIp() {
        return instIp;
    }

    public void setInstIp(String instIp) {
        this.instIp = instIp;
    }

    public int getInstPort() {
        return instPort;
    }

    public void setInstPort(int instPort) {
        this.instPort = instPort;
    }

    public String getRefName() {
        return refName;
    }

    public void setRefName(String refName) {
        this.refName = refName;
    }

    public String getRefType() {
        return refType;
    }

    public void setRefType(String refType) {
        this.refType = refType;
    }
}
