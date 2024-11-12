package my.thienph.tool.checkazv2.configs;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

@Configuration
@Slf4j
public class UserAgentConfig {

    @Bean("userAgentList")
    @SneakyThrows
    public List<String> userAgentList() {
        List<String> userAgentList = new ArrayList<>();
        File file = new File("./.user-agent");
        if (!file.exists())
            throw new FileNotFoundException();
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String UA;
        while ((UA = br.readLine()) != null) {
            userAgentList.add(UA);
        }
        log.info("read user-agent list success, total: {}", userAgentList.size());
        return userAgentList;
    }
}
