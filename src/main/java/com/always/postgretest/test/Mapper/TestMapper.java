package com.always.postgretest.test.Mapper;

import com.always.postgretest.test.DTO.TestDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TestMapper {

    List<TestDTO> selectUserList();
    TestDTO selectUserById(Integer userId);


}