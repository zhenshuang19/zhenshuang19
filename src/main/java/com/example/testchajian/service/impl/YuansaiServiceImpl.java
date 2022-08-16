package com.example.testchajian.service.impl;

import com.example.testchajian.entity.Yuansai;
import com.example.testchajian.dao.YuansaiDao;
import com.example.testchajian.service.YuansaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Yuansai)表服务实现类
 *
 * @author makejava
 * @since 2022-03-18 14:17:22
 */

@Service("yuansaiService")
public class YuansaiServiceImpl implements YuansaiService {
    @Resource
    private YuansaiDao yuansaiDao;

    /**
     * 通过ID查询单条数据
     *
     * @param detailId 主键
     * @return 实例对象
     */
    @Override
    public Yuansai queryById(Integer detailId) {
        return this.yuansaiDao.queryById(detailId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Yuansai> queryAllByLimit(int offset, int limit) {
        return this.yuansaiDao.queryAllByLimit(offset, limit);
    }

//    /**
//     * 新增数据
//     *
//     * @param yuansai 实例对象
//     * @return 实例对象
//     */
//    @Override
//    public Yuansai insert(Yuansai yuansai) {
//        this.yuansaiDao.insert(yuansai);
//        return yuansai;
//    }
//
//    /**
//     * 修改数据
//     *
//     * @param yuansai 实例对象
//     * @return 实例对象
//     */
//    @Override
//    public Yuansai update(Yuansai yuansai) {
//        this.yuansaiDao.update(yuansai);
//        return this.queryById(yuansai.getDetailId());
//    }
//
//    /**
//     * 通过主键删除数据
//     *
//     * @param detailId 主键
//     * @return 是否成功
//     */
//    @Override
//    public boolean deleteById(Integer detailId) {
//        return this.yuansaiDao.deleteById(detailId) > 0;
//    }
}
