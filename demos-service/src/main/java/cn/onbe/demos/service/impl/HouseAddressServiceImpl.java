package cn.onbe.demos.service.impl;

import cn.onbe.demos.entity.HouseAddressEntity;
import cn.onbe.demos.repository.HouseAddressRepository;
import cn.onbe.demos.service.HouseAddressService;
import cn.onbe.demos.utiles.ExcelUtiles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.util.List;

/**
 * 小区地址实现
 * @author LiQiuShui
 */
@Service
public class HouseAddressServiceImpl implements HouseAddressService {
    private HouseAddressRepository houseAddressRepository;

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
}
