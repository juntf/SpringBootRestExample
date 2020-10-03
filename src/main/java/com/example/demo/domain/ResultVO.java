package com.example.demo.domain;

import lombok.*;


//@Data는 setter, getter를 자동으로 만들어 준다.
//
//@NoArgsConstructor는 디폴트 생성자를 만들어준다.
//
//@AllArgsConstructor는 모든 파라메터를 가진 생성자를 만들어준다.
//
//뿐만 아니라 toString() 함수도 자동으로 구현해준다. 이것을 확인하는 방법은 Control-F12 를 눌러서 File Structure를 확인해보자.


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultVO {
    private int result;
    private String msg;
}
