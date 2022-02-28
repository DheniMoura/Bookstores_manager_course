package com.dhenifer.bookstoresmanager.dto;

public class MessageResponseDTO {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static MessageResponseDTO builder(){
        return new MessageResponseDTO();
    }

    public MessageResponseDTO message (String message){
        this.message = message;
        return this;
    }
}
