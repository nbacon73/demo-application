package com.example.application.demoapprication;

@org.springframework.stereotype.Service
public class Service {

    public ResponseModel getData(RequestModel requestModel) {

        return new ResponseModel(requestModel);
    }
}
