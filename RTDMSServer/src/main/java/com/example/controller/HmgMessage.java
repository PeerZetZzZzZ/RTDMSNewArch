package com.example.controller;

import java.util.List;

public class HmgMessage {
    private String serviceName;
    private String rtdmsProgram;
    private Boolean runnableAgain;

    public HmgMessage(String serviceName, String rtdmsProgram, Boolean runnableAgain) {
        this.serviceName = serviceName;
        this.rtdmsProgram = rtdmsProgram;
        this.runnableAgain = runnableAgain;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getRtdmsProgram() {
        return rtdmsProgram;
    }

    public void setRtdmsProgram(String rtdmsProgram) {
        this.rtdmsProgram = rtdmsProgram;
    }

    public Boolean getRunnableAgain() {
        return runnableAgain;
    }

    public void setRunnableAgain(Boolean runnableAgain) {
        this.runnableAgain = runnableAgain;
    }
}
