package com.taotao.mapper;

import com.taotao.pojo.Account;
import com.taotao.pojo.AccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountMapper {
    long countByExample(AccountExample example);

    int deleteByExample(AccountExample example);

    int insert(Account record);

    int insertSelective(Account record);

    List<Account> selectByExampleWithBLOBs(AccountExample example);

    List<Account> selectByExample(AccountExample example);

    int updateByExampleSelective(@Param("record") Account record, @Param("example") AccountExample example);

    int updateByExampleWithBLOBs(@Param("record") Account record, @Param("example") AccountExample example);

    int updateByExample(@Param("record") Account record, @Param("example") AccountExample example);
}