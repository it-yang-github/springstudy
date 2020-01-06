package cn.qw.microservicecloud.controller;

import cn.qw.microservicecloud.comm.Result;
import cn.qw.microservicecloud.service.DeptService;
import cn.qw.springcloud.enty.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    @PostMapping("/dept/add")
    public Result add(@RequestBody Dept dept) {
        boolean add = deptService.add(dept);
        Result result = null;
        if (add) {
            result = new Result("添加成功", null);
        } else {
            result = new Result("添加失败", null);
        }
        return result;
    }
    @GetMapping("/dept/{id}")
    public Result get(Integer id){
        Dept dept = deptService.get(id);
        Result result = new Result("查询成功", dept);
        return result;
    }
    @GetMapping("/dept/list")
    public Result get(){
        List<Dept> list = deptService.list();
        Result result = new Result("查询成功", list);
        return result;
    }
//    Dept get(Integer id);
//    List<Dept> list();

}
