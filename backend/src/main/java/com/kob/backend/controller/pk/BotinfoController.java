package com.kob.backend.controller.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/pk/")
public class BotinfoController {


    @RequestMapping("/getbotinfo1/")
    public List<Map<String, String>> getBotInfo1(){
        List<Map<String, String>> list = new LinkedList<>();
        Map<String, String> map1 = new HashMap<>();
        map1.put("name", "rabbit");
        map1.put("rating", "99999");
        Map<String, String> map2 = new HashMap<>();
        map2.put("name", "tigger");
        map2.put("rating", "100");
        list.add(map1);
        list.add(map2);
        return list;
    }
}
