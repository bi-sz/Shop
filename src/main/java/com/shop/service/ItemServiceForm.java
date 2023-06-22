package com.shop.service;

import com.shop.dto.ItemDto;

import java.util.HashMap;

public interface ItemServiceForm {
    void createITem(ItemDto itemDto);
    ItemDto getItem(Long id);
    HashMap<Long,ItemDto> getItemAll();
    Long updateItem(ItemDto item);
    void deleteItem(Long id);

}
