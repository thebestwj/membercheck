package com.wj.membercheck.biz.impl;

import com.wj.membercheck.biz.service.MemberService;
import com.wj.membercheck.mbdao.mapper.MemberDOMapper;
import com.wj.membercheck.mbdao.model.MemberDO;
import com.wj.membercheck.mbdao.model.MemberDOExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by white_wolf on 2019/10/7.
 *
 * @author thebestwj
 */
@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberDOMapper memberDOMapper;

    @Override
    public MemberDO findById(int id) {
        return memberDOMapper.selectByPrimaryKey(id);
    }

    @Override
    public MemberDO findByName(String name) {
        return memberDOMapper.selectByName(name);
    }

    @Override
    public List<MemberDO> findAllByRole(String role) {
        MemberDOExample memberDOExample=new MemberDOExample();
        memberDOExample.createCriteria().andMemRoleLike("%"+ role + "%");
        return memberDOMapper.selectByExample(memberDOExample);
    }

    @Override
    public int addOne(MemberDO memberDO) {
        if (null != memberDOMapper.selectByPrimaryKey(memberDO.getMemId())) return 0;
        memberDOMapper.insert(memberDO);
        return memberDO.getMemId();
    }

    @Override
    public int deleteById(int id) {
        return  memberDOMapper.deleteByPrimaryKey(id);

    }
}
