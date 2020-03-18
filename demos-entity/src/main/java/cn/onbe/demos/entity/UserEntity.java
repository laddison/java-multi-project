package cn.onbe.demos.entity;

import javax.persistence.*;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

/**
 * security 用户模型
 * @author LiQiuShui
 */
@Entity
@Setter
@Getter
@Table(name = "user")
public class UserEntity implements Serializable {
    private static final long serialVersionUID = -176827308280438372L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String username;

    @Column
    @JsonIgnore
    private String password;
}
