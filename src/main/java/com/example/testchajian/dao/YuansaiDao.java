package com.example.testchajian.dao;

import com.example.testchajian.entity.Yuansai;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (Yuansai)表数据库访问层
 *
 * @author makejava
 * @since 2022-03-18 14:17:22
 */
public interface YuansaiDao {

    /**
     * 通过ID查询单条数据
     *
     * @param detailId 主键
     * @return 实例对象
     */
    Yuansai queryById(Integer detailId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Yuansai> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


//    /**
//     * 通过实体作为筛选条件查询
//     *
//     * @param yuansai 实例对象
//     * @return 对象列表
//     */
//    List<Yuansai> queryAll(Yuansai yuansai);
//
//    /**
//     * 新增数据
//     *
//     * @param yuansai 实例对象
//     * @return 影响行数
//     */
//    int insert(Yuansai yuansai);
//
//    /**
//     * 修改数据
//     *
//     * @param yuansai 实例对象
//     * @return 影响行数
//     */
//    int update(Yuansai yuansai);
//
//    /**
//     * 通过主键删除数据
//     *
//     * @param detailId 主键
//     * @return 影响行数
//     */
//    int deleteById(Integer detailId);

}
