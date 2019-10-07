package com.wj.membercheck.mbdao.mapper;

import com.wj.membercheck.mbdao.model.MemberDO;
import com.wj.membercheck.mbdao.model.MemberDOExample;
import java.util.List;

public interface MemberDOMapper {
    long countByExample(MemberDOExample example);

    int deleteByPrimaryKey(Integer memId);

    int insert(MemberDO record);

    int insertSelective(MemberDO record);

    List<MemberDO> selectByExample(MemberDOExample example);

    MemberDO selectByPrimaryKey(Integer memId);

    int updateByPrimaryKeySelective(MemberDO record);

    int updateByPrimaryKey(MemberDO record);
}