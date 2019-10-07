package com.wj.membercheck.biz.service;

import com.wj.membercheck.mbdao.model.MemberDO;

import java.util.List;

/**
 * Created by white_wolf on 2019/10/7.
 *
 * @author thebestwj
 */
public interface MemberService {
    MemberDO findById(int id);
    List<MemberDO> findAllByRole(String role);
    int addOne(MemberDO memberDO);
    int deleteById(int id);
}
