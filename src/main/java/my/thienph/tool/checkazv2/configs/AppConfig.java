package my.thienph.tool.checkazv2.configs;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import my.thienph.tool.checkazv2.dto.Config;
import my.thienph.tool.checkazv2.utils.Files;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;

@Configuration
@Slf4j
public class AppConfig {
    @Value("${spring.app.path-config}")
    String configPath;

    @Autowired
    @Qualifier("objectMapperSnakeCase")
    ObjectMapper objectMapper;

    @Bean("config")
    @SneakyThrows
    public Config getConfig() {
        File fileConf = new File(configPath);
        if (!fileConf.exists())
            throw new IllegalStateException("Tệp cấu hình tool không tồn tại!");
        String data = Files.read(fileConf);
        Config config = objectMapper.readValue(data, Config.class);
        log.info("get config success: {}", config);
        return config;
    }
}
