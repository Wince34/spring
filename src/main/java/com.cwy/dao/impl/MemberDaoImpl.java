package com.cwy.dao.impl;

import com.cwy.dao.inter.MemberDaoInter;
import com.cwy.entity.MemberEntity;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description ：
 * @Created by 蔡文粤
 * @date 2018/4/12 16:01
 */
public class MemberDaoImpl implements MemberDaoInter{

   /* //注解引用Mapper类资源
    @Resource(name = "MemberEntityMapper")
    private MemberEntityMapper MemberEntityMapper;

    @Override
    public List<MemberEntity> getMemberList() {
        return MemberEntityMapper.getMemberList();
    }*/
}
