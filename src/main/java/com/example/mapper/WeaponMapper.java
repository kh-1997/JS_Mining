package com.example.mapper;


import com.example.entity.Tag;
import com.example.entity.Weapon;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WeaponMapper {

    //根据传入的各级标签查询结果集
    List<Weapon> queryByTags(Tag tag);

    List<Weapon> selectAllWeapon();

    Weapon selectWeaponByName(String name);

}
