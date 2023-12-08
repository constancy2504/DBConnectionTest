package com.always.postgretest.service;

import com.always.postgretest.mapper.TestMapper;
import com.always.postgretest.dto.TestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {


    private final TestMapper testMapper;

    @Override
    public List<TestDTO> selectUserList() {

        return testMapper.selectUserList();
    }

    @Override
    public TestDTO selectUserById(Integer mbrSeq) {
        return testMapper.selectUserById(mbrSeq);
    }
}
