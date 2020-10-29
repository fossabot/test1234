<p align="center">
<img alt="GitHub contributors" src="https://user-images.githubusercontent.com/32615702/97505907-21b5ad80-19bd-11eb-9d03-4959b24b4375.png" width="50%">
</p>

<h3 align="center">WEB 분야</h3>
<p align="center">
<img src="https://github.com/osamhack2020/WEB_KookMoBan_PonJohmNaimann/workflows/Java%20CI%20with%20Gradle/badge.svg?branch=develop">
<img alt="GitHub closed issues" src="https://img.shields.io/github/issues-closed/osamhack2020/WEB_KookMoBan_PonJohmNaimann">
<img alt="GitHub closed pull requests" src="https://img.shields.io/github/issues-pr-closed/osamhack2020/WEB_KookMoBan_PonJohmNaimann">
<img alt="GitHub" src="https://img.shields.io/github/license/osamhack2020/WEB_KookMoBan_PonJohmNaimann">
</p>

<h3 align="center">IoT 분야</h3>
<p align="center">
<img alt="GitHub closed issues" src="https://img.shields.io/github/issues-closed/osamhack2020/IoT_KookMoBan_PonJohmNaimann">
<img alt="GitHub closed pull requests" src="https://img.shields.io/github/issues-pr-closed/osamhack2020/IoT_KookMoBan_PonJohmNaimann">
<img alt="GitHub" src="https://img.shields.io/github/license/osamhack2020/IoT_KookMoBan_PonJohmNaimann">
</p>

<h3 align="center">App 분야</h3>
<p align="center">
<img alt="GitHub closed issues" src="https://img.shields.io/github/issues-closed/osamhack2020/APP_KookMoBanUser_PonJohmNaimann">
<img alt="GitHub closed pull requests" src="https://img.shields.io/github/issues-pr-closed/osamhack2020/APP_KookMoBanUser_PonJohmNaimann">
<img alt="GitHub" src="https://img.shields.io/github/license/osamhack2020/APP_KookMoBanUser_PonJohmNaimann">
</p>

## 팀소개 및 프로젝트 설명 동영상
'폰 좀 내이만(Pon Johm Naimann)' 팀은 생활관 병사 스마트폰 비대면 반납 시스템 개발을 목표로 '국방모바일반납' 프로젝트를 진행하고 있습니다.

본 프로젝트는 IoT, APP, WEB 기술을 모두 결합함으로써, 간편하고 체계적인 반납 시스템을 구축하면서도 그 속에서 병사가 느끼는 부담을 최소화하는 것을 목적으로 개발을 진행하고 있습니다.

본 프로젝트는 오픈소스 프로젝트로 진행되며, 본 프로젝트에 관심이 있는 개발자, 사용자들을 위해 튜토리얼 GitBook을 제작하여 공개하고 있습니다.

<p align="center">
<a href="https://youtu.be/vE43qMqlVfU"  target="_blank">
<img src="http://img.youtube.com/vi/vE43qMqlVfU/0.jpg">
</a>
</p>

<p align="center">
<a href="https://kookmoban.gitbook.io/osam/">
<img src="https://img.shields.io/badge/GitBook-project_doc-blue?&style=for-the-badge&logo=github">
</a>
    
<a href="https://www.notion.so/OSAM-265735b9b76b4bccbff7ce2c4739acd9"  target="_blank">
<img src="https://img.shields.io/badge/NOTION-team_page-green?&style=for-the-badge&logo=notion">
</a>

<a href="https://osam.riyenas.dev/swagger-ui.html">
<img src="https://img.shields.io/badge/Swagger-API_Doc-yellow?&style=for-the-badge&logo=swagger">
</a>

<a href="https://osam.riyenas.dev">
<img src="https://img.shields.io/badge/WebSite-Live--Demo-blueviolet?&style=for-the-badge&logo=google">
</a>
</p>

## 기능 설계

