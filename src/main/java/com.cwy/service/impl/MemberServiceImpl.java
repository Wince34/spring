package com.cwy.service.impl;

import com.cwy.dao.MemberMapper;
import com.cwy.entity.MemberEntity;
import com.cwy.service.inter.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description ：
 * @Created by 蔡文粤
 * @date 2018/4/12 16:00
 */
@Service("memberService")
public class MemberServiceImpl implements MemberService {

   /* @Resource
    private MemberDaoInter memberDao;*/

    @Autowired
    private MemberMapper memberMapper;

    @Override
    public List<MemberEntity> getMemberList() {
        System.out.println("===== 获取member信息 =====");
        return memberMapper.getMemberList();
    }
}
