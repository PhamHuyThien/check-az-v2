package my.thienph.tool.checkazv2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Config {
    private String pathProxies;
    private String pathCheckAccount;
    private int idServer;
    private int idThread;
    private boolean checkFreeze;
    private boolean checkToken;
    private boolean useProxies;
    private boolean debugMode;
    private boolean shuffle;
    private String code;
    private String md5;
}
