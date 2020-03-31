package cn.onbe.demos.controller;

import cn.onbe.demos.entity.HouseAddressEntity;
import cn.onbe.demos.service.HouseAddressService;
import cn.onbe.demos.utiles.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletResponse;
import java.util.Optional;

/**
 * 用户控制器
 * @author LiQiuShui
 */
@RestController
@RequestMapping("/user")
public class HouseAddressController {

    private HouseAddressService houseAddressService;

    private RedisUtils redisUtils;

    @Autowired
    public void setHouseAddressService(HouseAddressService houseAddressService) {
        this.houseAddressService = houseAddressService;
    }
    @Autowired
    public void setRedisUtils(RedisUtils redisUtils) {
        this.redisUtils = redisUtils;
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

    @GetMapping(value = "/house/info/{id}")
    public String getHouseAddressById(@PathVariable Integer id) {
        HouseAddressEntity info = houseAddressService.getById(id);
        redisUtils.set("myName", "addison Lee");
        String myName = redisUtils.get("myName");
        System.out.println(myName);
        System.out.println(info);
        return "hello";
    }

}
