# 안드로이드 학습 과정입니다. 
**액션바 만들기**

complete Actionbar
- menu_main.xml을 따로 만들고, item을 만들고, showAsAction속성을 추가 하였습니다.
- MainActivity.java에는 onCreateOptionMenu() 메서드와
- onOptionItemSelected() 메서드를 사용하였습니다.


![ezgif com-gif-maker](https://user-images.githubusercontent.com/74702665/103496756-ae2f9100-4e82-11eb-8600-9f7d8297cd91.gif)


</br></br></br>


**액션바 홈버튼 표시하기 및 검색창 만들기**

complete Actionbar 2
- getSupportActionBar() 메서드를 사용하였습니다.

- setLogo파리미터로 검은 안드로이드 아이콘을 넣었습니다.

- setDisplayOptions() 메서드의 파라미터로는 DISPLAY_USE_LOGO와 DISPLAY_SHOW_TITLE을 사용하였습니다.

- 검색창은 onCreateOptionMenu() 메서드에 EditText 객체를 참조하여 
- OnEditorActionListener()메서드로 토스트 메세지 "입력됨"을 전달하였습니다.


![ezgif com-gif-maker](https://user-images.githubusercontent.com/74702665/103501659-36696280-4e92-11eb-9b09-ff43719082e6.gif)

![ezgif com-gif-maker](https://user-images.githubusercontent.com/74702665/103502948-3703f800-4e96-11eb-9b2c-5173637cb0e8.gif)


</br></br></br>


**상단 탭 만들기**

Top tap

- CoodinatorLayout, AppBarLayout, Toolbar, TabLayout, FrameLayout을 이용하였습니다.
- AppBarLayout안에 툴바와 탭레이아웃을 설정하고, 같이 포함된 FrameLayout에는 프래그먼트를 이용해 색깔별로 다르게
- 3개의 액티비티를 만들어서 각각 인플레이션을 통해 탭을 누를 때마다 각각 다른 화면을 나오게 만들어 보았습니다.


![ezgif com-gif-maker](https://user-images.githubusercontent.com/74702665/103520407-75aba980-4eba-11eb-8253-6f74b02e8d47.gif)
