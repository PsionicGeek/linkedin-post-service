package org.psionicgeek.linkedin.postservice.dto;


import lombok.Data;


import java.time.LocalDateTime;


@Data
public class PostDto {
    private Long id;


    private String content;

    private Long userId;


    private LocalDateTime createdAt;

}
