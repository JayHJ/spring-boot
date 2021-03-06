package cn.jayhe.springbootdockercompose.controller;

import cn.jayhe.springbootdockercompose.entity.Visitor;
import cn.jayhe.springbootdockercompose.repository.VisitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class VisitorController {

    @Autowired
    private VisitorRepository visitorRepository;

    @RequestMapping("/")
    public String index(HttpServletRequest request) {
        String ip = request.getRemoteAddr();
        Visitor visitor = visitorRepository.findByIp(ip);

        if (visitor == null) {
            visitor = new Visitor();
            visitor.setIp(ip);
            visitor.setTimes(1);
        } else {
            visitor.setTimes(visitor.getTimes() + 1);
        }

        visitorRepository.save(visitor);

        return "I have been seen ip " + visitor.getIp() + " " + visitor.getTimes() + " times.";
    }
}
