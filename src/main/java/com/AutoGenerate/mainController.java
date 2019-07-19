package com.AutoGenerate;


import com.AutoGenerate.service.mainService;
import com.AutoGenerate.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/api")
public class mainController {

    @Autowired
    private mainService mainService;

    @RequestMapping("/getUser")
    @ResponseBody
    public   Map<String,Object> getUser(){
        Map<String,Object> map = new HashMap<String,Object>();
        UserVo user=mainService.getUser("test", 12, "未成年");
        map.put("data",user);
        return map;
    }

}
