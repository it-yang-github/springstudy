package cn.qw.microservicecloud.service;

import cn.qw.springcloud.enty.Dept;

import java.util.List;

public interface DeptService {
  boolean add(Dept dept);
  Dept get(Integer id);
  List<Dept> list();
}
