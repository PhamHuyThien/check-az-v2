package my.thienph.tool.checkazv2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.HttpHost;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Proxy {
    private String host;
    private int port;
    private String user;
    private String pass;

    public HttpHost getHttpHost() {
        return new HttpHost(host, port);
    }
}
