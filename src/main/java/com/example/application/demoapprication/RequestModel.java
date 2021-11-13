package com.example.application.demoapprication;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Data
public class RequestModel {

    @Min(1)
    @Max(10)
    private Integer num1 = 0;

    @Min(1)
    @Max(10)
    private Integer num2 = 0;

    public RequestModel(){}
}
