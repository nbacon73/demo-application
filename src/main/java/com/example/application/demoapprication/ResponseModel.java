package com.example.application.demoapprication;

import lombok.Data;
import org.apache.commons.lang3.ObjectUtils;

@Data
public class ResponseModel {

    private Integer addition = 0;

    private Integer subtraction = 0;

    private Integer multiplication = 0;

    private Double division = 0.0;

    public ResponseModel(){}

    public ResponseModel(RequestModel requestModel){
        if (requestModel.getNum1() != 0 || requestModel.getNum2() != 0) {
            this.addition = requestModel.getNum1() + requestModel.getNum2();
            this.subtraction = requestModel.getNum1() - requestModel.getNum2();
            this.multiplication = requestModel.getNum1() * requestModel.getNum2();
            this.division = Double.parseDouble(Integer.toString(requestModel.getNum1())) / Double.parseDouble(Integer.toString(requestModel.getNum2()));
        }
    }
}
