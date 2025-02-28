package com.example.demo.controller;

import com.example.demo.service.User;
import com.example.demo.service.UserServiceInterface;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/users")
public class UserController {

  // UserServiceInterface의 구현체를 찾아서 List 형태로 주입
  // 즉, Spring 컨테이너에 등록된 모든 UserServiceInterface의 구현체가 자동으로 리스트에 추가됨.
  @Autowired
  // @Qualifier("BUserService") - 자동으로 AUserService를 주입하고 있음. 만약 지정하고싶다면 @Qualifier 사용
  private UserServiceInterface AUserService;

  @GetMapping(value = "")
  public String userPage(Model model) {
    List<User> users = AUserService.findAll();
    model.addAttribute("users", users);
    return "/users/list";
  }

  // Spring MCV에서는 Model, ModelMap, ModelAndView 모두 컨트롤러에서 뷰로 데이터를 전달하는 역할을 함.
  // 하지만 ModelMap은 Map 기능을 활용할때 사용되고, Model은 저 직관적이기 때문에 ModelMap 보다 자주 사용됨.
  @GetMapping(value = "/1/detail")
  public String detailPage(Model model) {
    User user = AUserService.findById(1);
    model.addAttribute("id", user.getId());
    model.addAttribute("name", user.getName());
    model.addAttribute("age", user.getAge());
    model.addAttribute("job", user.getJob());
    model.addAttribute("specialty", user.getSpecialty());
    return "/users/detail";
  }

  @GetMapping("/1/data")
  @ResponseBody
  public User detailData() {
    User user = AUserService.findById(1);
    return user;
  }
}
