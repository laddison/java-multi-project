package cn.onbe.demos.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 小区物业地址
 * @author LiQiuShui
 */
@Entity
@Table(name = "house_address")
@Data
public class HouseAddressEntity implements Serializable {

    private static final long serialVersionUID = -8371607221705852141L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Excel(name = "物业名")
    @Column(name = "house_name")
    private String houseName;

    @Excel(name = "区域")
    @Column(name = "area_id")
    private String areaId;

    @Excel(name = "地址")
    @Column(name = "address")
    private String address;
}
