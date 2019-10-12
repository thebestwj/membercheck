package com.wj.membercheck.mbdao.mapper;

import com.wj.membercheck.mbdao.model.MemberDO;
import com.wj.membercheck.mbdao.model.MemberDOExample;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MemberDOMapper {
    MemberDO selectByName(String memName);

    long countByExample(MemberDOExample example);

    int deleteByPrimaryKey(Integer memId);

    int insert(MemberDO record);

    int insertSelective(MemberDO record);

    List<MemberDO> selectByExample(MemberDOExample example);

    MemberDO selectByPrimaryKey(Integer memId);

    int updateByPrimaryKeySelective(MemberDO record);

    int updateByPrimaryKey(MemberDO record);
}