package my.thienph.tool.checkazv2.configs;

import lombok.extern.slf4j.Slf4j;
import my.thienph.tool.checkazv2.dto.Config;
import my.thienph.tool.checkazv2.dto.Proxy;
import my.thienph.tool.checkazv2.utils.Files;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Configuration
@Slf4j
public class ProxiesConfig {

    @Autowired
    Config config;

    @Bean("proxyList")
    public List<Proxy> proxyList() {
        String pathConf = config.getPathProxies();
        File fileConf = new File(pathConf);
        if (!fileConf.exists())
            throw new IllegalStateException("Tập tin proxy không tồn tại!");
        String text = Files.read(fileConf);
        if (text == null)
            throw new IllegalStateException("Tệp tin không hợp lệ!");
        String[] strProxies = text.split("\n");
        List<Proxy> listPrx = new ArrayList<>();
        for (String strProxy : strProxies) {
            String[] splProxy = strProxy.split(":");
            if (splProxy.length > 1) {
                Proxy proxy = new Proxy();
                proxy.setHost(splProxy[0]);
                proxy.setPort(Integer.parseInt(splProxy[1]));
                if (splProxy.length > 3) {
                    proxy.setUser(splProxy[2]);
                    proxy.setPass(splProxy[3]);
                }
                listPrx.add(proxy);
            }
        }
        log.info("read proxies success, total: {}", listPrx.size());
        return listPrx;
    }
}
