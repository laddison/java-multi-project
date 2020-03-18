package cn.onbe.demos.controller;

import cn.onbe.demos.service.HouseAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletResponse;

/**
 * 用户控制器
 * @author LiQiuShui
 */
@RestController
@RequestMapping("/user")
public class HouseAddressController {

    private HouseAddressService houseAddressService;

    @Autowired
    public void setHouseAddressService(HouseAddressService houseAddressService) {
        this.houseAddressService = houseAddressService;
    }
    @GetMapping("/hi")
    public String hi() {
        return "hello,world";
    }

    @GetMapping("excel")
    public String excel() {
        houseAddressService.importDataFromExcel();

        return "success";
    }

    @GetMapping("download_excel")
    public String downloadExcel(HttpServletResponse response) {
        houseAddressService.exportDataToExcel(response);
        return "success~!";
    }

    @GetMapping("download_json")
    public String downloadJsonFile() {
        houseAddressService.exportDataToJsonFile();
        return "success!~";
    }

}
