package cn.qw.microservicecloud.service.impl;

import cn.qw.microservicecloud.dao.DepyDao;
import cn.qw.microservicecloud.service.DeptService;
import cn.qw.springcloud.enty.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DepyDao depyDao;

    @Override
    public boolean add(Dept dept) {
        int insert = depyDao.insert(dept);
        return insert > 0;
    }

    @Override
    public Dept get(Integer id) {

        Dept dept = depyDao.selectByPrimaryKey(id);
        return dept;
    }

    @Override
    public List<Dept> list() {
        List<Dept> depts = depyDao.selectAll();
        return depts;
    }
}
