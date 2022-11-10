package com.bridgelabz.addressbookapp.dto;

import lombok.Data;

///Response DTO back to DTO Object
// @Data - lombok using autogenerate the Getter and Setter Methods
public @Data class ResponseDTO {
    private String message;
    private Object data;

    public ResponseDTO(String message, Object data) {
        this.message = message;
        this.data = data;
    }

}
