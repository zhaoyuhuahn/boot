package com.example.boot.service.userInfo.imp;

import com.example.boot.error.AppRunTimeException;
import com.example.boot.service.userInfo.UserInfoService;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @name
 * @Author ZYH
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/6/15
 */
@Service
public class UserInfoServiceImp implements UserInfoService {
    @Override
    public Map<String, Object> getUserInfoByUserNumAndUserPhone() throws AppRunTimeException
    {
        Map<String,Object> resultMap = new ConcurrentHashMap<String,Object>();
        try
        {

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        return resultMap;
    }
}
