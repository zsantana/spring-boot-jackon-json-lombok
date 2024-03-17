package com.example.demo.dto.record;

import java.io.Serializable;
import java.util.List;

public record BookRootBeanDTO(List<BookDTO> bookItems) implements Serializable {}