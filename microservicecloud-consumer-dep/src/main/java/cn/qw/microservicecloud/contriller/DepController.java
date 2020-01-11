package cn.qw.microservicecloud.contriller;

import cn.qw.microservicecloud.comm.Result;
import cn.qw.springcloud.enty.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController("/consumer")
public class DepController {
    private static final String REST_URL_PREFIX = "http://localhost:8001";
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/dept/add")
    public Result add(Dept dept) {
        Result o = restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Result.class);

        return o;
    }

    @RequestMapping("/dept/get/{id}")
    public Result get(@PathVariable("id") Integer id) {
        Result o = restTemplate.getForObject(REST_URL_PREFIX + "/dept/add" + id, Result.class);
        return o;
    }

    @RequestMapping("/dept/get")
    public Result get() {
        // 430 528 1988 0312 6150
        //188 185 27 250
        Result o = restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", Result.class);
        return o;
    }


}
