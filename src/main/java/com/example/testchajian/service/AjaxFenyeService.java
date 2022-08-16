package com.example.testchajian.service;

import com.example.testchajian.entity.AjaxFenye;
import java.util.List;

/**
 * (AjaxFenye)表服务接口
 *
 * @author makejava
 * @since 2022-03-22 17:06:19
 */
public interface AjaxFenyeService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AjaxFenye queryById(Object id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AjaxFenye> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param ajaxFenye 实例对象
     * @return 实例对象
     */
    AjaxFenye insert(AjaxFenye ajaxFenye);

    /**
     * 修改数据
     *
     * @param ajaxFenye 实例对象
     * @return 实例对象
     */
    AjaxFenye update(AjaxFenye ajaxFenye);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Object id);

}