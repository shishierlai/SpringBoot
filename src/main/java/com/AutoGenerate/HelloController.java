package com.AutoGenerate;

import com.AutoGenerate.Interface.JsonArg;
import com.AutoGenerate.service.mainService;
import com.AutoGenerate.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/boot")
public class HelloController {

    @Autowired
    private mainService mainService;


    @RequestMapping("/sayhello")
    @ResponseBody
    public Map<String, String> index(){

        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("desc", "登录成功");
        return hashMap;
    }

    @RequestMapping("/getUser")
    public @ResponseBody  Map<String,Object> getUser(@JsonArg String name,@JsonArg Integer age,@JsonArg String address){
        Map<String,Object> map = new HashMap<String,Object>();
        UserVo user=mainService.getUser(name,age,address);
        map.put("code",1000);
        map.put("desc","");
        map.put("data",user);
        return map;
    }

}