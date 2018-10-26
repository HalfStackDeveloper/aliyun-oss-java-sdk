package com.aliyun.oss.model;

public class VpcMappingRequest extends GenericRequest {

    private VpcMapping vpcMapping;

    public VpcMapping getVpcMapping() {
        return vpcMapping;
    }

    public void setVpcMapping(VpcMapping vpcMapping) {
        this.vpcMapping = vpcMapping;
    }

}
