package com.example.demo;

import com.example.demo.domain.ResultVO;

import org.junit.Test;

public class LombokTest {

    @Test
    public void ResultTest() {
        ResultVO result = new ResultVO();


        result.setResult(0);
        result.setMsg("hong");
        System.out.println(result);
    }
}

