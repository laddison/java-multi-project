package cn.onbe.demos.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import java.io.Serializable;

@Component
@Setter
@Getter
public class JwtRequestEntity implements Serializable {
    private static final long serialVersionUID = 7861843625703729647L;

    private String username;
    private String password;

    public JwtRequestEntity() {}

    public JwtRequestEntity(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

}
