package com.example.testchajian.service.impl;

import com.example.testchajian.entity.AjaxFenye;
import com.example.testchajian.dao.AjaxFenyeDao;
import com.example.testchajian.service.AjaxFenyeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AjaxFenye)表服务实现类
 *
 * @author makejava
 * @since 2022-03-22 17:06:19
 */
@Service("ajaxFenyeService")
public class AjaxFenyeServiceImpl implements AjaxFenyeService {
    @Resource
    private AjaxFenyeDao ajaxFenyeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public AjaxFenye queryById(Object id) {
        return this.ajaxFenyeDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<AjaxFenye> queryAllByLimit(int offset, int limit) {
        return this.ajaxFenyeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ajaxFenye 实例对象
     * @return 实例对象
     */
    @Override
    public AjaxFenye insert(AjaxFenye ajaxFenye) {
        this.ajaxFenyeDao.insert(ajaxFenye);
        return ajaxFenye;
    }

    /**
     * 修改数据
     *
     * @param ajaxFenye 实例对象
     * @return 实例对象
     */
    @Override
    public AjaxFenye update(AjaxFenye ajaxFenye) {
        this.ajaxFenyeDao.update(ajaxFenye);
        return this.queryById(ajaxFenye.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Object id) {
        return this.ajaxFenyeDao.deleteById(id) > 0;
    }
}