package com.example.firstproject.controller;
import com.example.firstproject.dto.MemberForm;
import com.example.firstproject.entity.Member;
import com.example.firstproject.repository.MemberRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Slf4j
@Controller
public class MemberController {
    @Autowired
    MemberRepository memberRepository;

    @GetMapping("/members/signup")
    public String newMember(){
        return "/members/signup";
    }

    @PostMapping("/join")
    public String join(MemberForm form){
        log.info(form.toString());
        // System.out.println(form.toString());

        //1. DTO를 엔티티로 변환
        Member member = form.toEntity();
        log.info(form.toString());
        //System.out.println(article.toString());

        //2. 리파지터리로 엔티티를 DB에 저장
        Member saved = memberRepository.save(member);
        log.info(saved.toString());
        //System.out.println(saved.toString());
        return "redirect:/members/" + saved.getId();
    }

    @GetMapping("/members/{id}")
    public String show(@PathVariable Long id, Model model){
        Member member = memberRepository.findById(id).orElse(null);
        model.addAttribute("member", member);
        return "/members/show";
    }

    @GetMapping("/members")
    public String index(Model model){
        ArrayList<Member> member = memberRepository.findAll();
        model.addAttribute("members", member);
        return "members/index";
    }
    @GetMapping("/members/{id}/edit")
    public String edit(@PathVariable Long id, Model model){
        Member member = memberRepository.findById(id).orElse(null);
        model.addAttribute("member", member);
        return "/members/edit";
    }
    @PostMapping("/members/update")
    public String update(MemberForm form){
        log.info(form.toString());
        Member memberEntity = form.toEntity();
        Member target = memberRepository.findById(memberEntity.getId()).orElse(null);
        if (target != null) {
            memberRepository.save(memberEntity);
        }
        return "redirect:/members/" + target.getId();
    }
}
