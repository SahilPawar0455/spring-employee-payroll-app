package com.bridgelabz.employeepayrollapp.dto;

import com.bridgelabz.employeepayrollapp.model.Employee;

import java.util.Optional;

public class ResponseDTO {
    private String messages;
    private Object data;

    public ResponseDTO(String messages,Object employee) {
        this.messages = messages;
        this.data = employee;
    }

    public String getMessages() {
        return messages;
    }

    public Object getData() {
        return data;
    }

    @Override
    public String toString() {
        return "ResponseDTO{" +
                "messages='" + messages + '\'' +
                ", data=" + data +
                '}';
    }
}
