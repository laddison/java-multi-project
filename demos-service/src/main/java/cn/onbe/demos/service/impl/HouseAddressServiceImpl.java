package cn.onbe.demos.service.impl;

import cn.onbe.demos.entity.HouseAddressEntity;
import cn.onbe.demos.repository.HouseAddressRepository;
import cn.onbe.demos.service.HouseAddressService;
import cn.onbe.demos.utiles.ExcelUtiles;
import cn.onbe.demos.utiles.JsonUtiles;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

/**
 * 小区地址实现
 *
 * @author LiQiuShui
 */
@Service
public class HouseAddressServiceImpl implements HouseAddressService {
    private HouseAddressRepository houseAddressRepository;

    private static final Logger logger = LoggerFactory.getLogger(HouseAddressServiceImpl.class);

    @Autowired
    public void setHouseAddressRepository(HouseAddressRepository houseAddressRepository) {
        this.houseAddressRepository = houseAddressRepository;
    }

    @Override
    public void importDataFromExcel() {
        try {
            String filePath = "/usr/local/www/demos/upload/house.xlsx";
            List<HouseAddressEntity> list = ExcelUtiles.importExcel(filePath, 0, 1, HouseAddressEntity.class);
            assert list != null;

            for (HouseAddressEntity item : list) {
                houseAddressRepository.save(item);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exportDataToExcel(HttpServletResponse response) {
        List<HouseAddressEntity> list = houseAddressRepository.findAll();
        try {
            ExcelUtiles.exportExcel(list, "小区地址表", "小区表", HouseAddressEntity.class, "小区地址表3", response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void exportDataToJsonFile() {
        String filePath = "/usr/local/www/demos/upload/data.json";
        File file = new File(filePath);
        List<HouseAddressEntity> list = houseAddressRepository.findAll();
        String jsonString = JsonUtiles.list2Json(list);
        try {
            FileUtils.write(file, jsonString, "UTF-8", false);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(jsonString);
    }

    @Cacheable(value = "address", key="#id", unless = "#result == null")
    @Override
    public HouseAddressEntity getById(Integer id) {
        HouseAddressEntity one = houseAddressRepository.getOne(id);
        System.out.println(2222);
        System.out.println(one);
        return one;
    }
}
