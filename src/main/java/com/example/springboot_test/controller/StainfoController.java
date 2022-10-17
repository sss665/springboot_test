package com.example.springboot_test.controller;
import com.alibaba.fastjson.JSONArray;
import com.example.springboot_test.bean.StainfoBean;
import com.example.springboot_test.service.StaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class StainfoController {
    @Autowired
    StaService staService;

    @RequestMapping("/login")
    public String show(){
        System.out.println("success");
        return "test";
    }

    @ResponseBody
    @RequestMapping(value="/Stainfo",method = RequestMethod.POST)
    public void showUsers(HttpServletResponse response) throws IOException {

        List<StainfoBean> staLists = staService.queryAllStainfo();

        JSONArray jsonObject= (JSONArray) JSONArray.toJSON(staLists);
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(jsonObject.toJSONString());

    }

}
/*hhh*/
