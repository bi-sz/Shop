package com.shop.dto;

import com.shop.constant.ItemSellStatus;
import lombok.Data;
import java.time.LocalDateTime;

@Data
public class ItemDto {
    private Long id;    //상품 코드
    private String itemNm;  //상품명
    private int price;  //가격
    private String itemDetail;  //상품 상세 설명
    private String sellStatCd;
    private LocalDateTime regTime;  //등록 시간
    private LocalDateTime updateTime;   //수정 시간
}
