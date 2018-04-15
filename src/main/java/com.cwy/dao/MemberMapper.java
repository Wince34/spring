package com.cwy.dao;

import com.cwy.entity.Entity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Mapper {
    /*int deleteByPrimaryKey(Long id);

    int insert(MemberEntity member);

    int insertSelective(MemberEntity member);

    MemberEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MemberEntity member);

    int updateByPrimaryKey(MemberEntity member);*/

    List<MemberEntity> getMemberList();
}