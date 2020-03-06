package cn.onbe.demos.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * 用户entity
 * @author LiQiuShui
 */
@Entity
@Table(name = "user")
@Data
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "mobile")
    private long mobile;

    @Column(name = "name")
    private String name;

    @Column(name = "create_time")
    private long create_time;
}
