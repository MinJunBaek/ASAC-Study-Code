package com.example.demo.controller;

import com.example.demo.service.User;
import com.example.demo.service.UserServiceInterface;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
  public String userPage(ModelMap model) {
    List<User> users = AUserService.findAll();
    model.addAttribute("users", users);
    return "/users/list";
  }

  // ModelMap은 Spring MVC에서 컨트롤러에서 뷰로 데이터를 전달하는 객체
  // ModelMap은 Map<String, object>를 확장한 형태로 더 유연하게 사용할수 있음
  @GetMapping(value = "/1/detail")
  public String detailPage(ModelMap model) {
    User user = AUserService.findById(1);
    model.addAttribute("id", user.getId());
    model.addAttribute("name", user.getName());
    model.addAttribute("age", user.getAge());
    model.addAttribute("job", user.getJob());
    model.addAttribute("specialty", user.getSpecialty());
    return "/users/detail";
  }

}
