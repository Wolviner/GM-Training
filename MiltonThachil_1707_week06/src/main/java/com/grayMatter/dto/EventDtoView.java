package com.grayMatter.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EventDtoView {
    private Long id;
    private String name;
    private String location;
    private int capacity;
}
