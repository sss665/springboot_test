package com.example.springboot_test.serviceimpl;

import com.example.springboot_test.bean.StainfoBean;
import com.example.springboot_test.mapper.StaMapper;
import com.example.springboot_test.service.StaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StaServiceimpl implements StaService{
    @Autowired(required=false)
    StaMapper StaMapper;

    @Override
    public List<StainfoBean> queryAllStainfo() {
        return StaMapper.getAllStainfo();
    }

}
