package com.example.boot.service.userInfo;

import com.example.boot.error.AppRunTimeException;

import java.util.Map;

/**
 * UserInfoDao 用户信息接口类
 * @Author ZYH
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/6/15
 */
public interface UserInfoService
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
