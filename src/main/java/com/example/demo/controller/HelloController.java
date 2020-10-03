package com.example.demo.controller;

import com.example.demo.domain.ResultVO;
import org.springframework.web.bind.annotation.*;


// @RestController annotation은 안드로이드 등 모바일의 사용성이 높아지면서
// 4.x에 처음으로 도입된 기능으로 웹페이지를 리턴해주는게 아니라 json, xml 등의
// Resource를 리턴해줄수 있도록 해주는 기능이다.
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello test";
    }

    // http://localhost:8080/helloQueryParam?name=query-param-test
    @GetMapping("/helloQueryParam")
    public String helloQueryParam(@RequestParam("name") String name) {
        return "Hello " + name;
    }

    // http://localhost:8080/helloURIParam/url-param-test
    @GetMapping("/helloURIParam/{name}")
    public String helloURLParam(@PathVariable String name) {
        return "Hello " + name;
    }

    // http://localhost:8080/helloJSONAPI?name=test
    @GetMapping("/helloJSONAPI")
    // @PostMapping("/helloJSONAPI")
    public ResultVO helloJsonResult(@RequestParam("name") String name) {
        ResultVO result = new ResultVO();
        result.setResult(0);
        result.setMsg(name);
        return result;
    }

    @PostMapping("/helloRecvJSONBody")
    public ResultVO helloRecvJson(@RequestBody ResultVO result) {
        return result;
    }

}