package com.always.postgretest.service;


import com.always.postgretest.dto.TestDTO;

import java.util.List;

public interface TestService {
    public List<TestDTO> selectUserList();
    public TestDTO selectUserById(Integer mbrSeq);
}
