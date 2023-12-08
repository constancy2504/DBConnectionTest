package com.always.postgretest.mapper;

import com.always.postgretest.dto.TestDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TestMapper {

    List<TestDTO> selectUserList();
    TestDTO selectUserById(Integer mbrSeq);


}