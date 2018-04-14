package com.cwy.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.cwy.entity.MemberEntity;
import com.cwy.service.inter.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description ：
 * @Created by 蔡文粤
 * @date 2018/4/11 10:30
 */
@Controller
@RequestMapping(value = "member")
public class MemberController {

    @Resource(name = "memberService")
    private MemberService memberService;

    @RequestMapping(value = "register.do")
    public String register(){
        return "register/register";
    }

    @RequestMapping(value = "login.do")
    public String login(){
        return "login/login";
    }

    @RequestMapping(value = "memberList.do")
    @ResponseBody
    public String getList(){
        List<MemberEntity> memberList = memberService.getMemberList();
        for (MemberEntity m : memberList){
            System.out.println(m.toString());
        }
        String json = JSON.toJSONString(memberList);
        return json;
        //return "member/memberList";
    }
}
