package com.example.demo.controller;

        import org.slf4j.Logger;
        import org.slf4j.LoggerFactory;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestMethod;
        import org.springframework.web.bind.annotation.ResponseBody;
        import org.springframework.web.bind.annotation.RestController;
//        import org.springframework.web.bind.annotation.RequestMapping;
//        import org.springframework.web.bind.annotation.RequestMethod;
//        import org.springframework.web.bind.annotation.ResponseBody;
//        import org.springframework.web.bind.annotation.RestController;

        import java.util.List;

@RestController
@RequestMapping("spider")
public class SpiderUserInfoController {

    private final static Logger logger = LoggerFactory.getLogger(SpiderUserInfoController.class);

    @RequestMapping(value = "/findById", method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    public List<String> getSpiderUrl(){

        System.out.println("test");

        return null;
    }
}