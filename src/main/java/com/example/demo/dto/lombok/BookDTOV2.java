package com.example.demo.dto.lombok;

import java.io.Serializable;

import lombok.Data;

@Data
public class BookDTOV2 implements Serializable {

    private String name; 
    private String type; 
    private int size; 
    private String value;

}
