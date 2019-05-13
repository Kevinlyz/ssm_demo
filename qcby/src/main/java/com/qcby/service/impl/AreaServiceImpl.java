package com.qcby.service.impl;

import com.qcby.dao.AreaDao;
import com.qcby.entity.Area;
import com.qcby.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("areaService")
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaDao areaDao;

    @Override
    public List<Area> queryList() {
        List<Area> list = areaDao.queryArea();
        System.out.println("Service层："+list.get(1));
        return list;
    }
}
