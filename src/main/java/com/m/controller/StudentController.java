package com.m.controller;

//import com.m.entity.Student;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController()
//@RequestMapping("/stu")
//public class StudentController {
//
//    @Autowired
//    private RedisTemplate redisTemplate;
//    @PostMapping("/set")
//    public void set(@RequestBody Student student){
//        redisTemplate.opsForValue().set("stu",student);
//    }
//
//    @GetMapping("/get/{key}")
//    public Student get(@PathVariable("key") String key){
//        Student student = (Student) redisTemplate.opsForValue().get(key);
//        return student;
//    }
//}
