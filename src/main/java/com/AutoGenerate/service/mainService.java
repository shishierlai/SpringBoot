package com.AutoGenerate.service;

import com.AutoGenerate.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class mainService {

    @Autowired
    private BaseDao baseDao;


    public UserVo getUser(String name, Integer age, String address) {

        UserVo vo=new UserVo();
        vo.setName(name);
        vo.setAge(age);
        vo.setAdress(address);
        String id=baseDao.insertOrUpdateValueObject(vo);
        vo.setId(id);
        return vo;
    }
}
