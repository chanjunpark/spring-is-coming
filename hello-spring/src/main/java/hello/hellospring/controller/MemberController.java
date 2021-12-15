package hello.hellospring.controller;


import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

//    private final MemberService memberService = new MemberService(); -> 문제: 다른 여러 컨트롤러에서 Member 서비스를 가져다쓰면 불필요하게 많이 생성되게 됨
    private final MemberService memberService;

    @Autowired // Spring Container에 있는 Member Service를 가져다가 매칭해줌. (Dependency Injection)
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
