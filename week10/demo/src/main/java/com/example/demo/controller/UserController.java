package com.example.demo.controller;

import com.example.demo.service.User;
import com.example.demo.service.UserServiceInterface;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/users")
public class UserController {

  // UserServiceInterface의 구현체를 찾아서 List 형태로 주입
  // 즉, Spring 컨테이너에 등록된 모든 UserServiceInterface의 구현체가 자동으로 리스트에 추가됨.
  @Autowired
  private List<UserServiceInterface> userService;

  @GetMapping(value = "")
  public ModelAndView userPage() {
    ModelAndView modelAndView = new ModelAndView();
    // userService 리스트에 있는 모든 UserServiceInterface 구현체의 이름을 콘솔에 출력
    // 즉, Spring이 주입한 여러 개의 UserService가 잘 들어왔는지 확인하는 용도
    userService.forEach((each) -> {
      System.out.println(each.getClass().getSimpleName());
    });
    UserServiceInterface AUserService = userService.get(0);
    List<User> users = AUserService.findAll();
    modelAndView.addObject("users", users);
    modelAndView.setViewName("/users/list");
    return modelAndView;
  }

  @GetMapping(value = "/1/detail")
  public ModelAndView detailPage() {
    ModelAndView modelAndView = new ModelAndView();
    userService.forEach((each) -> {
      System.out.println(each.getClass().getSimpleName());
    });
    UserServiceInterface AUserService = userService.get(0);
    User user = AUserService.findById(1);
    modelAndView.addObject("id", user.getId());
    modelAndView.addObject("name", user.getName());
    modelAndView.addObject("age", user.getAge());
    modelAndView.addObject("job", user.getJob());
    modelAndView.addObject("specialty", user.getSpecialty());
    modelAndView.setViewName("/users/detail");
    return modelAndView;
  }

}
