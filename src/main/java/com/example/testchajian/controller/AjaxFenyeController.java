package com.example.testchajian.controller;

import com.example.testchajian.entity.AjaxFenye;
import com.example.testchajian.service.AjaxFenyeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (AjaxFenye)表控制层
 *
 * @author makejava
 * @since 2022-03-22 17:06:19
 */
@RestController
@RequestMapping("ajaxFenye")
public class AjaxFenyeController {
    /**
     * 服务对象
     */
    @Resource
    private AjaxFenyeService ajaxFenyeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public AjaxFenye selectOne(Object id) {
        return this.ajaxFenyeService.queryById(id);
    }

}