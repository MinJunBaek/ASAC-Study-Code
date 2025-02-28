package com.example.demo.controller;

import com.example.demo.service.User;
import com.example.demo.service.UserServiceInterface;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/users")
public class UserController {

  private UserServiceInterface userService;

  // @Autowired가 메서드(setter)에 선언됨
  // Spring이 이 메서드를 호출하면서 UserServiceInterface의 구현체를 주입
  // 필드가 private 상태로 유지되지만, 메서드를 통해 주입 가능하므로 테스트 시 Mock 객체를 쉽게 주입 가능
  // 단점:
  // setUserService() 메서드가 반드시 실행되어야 하기 때문에 생성자 주입보다 안정성이 떨어짐
  // 불변성 유지가 어려움 (Setter를 통해 언제든 변경될 수 있음)
  @Autowired
  public void setUserService(UserServiceInterface userService) {
    this.userService = userService;
  }
  // "수정자 주입(Setter Injection)"이란?
  // 필드에 직접 @Autowired를 선언하는 대신, Setter 메서드를 이용하여 Bean을 주입하는 방법
  // Setter를 통해 주입하므로, 객체가 변경 가능하며 테스트 시 Mock 객체를 쉽게 주입할 수 있음
  // 하지만 객체가 불변(immutable)하지 않으며, 생성자 주입보다 안정성이 떨어지는 단점이 있음
  // Spring이 @Autowired가 있는 Setter 메서드를 자동으로 호출하여 Bean을 주입
  // 현재 코드에서는 setUserService(UserServiceInterface userService)를 이용하여 UserServiceInterface의 구현체가 주입됨


  // ApplicationContext 주입
  // ApplicationContext는 Spring 컨테이너 자체를 의미
  // 이를 통해 현재 등록된 Bean을 직접 가져올 수 있음
  // 일반적으로 필드 주입은 피하는 게 좋지만, ApplicationContext는 특별한 경우에 사용됨
  @Autowired
  private ApplicationContext applicationContext;
  // 현재 등록된 UserServiceInterface Bean의 정보를 반환하는 API
  // applicationContext.getBean(UserServiceInterface.class) → 현재 등록된 UserServiceInterface의 구현체를 가져옴
  // toString()을 호출하여 문자열로 변환 후 반환
  // @ResponseBody가 붙어 있으므로 템플릿이 아닌, 순수한 문자열을 응답으로 반환

  @GetMapping("/bean")
  @ResponseBody
  public String bean() {
    return applicationContext.getBean(UserServiceInterface.class).toString();
  }

  @GetMapping(value = "")
  public String userPage(Model model) {
    List<User> users = userService.findAll();
    model.addAttribute("users", users);
    return "/users/list";
  }

  // Spring MCV에서는 Model, ModelMap, ModelAndView 모두 컨트롤러에서 뷰로 데이터를 전달하는 역할을 함.
  // 하지만 ModelMap은 Map 기능을 활용할때 사용되고, Model은 저 직관적이기 때문에 ModelMap 보다 자주 사용됨.
  @GetMapping(value = "/1/detail")
  public String detailPage(Model model) {
    User user = userService.findById(1);
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
    User user = userService.findById(1);
    return user;
  }
}
