# 📚 Spring Boot 개인 스터디 프로젝트

골든래빗 **스프링 부트 3 백엔드 개발자 되기** 도서를 기반으로,
단순히 코드를 따라치는 것을 넘어 Spring Boot의 핵심 원리를 이해하는 데 집중한 개인 프로젝트입니다.

## 🎯 학습 목표

- Spring의 핵심 원칙인 **IoC(제어의 역전)** 와 **DI(의존성 주입)** 개념 이해
- **Domain / Repository / Service / Controller** 계층형 아키텍처 직접 구현
- RESTful API 설계 및 JPA 기반 데이터 처리 경험

## 🔄 구현 내용

- 블로그 게시글 **CRUD API** 구현 (Create / Read / Update / Delete)
- Spring Data JPA 기반 Repository 구현
- DTO 패턴 적용 (요청/응답 분리)
- MockMvc 기반 **단위 테스트** 작성 (5개 시나리오)
- Thymeleaf 템플릿 엔진을 활용한 화면 구성

## 💡 핵심 배움

처음 Spring 코드를 보면서 "객체를 선언만 하고 생성 코드가 없는데 왜 동작하지?"
라는 의문을 가졌고, 이를 파고든 결과 IoC와 DI 개념을 이해하게 됐습니다.
계층형 구조 덕분에 코드를 한 줄씩 읽지 않아도 어느 계층 어느 파일에
무엇이 있을지 예측할 수 있게 되었고, 이후 산학연계 프로젝트에서
Spring 코드를 읽고 작성하는 데 직접적인 도움이 됐습니다.

## 🛠️ 기술 스택

- Java 17
- Spring Boot 3.2
- Spring Data JPA
- H2 Database
- Thymeleaf
- Gradle

## 🗂️ 프로젝트 구조
```
src
└── main
└── java
└── me.cheonil.springbootdeveloper
├── controller   # API 엔드포인트
├── service      # 비즈니스 로직
├── repository   # DB 접근
├── domain       # 엔티티
└── dto          # 요청/응답 객체
```
## 🔮 진행 예정

- [ ] Spring Security + JWT 기반 인증 구현
- [ ] OAuth2 소셜 로그인
- [ ] AWS 배포
