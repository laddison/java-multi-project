package cn.onbe.demos.service;

import javax.servlet.http.HttpServletResponse;

/**
 * 小区地址excel读写操作
 * @author LiQiuShui
 */
public interface HouseAddressService {

    /**
     * 导入数据
     */
    void importDataFromExcel();

    /**
     * 导出数据
     * @param response HttpServletResponse 参数
     */
    void exportDataToExcel(HttpServletResponse response);
}
