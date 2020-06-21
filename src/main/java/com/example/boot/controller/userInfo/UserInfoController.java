package com.example.boot.controller.userInfo;

import com.alibaba.fastjson.JSON;
import com.example.boot.service.userInfo.UserInfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import com.alibaba.fastjson.serializer.SerializerFeature;

import javax.annotation.Resource;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @project
 * @Author ZYH
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/6/15
 */
public class UserInfoController
{
    @Resource
    public UserInfoService userInfoService;

    /**
     * getUserInfoByUserNumAndUserPhone 根据编号和手机号查询用户信息
     * @param
     * @return 类型 返回结果
     * @throws
     * @Description
     * @Author  ZYH
     * @Version V1.0.0
     * @Since 1.0
     * @Date 2020/6/15
     */
    @RequestMapping("/getUserInfoByUserNumAndUserPhone")
    public String getUserInfoByUserNumAndUserPhone()
    {
        Map<String,Object> resultMap = new ConcurrentHashMap<String,Object>();
        String resultString = "";
        try
        {
            resultMap = userInfoService.getUserInfoByUserNumAndUserPhone();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        resultString = JSON.toJSONString(resultMap, SerializerFeature.WriteMapNullValue);
        return resultString;
    }
}
