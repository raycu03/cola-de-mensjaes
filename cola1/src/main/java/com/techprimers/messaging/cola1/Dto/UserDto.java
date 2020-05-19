package com.techprimers.messaging.cola1.Dto;


public class UserDto {
    private String name;
    private String Code;


    public UserDto() {}

    public UserDto(String name, String code) {
        this.name = name;
        Code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }
}
