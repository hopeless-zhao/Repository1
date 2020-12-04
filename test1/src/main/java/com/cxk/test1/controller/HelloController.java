package com.cxk.test1.controller;

import com.cxk.test1.bean.BaseRespVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName:HelloController
 * @Description:TODO
 * @author:zgw
 * @date:2020/12/4 22:27
 */
@RestController
public class HelloController {
    @RequestMapping("hello")
    public BaseRespVo hello(){
        return BaseRespVo.ok("FuckSB,Mvn,Git");
    }
}
