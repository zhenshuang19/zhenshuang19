package com.example.testchajian.dao;

import com.example.testchajian.entity.AjaxFenye;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (AjaxFenye)表数据库访问层
 *
 * @author makejava
 * @since 2022-03-22 17:06:19
 */
public interface AjaxFenyeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AjaxFenye queryById(Object id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AjaxFenye> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param ajaxFenye 实例对象
     * @return 对象列表
     */
    List<AjaxFenye> queryAll(AjaxFenye ajaxFenye);

    /**
     * 新增数据
     *
     * @param ajaxFenye 实例对象
     * @return 影响行数
     */
    int insert(AjaxFenye ajaxFenye);

    /**
     * 修改数据
     *
     * @param ajaxFenye 实例对象
     * @return 影响行数
     */
    int update(AjaxFenye ajaxFenye);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Object id);

}