package com.example.thymeleaf.domin;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author Fan
 */
@Data
public class User {
    private String username;
    private List<String> list;
    private Map<String, String> map;
}
