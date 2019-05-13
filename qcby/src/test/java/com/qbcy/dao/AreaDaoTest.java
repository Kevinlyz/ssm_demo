package com.qbcy.dao;

import com.qbcy.BaseTest;
import com.qcby.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class AreaDaoTest extends BaseTest {

    @Autowired
    private com.qcby.dao.AreaDao areaDao;

    @Test
    public void testQueryArea(){
        List<Area> areaList = areaDao.queryArea();
        System.out.println(areaList);
        Area area = new Area();
        area.setArea_name("zhongguo");
        area.setPriority(3);
        area.setCreate_time(new Date());
        area.setLast_edit_time(new Date());
        areaDao.addArea(area);
        assertEquals(4,areaList.size());
    }

}
