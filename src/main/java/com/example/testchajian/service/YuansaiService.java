package com.example.testchajian.service;

import com.example.testchajian.entity.Yuansai;
import java.util.List;

/**
 * (Yuansai)表服务接口
 *
 * @author makejava
 * @since 2022-03-18 14:17:22
 */
public interface YuansaiService {

    /**
     * 通过ID查询单条数据
     *
     * @param detailId 主键
     * @return 实例对象
     */
    Yuansai queryById(Integer detailId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Yuansai> queryAllByLimit(int offset, int limit);

//    /**
//     * 新增数据
//     *
//     * @param yuansai 实例对象
//     * @return 实例对象
//     */
//    Yuansai insert(Yuansai yuansai);
//
//    /**
//     * 修改数据
//     *
//     * @param yuansai 实例对象
//     * @return 实例对象
//     */
//    Yuansai update(Yuansai yuansai);
//
//    /**
//     * 通过主键删除数据
//     *
//     * @param detailId 主键
//     * @return 是否成功
//     */
//    boolean deleteById(Integer detailId);

}
