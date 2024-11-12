package my.thienph.tool.checkazv2.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Response<T> {
    private int code;
    private String message;
    private T data;
}
