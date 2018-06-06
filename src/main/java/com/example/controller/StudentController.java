package com.example.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName:StudentController
 * Date:     2017年11月6日 下午4:27:40
 * @author   Joe
 * @version
 * @since    JDK 1.8
 */
@Controller
public class StudentController {
    /**
     * freemarker:(跳转到 freemarker.ftl).
     * @author Joe
     * Date:2017年11月6日下午4:52:19
     *
     * @param map
     * @return
     */
    @RequestMapping("/freemarker")
    public String freemarker(Map<String, Object> map){
        map.put("name", "Joe");
        map.put("sex", 1);    //sex:性别，1：男；0：女；

        // 模拟数据
        List<Map<String, Object>> friends = new ArrayList<Map<String, Object>>();
        Map<String, Object> friend = new HashMap<String, Object>();
        friend.put("name", "xbq");
        friend.put("age", 22);
        friends.add(friend);
        friend = new HashMap<String, Object>();
        friend.put("name", "July");
        friend.put("age", 18);
        friends.add(friend);
        map.put("friends", friends);
        return "freemarker";
    }
}
