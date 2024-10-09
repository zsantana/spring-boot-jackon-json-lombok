package com.example.demo.dto.lombok;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class BookRootBeanDTOV2 implements Serializable{

    private List<BookDTOV2> bookItems;
    
}