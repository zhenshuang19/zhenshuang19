package com.example.testchajian.dao;

import com.example.testchajian.entity.Duisai;
import com.example.testchajian.entity.DuisaiKey;

public interface DuisaiDao {
    int deleteByPrimaryKey(DuisaiKey key);

    int insert(Duisai record);

    int insertSelective(Duisai record);

    Duisai selectByPrimaryKey(DuisaiKey key);

    int updateByPrimaryKeySelective(Duisai record);

    int updateByPrimaryKey(Duisai record);
}