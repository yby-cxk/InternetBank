package com.internetbank.yby;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.internetbank.yby.debit_card.entity.DebitCard;
import com.internetbank.yby.debit_card.mapper.DebitCardMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class MapperTest {
    @Autowired
    private DebitCardMapper debitCardMapper;

    @Test
    public void add(){
        String f=Float.toString(100);
        DebitCard card=new DebitCard("001","九江银行","009","12345","67890",f,1000,"未激活",0);
        debitCardMapper.insert(card);
    }

    @Test
    public void query(){
        DebitCard card=debitCardMapper.selectById("005");
        System.out.println(card);
    }
////    public void
    @Test
    public void queryAll(){
        List<DebitCard> cars=debitCardMapper.selectList(null);
        cars.forEach(System.err::println);
    }

    @Test
    public void order(){
        QueryWrapper<DebitCard> wrapper=new QueryWrapper<>();
        List<DebitCard> cards = debitCardMapper.selectList(wrapper.orderByAsc("uNo"));
        cards.forEach(System.err::println);
    }

    @Test
    public void deletBycardNumber(){
        debitCardMapper.deleteById("004");
    }
    @Test
    public void deletCondition(){
        Map<String,Object> map = new HashMap<>();
        map.put("state","开户");
        debitCardMapper.deleteByMap(map);
    }

    @Test
    public void deleteList(){
        List<String> ide= Arrays.asList("005","007");
        debitCardMapper.deleteBatchIds(ide);
    }

    //通过条件包装器（自定义条件）操作删除
    @Test
    public void deletByWrapper(){
        QueryWrapper<DebitCard> wrapper=new QueryWrapper<>();
        wrapper.eq("money","100.00");
        debitCardMapper.delete(wrapper);
    }


}
 