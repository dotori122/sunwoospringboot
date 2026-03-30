package com.example.firstproject.controller;


import org.springframework.stereotype.Controller; // URL 연결 요청 (@GetMapping())과 동시에 자동으로 임포트
import org.springframework.ui.Model; // Model 클래스 패키지 자동 임포트
import org.springframework.web.bind.annotation.GetMapping;
@Controller //컨트롤러 선언

public class FirstController {

    @GetMapping("/hi") // URL 요청 접수

    public String niceToMeetYou(Model model) { //메서드 작성 // model 객체 받아 오기
        // model 객체가 "홍팍" 값을 "username"에 연결해 웹 브라우저로 보냄
        model.addAttribute("username", "hongpark"); // 모델 변수 등록
        // model.addAttribute : 변숫값을 "변수명"이라는 이름으로 추가 // "홍팍" → "hongpark" 수정
        return "greetings"; // greetings.mustache 파일 반환 (뷰 템플릿 페이지 반환)
    }
    @GetMapping("/bye") // URL 요청 접수

    public String seeYouNext(Model model) { //메서드 작성 // model 객체 받아 오기
            model. addAttribute("nickname", "홍길동"); // 모델 변수 등록하기
            return "goodbye"; // goodbye.mustache 파일 반환

        }


}
