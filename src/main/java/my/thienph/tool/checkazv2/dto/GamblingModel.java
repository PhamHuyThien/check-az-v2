package my.thienph.tool.checkazv2.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class GamblingModel {
    Server server;
    int rowIndex;
    Account account;
    boolean loginWithToken;
}
