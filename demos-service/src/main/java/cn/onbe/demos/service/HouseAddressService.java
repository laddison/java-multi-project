package cn.onbe.demos.service;

import cn.onbe.demos.entity.HouseAddressEntity;

import javax.servlet.http.HttpServletResponse;
import java.util.Optional;

/**
 * 小区地址excel读写操作
 * @author LiQiuShui
 */
public interface HouseAddressService {

    /**
     * 从excel导入数据到数据库
     */
    void importDataFromExcel();

    /**
     * 导出数据到excel
     * @param response HttpServletResponse 参数
     */
    void exportDataToExcel(HttpServletResponse response);

    /**
     * 导出数据到json文件
     */
    void exportDataToJsonFile();

    /**
     * 通过id获取单个数据
     * @param id id
     * @return option
     */
    HouseAddressEntity getById(Integer id);
}
