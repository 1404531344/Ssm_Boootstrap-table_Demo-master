package com.fz.controllers;

import com.fz.dao.PersonDao;
import com.fz.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PersonController {



final
PersonDao personDao;

    public PersonController(PersonDao personDao) {
        this.personDao = personDao;
    }

    //    查询person所有
    @ResponseBody
    @RequestMapping("findPersonAll")
    public List<Person> findPersonAll(){
     return personDao.findPersonAll();
    }






}
