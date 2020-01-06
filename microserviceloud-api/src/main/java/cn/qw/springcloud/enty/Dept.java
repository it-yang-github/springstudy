package cn.qw.springcloud.enty;

import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data

@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)//链式 set 返回值 为本类对象
@Table(name = "dept")
public class Dept implements Serializable {
    @Id
    private Integer deptno;
    private String dname;
    //数据来自哪个数据库
    private String db_source;
}
