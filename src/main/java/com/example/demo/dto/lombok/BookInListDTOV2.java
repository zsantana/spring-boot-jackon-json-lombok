package com.example.demo.dto.lombok;

import java.io.Serializable;

import lombok.Data;

@Data
public class BookInListDTOV2 implements Serializable{

    private String bookname;
    private BookRootBeanDTOV2 bookRootBean;

}
