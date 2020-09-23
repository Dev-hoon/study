package com.example.study.controller;

import com.example.study.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")// localhost:8080/api
public class GetController {
    @RequestMapping(method = RequestMethod.GET, path = "/getMethod") //localhost:8080/api/getMethod
    public String getRequest(){
        return "Hi getMethod!!";
    }
    @GetMapping("/getParameter") //localhost:8080/api/getParameter?id=1234&password=abcd
    public String getParameter(@RequestParam String id, @RequestParam(name = password) String pwd){
        String password = "aaaa";
        System.out.println("id :" +id);
        System.out.println("password :" +pwd);
        return id+pwd;
    }
    //localhost:8080/api/multiParameter?account=abcd&email=study@gmail.com&page=10
    @GetMapping("/multiParameter")
    public SearchParam getMultiParameter(SearchParam searchParam){
        // 여러가지 파리미터를 json 형식으로 자동 변환 시켜줌
        System.out.println(searchParam.getAccount());
        System.out.println(searchParam.getEmail());
        System.out.println(searchParam.getPage());
        return searchParam;
    }
}
