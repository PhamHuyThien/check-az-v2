package my.thienph.tool.checkazv2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Account {

    private int status;
    private String username;
    private String password;
    private String auth;
    private String description;
    private String name;
    private int money;
    private int moneyFreeze;
    private String mobileOne;
    private String mobileTwo;
    private String openGame;
    private String confirmStatus;

    public Account(String username, String password, int status, String auth) {
        this.username = username;
        this.password = password;
        this.status = status;
        this.auth = auth;
    }

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

}
