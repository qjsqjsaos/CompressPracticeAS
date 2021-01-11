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

</br></br></br>


**하단 탭 만들기**

Bottom tap

- ConstantLayout, FrameLayout, BottomNavigationView을 이용하였습니다.
- 각 버튼을 누를 때마다 색이 다른 액티비티로 전환하여, 위에 Top tap보다 편하게 아래에다가 배치해 보았습니다.
- Top tap과 마찬가지로 Fragment를 이용하여 case문을 통해 전환을 시켰습니다.


![ezgif com-gif-maker](https://user-images.githubusercontent.com/74702665/104113389-a6696400-533c-11eb-9630-5ff647f69423.gif)


</br></br></br>


**뷰페이지 만들기**

ViewPager2

- ViewPager를 이제 사용하지 못하고, ViewPager2만 사용이 가능하다고 들어,
- 책에 내용을 그대로 이해하지 못하고, 구글링을 통해 어렴풋이 구현해봤지만,
- 약간에 미숙함이 담겨있습니다.


![ezgif com-gif-maker](https://user-images.githubusercontent.com/74702665/104124098-28d04300-5392-11eb-8bf2-efa291c38201.gif)


</br></br></br>


**고객 정보 입력 화면의 구성**

Do it Mission (DatePickerDialog & SimpleDateFormat used)

- DatePickerDialog로 달력을 만들고, 현재 시간을 표시하게 만들었으며,
- SimpleDateFormat으로 달력을 초기화하고 새로 입력이 가능하게 만들었습니다.
- 프래그먼트를 사용하여 만었습니다.

![ezgif com-gif-maker (1)](https://user-images.githubusercontent.com/74702665/104145036-e7c74580-5408-11eb-9591-c2b794f18a45.gif)
