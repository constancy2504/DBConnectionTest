package com.always.postgretest.test.Service;

import com.always.postgretest.test.DTO.TestDTO;
import com.always.postgretest.test.Mapper.TestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {

    @Autowired
    private final TestMapper testMapper;

//    @Override
//    public List<TestDTO> selectUserList() {
//
//        return testMapper.selectUserList();
//    }

//    @Override
//    public TestDTO selectUserById(Integer mbrSeq) {
//        return testMapper.selectUserById(mbrSeq);
//    }
}
