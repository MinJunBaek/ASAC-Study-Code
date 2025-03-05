package com.example.demo.controller;

import com.example.demo.controller.dto.UserCreateRequestDto;
import com.example.demo.service.IRepository;
import com.example.demo.service.User;
import com.example.demo.service.UserService;
import jakarta.validation.Valid;
import java.util.List;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/users")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserController {

  UserService userService;

  @Autowired
  private ApplicationContext applicationContext;

  @GetMapping("/bean")
  @ResponseBody
  public String bean() {
    return applicationContext.getBean(IRepository.class).toString();
  }

  @GetMapping(value = "")
  public String userPage(Model model) {
    List<User> users = userService.findAll();
    model.addAttribute("users", users);
    return "/users/list";
  }

  @GetMapping(value = "/detail")
  public String detailPage(@RequestParam("id") Integer id, Model model) {
    User user = userService.findById(id);
    model.addAttribute("id", user.getId());
    model.addAttribute("name", user.getName());
    model.addAttribute("age", user.getAge());
    model.addAttribute("job", user.getJob());
    model.addAttribute("specialty", user.getSpecialty());
    return "/users/detail";
  }

  @GetMapping("/data")
  @ResponseBody
  public User detailData(@RequestParam("id") Integer id) {
    User user = userService.findById(id);
    return user;
  }

  @PostMapping("") // @RequestMapping(method = RequestMethod.POST)와 같다
  @ResponseBody
  public User Save(@RequestBody @Valid UserCreateRequestDto request) { // @RequestBody는 JSON형태의 데이터만 입력가능
    User user = userService.save(request.getName(), request.getAge(), request.getJob(), request.getSpecialty());
    return user;
  }
}