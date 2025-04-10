package com.example.firstproject.controller;

// 컨트롤러 선언과 동시에 자동으로 임포트

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/hi")
    public String niceToMeetYou(Model model) {
        // model 객체가 "Velue"값을 "username"에 연결해 웹브라우저로 보냄
        model.addAttribute("username", "ArtR");
        return "greetings"; //greetings.mustache 파일 반환
    }
    @GetMapping("/bye")
    public String seeYouNext(Model model) {
        model.addAttribute("nickname", "ArtR");
        return "goodbye";
    }
}