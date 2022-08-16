package com.example.testchajian.controller;

import com.example.testchajian.entity.Yuansai;
import com.example.testchajian.service.YuansaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Yuansai)表控制层
 *
 * @author makejava
 * @since 2022-03-18 14:17:22
 */
@RestController
@RequestMapping("/yuansai")
public class YuansaiController {
    /**
     * 服务对象
     */
    @Autowired
    private YuansaiService yuansaiService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/selectOne")
    public Yuansai selectOne(Integer id) {
        return this.yuansaiService.queryById(id);
    }


    @GetMapping("/selectAll")
    public List<Yuansai> queryAllByLimits(){
        int a = 1;
        int b = 5;
        return this.yuansaiService.queryAllByLimit(a,b);
    }
}
