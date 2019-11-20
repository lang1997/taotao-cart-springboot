package com.lang.thymeleaf;

import com.lang.thymeleaf.entity.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@SpringBootApplication
public class ThymeleafApplication {

    @RequestMapping("/index")
    public String index(Model model){

        Person single = new Person("aa",11L);
        List<Person> list = new ArrayList<Person>();
        list.add(new Person("xx",11L));
        list.add(new Person("yy",22L));
        list.add(new Person("zz",33L));
        model.addAttribute("singlePerson",single);
        model.addAttribute("person",list);
        return "index";
    }
    public static void main(String[] args) {
        SpringApplication.run(ThymeleafApplication.class, args);
    }

}
