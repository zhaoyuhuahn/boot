package com.example.boot.dao.userInfoDao;

import com.example.boot.error.AppRunTimeException;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * @name
 * @Author ZYH
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/6/15
 */
@Repository
public interface UserInfoDao
{
    /**
     * getUserInfoByUserNumAndUserPhone 根据编号和手机号查询用户信息接口
     * @param
     * @return Map<String,Object>类型 返回结果
     * @throws
     * @Description
     * @Author  ZYH
     * @Version V1.0.0
     * @Since 1.0
     * @Date 2020/6/15
     */
    public Map<String,Object> getUserInfoByUserNumAndUserPhone() throws AppRunTimeException;;
}

