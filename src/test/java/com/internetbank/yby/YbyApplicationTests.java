package com.internetbank.yby;

import com.internetbank.yby.dept.entitu.Dept;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class YbyApplicationTests {

    @Test
    void contextLoads() {
        Dept dept1=new Dept();
        Dept dept2=new Dept("开发",11,"上海");
        dept1.setDepute(21);
        dept1.setLoc("北京");
        dept1.setName("销售");
        System.out.println(dept1.getDepute());
        System.out.println(dept1.getName());
        System.out.println(dept1.getLoc());
        System.out.println(dept2.getLoc());

    }

}
