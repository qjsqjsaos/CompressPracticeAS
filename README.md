# 안드로이드 학습 과정입니다. 
**액션바 만들기**

Merge remote-tracking branch 'origin/master'
- menu_main.xml을 따로 만들고, item을 만들고, showAsAction속성을 추가 하였습니다.
- MainActivity.java에는 onCreateOptionMenu() 메서드와
- onOptionItemSelected() 메서드를 사용하였습니다.


![ezgif com-gif-maker](https://user-images.githubusercontent.com/74702665/103496756-ae2f9100-4e82-11eb-8600-9f7d8297cd91.gif)


**액션바 홈버튼 표시하기 및 검색창 만들기**

Merge remote-tracking branch 'origin/master'
- getSupportActionBar() 메서드를 사용하였습니다.

- setLogo파리미터로 검은 안드로이드 아이콘을 넣었습니다.

- setDisplayOptions() 메서드의 파라미터로는 DISPLAY_USE_LOGO와 DISPLAY_SHOW_TITLE을 사용하였습니다.

- 검색창은 onCreateOptionMenu() 메서드에 EditText 객체를 참조하여 
- OnEditorActionListener()메서드로 토스트 메세지 "입력됨"을 전달하였습니다.


![ezgif com-gif-maker](https://user-images.githubusercontent.com/74702665/103501659-36696280-4e92-11eb-9b09-ff43719082e6.gif)

![ezgif com-gif-maker](https://user-images.githubusercontent.com/74702665/103502948-3703f800-4e96-11eb-9b2c-5173637cb0e8.gif)
