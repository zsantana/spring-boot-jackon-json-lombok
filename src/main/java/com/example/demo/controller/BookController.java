package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.lombok.BookInListDTOV2;
import com.example.demo.dto.lombok.RetornoDTOV2;
import com.example.demo.dto.record.BookInListDTO;
import com.example.demo.dto.record.RetornoDTO;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/api/book")
public class BookController {

    private static Logger log = LoggerFactory.getLogger(BookController.class);


    @PostMapping("v1")
    public RetornoDTO processar(@RequestBody BookInListDTO bookInListDTO) {

        // log.info("Bookname: {}" , bookInListDTO.bookname());
        // log.info("Book items:");

        StringBuffer sb = new StringBuffer();

        bookInListDTO.bookRootBean().bookItems().forEach(book -> {
            // log.info("  Name: " + book.name());
            // log.info("  Type: " + book.type());
            // log.info("  Size: " + book.size());
            // log.info("  Value: " + book.value());

            sb.append(book.name() + book.type() + book.size() + book.value());
        });

        return new RetornoDTO(sb.toString());
    }

    @PostMapping("v2")
    public RetornoDTOV2 processar( @RequestBody BookInListDTOV2 bookInListDTO) {

        StringBuffer sb = new StringBuffer();

        bookInListDTO.getBookRootBean().getBookItems().forEach(book -> {
            // log.info("  Name: " + book.name());
            // log.info("  Type: " + book.type());
            // log.info("  Size: " + book.size());
            // log.info("  Value: " + book.value());

            sb.append(book.getName() + book.getType() + book.getSize() + book.getValue());
        });

        return new RetornoDTOV2(sb.toString());

    }

    @PostMapping("v3")
    public String processar(@RequestBody String jsonString) {

        try {
            // Converter a string JSON para objeto Java
            ObjectMapper mapper = new ObjectMapper();
            BookInListDTOV2 bookInListDTO = mapper.readValue(jsonString, BookInListDTOV2.class);
            
            // Log dos dados recebidos
            // log.info("Bookname: {}", bookInListDTO.getBookname());
            // log.info("Book items:");
            StringBuilder sb = new StringBuilder();
            bookInListDTO.getBookRootBean().getBookItems().forEach(book -> {
                // log.info("  Name: {}", book.getName());
                // log.info("  Type: {}", book.getType());
                // log.info("  Size: {}", book.getSize());
                // log.info("  Value: {}", book.getValue());
                sb.append(book.getName()).append(book.getType()).append(book.getSize()).append(book.getValue());
            });

            return sb.toString();

        } catch (Exception e) {
            log.error("Erro ao processar o JSON", e);
            return "Erro ao processar o JSON";
        }

    }
    
}
