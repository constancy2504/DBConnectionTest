package com.always.postgretest.test.Controller;


import com.always.postgretest.test.DTO.TestDTO;
import com.always.postgretest.test.Service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class TestController {

    private final TestService testService;

    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }


//    @GetMapping("/list")
//    public List<TestDTO> selectUserList(){
//        System.out.println("안녕");
//        List<TestDTO> result = testService.selectUserList();
//        return result;
//    }

//    @GetMapping("/{mbrSeq}")
//    public TestDTO selectUserById(@PathVariable("mbrSeq") int mbrSeq){
//        TestDTO result = testService.selectUserById(mbrSeq);
//
//        return result;
//    }
}
