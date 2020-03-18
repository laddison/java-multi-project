package cn.onbe.demos.entity;

import org.springframework.stereotype.Component;
import java.io.Serializable;

@Component
public class JwtResponseEntity implements Serializable {

    private static final long serialVersionUID = -2656638095247311306L;

    private String jwtToken;

    public JwtResponseEntity() {}
    public JwtResponseEntity(String jwttoken) {
        this.jwtToken = jwttoken;
    }

    public String getToken() {
        return this.jwtToken;
    }
}
