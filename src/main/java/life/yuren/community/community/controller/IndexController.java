package life.yuren.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
/**
 * @author:ZZ1299
 * @date:2019/11/1
 * @description:
 */
    @GetMapping("/")
    public String index(){
        return "index";
    }

}
