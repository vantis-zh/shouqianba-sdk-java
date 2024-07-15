package com.vantisspace.sdk.shouqianba.bean;

import lombok.Data;

@Data
public class SQBAliPayProperties {
    private String signAlgorithm;
    private String brandCode;
    private String storeSn;
    private String scene;
    private boolean testMode;
}
