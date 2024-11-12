package my.thienph.tool.checkazv2.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class POM {
    String groupId;
    String artifactId;
    String version;
    String name;
    String description;
    String author;
}
