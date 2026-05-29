package web.mvc.cicd02_boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    public String index(){
        return "GitHub Actions를 이용한 CI/CD 테스트입니다 - application 설정도 secret key로 정의해서 사용하기!!";
    }
}
