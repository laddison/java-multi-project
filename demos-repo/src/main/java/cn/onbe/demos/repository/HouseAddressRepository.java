package cn.onbe.demos.repository;

import cn.onbe.demos.entity.HouseAddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseAddressRepository extends JpaRepository<HouseAddressEntity, Integer> {
}
