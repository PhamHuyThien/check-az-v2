package my.thienph.tool.checkazv2.configs;

import lombok.extern.slf4j.Slf4j;
import my.thienph.tool.checkazv2.dto.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
@Slf4j
public class ServerConfig {

    @Bean("serverList")
    public List<Server> serverList() {
        List<Server> servers = Arrays.asList(
                new Server(1, "Gamvip,G88,1G88"),
                new Server(2, "M88,1M88 (bảo trì)"),
                new Server(3, "R88,1R88"),
                new Server(4, "M365"),
                new Server(5, "W88,1W88 (bảo trì)"),
                new Server(6, "W365"),
                new Server(7, "G365"),
                new Server(8, "R365"),
                new Server(9, "V88"),
                new Server(20, "Sumvip2.club"),
                new Server(21, "Vuaclub.tv"),
                new Server(22, "B29.us"),
                new Server(24, "SapNo"),
                new Server(25, "BenVip"),
                new Server(26, "Choang"),
                new Server(27, "Bachkim"),
                new Server(28, "You88"),
                new Server(29, "Loc,Loc89,Naga39"),
                new Server(30, "Binh88 (Sập)"),
                new Server(31, "Bay99"),
                new Server(32, "Man"),
                new Server(33, "SunVN"),
                new Server(35, "BigVip"),
                new Server(36, "B69.mobi"),
                new Server(37, "Rio66.live"),
                new Server(38, "Na99.club"),
                new Server(39, "NoHu.Cx (mới)"),
                new Server(40, "SieuVip.Win (mới)")
        );
        log.info("Get list server game success, total: {}, {}", servers.size(), servers);
        return servers;
    }
}
