package cn.bdqn.demo99.controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author furuilong
 * @since 2020-05-17
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/list")
    public String list(Model Model, HttpServletRequest request, HttpSession session){

        //IPage<User> iPage=new Page<>(2,2);
        // IPage<User>  userPage = iUserService.page(iPage, null);

       // List<User> list = iUserService.list();
        // List<User> userList = userPage.getRecords();

        // User user = iUserService.getOne(queryWrapper);

        Object userCode = session.getAttribute("userCode");
        Model.addAttribute("userCode", userCode);
        //Model.addAttribute("userList", list);
        return "login";
    }

}