### IoT 반납기
QR코드 인식, 무게 감지, 문 잠금, 서버와의 통신 등의 기능이 탑재되어 있습니다. 기기에서 반납 APP을 켜고 반납기에 넣으면 자동으로 QR코드를 감지하고 반납 기록을 서버에 전송합니다.

<table>
<tr>
<td><img src="https://user-images.githubusercontent.com/32615702/97555214-2e68ee80-1a1b-11eb-8f17-f92282fab0c6.png"></td>
<td><img src="https://user-images.githubusercontent.com/32615702/97554899-c914fd80-1a1a-11eb-9a2b-e5334d59531e.GIF"></td>
<td><img src="https://user-images.githubusercontent.com/32615702/97554903-ca462a80-1a1a-11eb-888d-04530340a13f.GIF"></td>
</tr>
</table>

### APP
초기 등록시에 서버와 통신하여 기기를 등록한 뒤, 이후에는 Time-based OTP기술을 활용해 기기 고유의 QR코드를 출력합니다. 이 앱은 어떠한 권한도 요구하지 않습니다.


<table>
<tr>
<td><img src="https://user-images.githubusercontent.com/32615702/97541954-52bbcf80-1a09-11eb-876a-c20fcffd9d6d.jpg"></td>
<td><img src="https://user-images.githubusercontent.com/32615702/97541958-53ecfc80-1a09-11eb-8928-f6b93888bbfe.jpg"></td>￼ 
<td><img src="https://user-images.githubusercontent.com/32615702/97541959-53ecfc80-1a09-11eb-8e0f-664dbc2870a0.jpg"></td>
</tr>
</table>

### WEB(Back-End API Server)
기기 관리자 현황, 등록 기기 현황, 기기 반납 현황을 관리하는 서버입니다. 각종 API를 지원하며, 주로 POST와 GET을 통해 요청을 받습니다.

[Swagger UI](https://osam.riyenas.dev/swagger-ui.html)

### WEB(Front-End)
Argon Dashboard를 관리자용 페이지를 제작하였으며, 간편하게 반납 정보 조회 및 관리를 할 수 있도록 제작되었습니다.

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4a09a709-583a-49a6-aef7-759a0b459deb/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4a09a709-583a-49a6-aef7-759a0b459deb/Untitled.png)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/5b600665-b2e6-40ef-a9ae-dc04e74e0855/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/5b600665-b2e6-40ef-a9ae-dc04e74e0855/Untitled.png)

## 컴퓨터 구성 / 필수 조건 안내 (Prerequisites)

- IoT 반납기: 라즈베리파이 3B,B+, 4B 사용, 아두이노 나노 V3
- App: 안드로이드 00이상
- WEB:

## 기술 스택 (Technique Used)

- IoT 사용 라이브러리
    - pyzbar (MIT)
    - pillow (HPND)
    - opencv-python (MIT)
    - picamera (BSD)
    - serial (MIT)
    - numpy (BSD)
    - pybase64 (BSD)
- APP
    - 
- WEB
    - 

## 설치 안내 (Installation Process)

자세한 빌드 방법은 아래 튜토리얼 페이지를 참고하십시오.

[시스템 구성](https://kookmoban.gitbook.io/osam/how-to-build/undefined-5)

## 프로젝트 사용법 (Getting Started)

자세한 사용 방법은 아래 튜토리얼 페이지를 참고하십시오.

[관리자 설정](https://kookmoban.gitbook.io/osam/how-to-use/undefined-4)

## 팀 정보 (Team Information)

- park chan jeong ([ckswjd99@gmail.com](mailto:ckswjd99@gmail.com)), Github Id: ckswjd99
- kang dong min ([riyenas0925@gmail.com](mailto:riyenas0925@gmail.com)), Github Id: riyenas0925
- lee jin whuy ([jinwhuy.lee@gmail.com](mailto:jinwhuy.lee@gmail.com)), Github Id: jinwhuy

## 저작권 및 사용권 정보 (Copyleft / End User License)
