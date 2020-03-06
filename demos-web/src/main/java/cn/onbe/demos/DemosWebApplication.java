package cn.onbe.demos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  注：为了避免扫描路径不一致，请将启动类放在Root Package 即 cn.onbe.demos
 * @author LiQiuShui
 */
@SpringBootApplication
public class DemosWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemosWebApplication.class, args);
    }
}
