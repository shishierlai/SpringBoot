package com.AutoGenerate.service;


import com.AutoGenerate.Interface.GeneteraShort;
import com.AutoGenerate.util.GenerateID;
import com.AutoGenerate.vo.UserVo;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;

@Service
public class BaseDao {


    public String insertOrUpdateValueObject(UserVo vo) throws BaseOrmException {
        if(vo.getId()==null || vo.getId().trim().length()==0){
            vo.setId(GenerateID.getInstance().generateID());
            try{
                Field field=vo.getClass().getDeclaredField("id");
                if(field.isAnnotationPresent(GeneteraShort.class)){
                    vo.setId(GenerateID.getInstance().generateShortUuid());
                }else{
                    vo.setId(GenerateID.getInstance().generateID());
                }
            }catch (NoSuchFieldException e){
                throw new BaseOrmException("报错了==="+e.getMessage(),e);
            }
        }
        return vo.getId();
    }
}
