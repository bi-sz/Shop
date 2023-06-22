package com.shop.repository;

import com.shop.dto.ItemDto;

import java.util.HashMap;

public interface ItemRepositoryForm {
    void createItem(ItemDto item);
    ItemDto getItem(Long id);
    HashMap<Long,ItemDto> getItemAll();
    Long updateItem(ItemDto item);
    void deleteItem(Long id);
}
