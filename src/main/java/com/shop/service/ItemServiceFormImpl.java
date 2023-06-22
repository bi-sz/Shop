package com.shop.service;

import com.shop.dto.ItemDto;
import com.shop.repository.ItemRepositoryForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class ItemServiceFormImpl implements ItemServiceForm {
    @Autowired
    private ItemRepositoryForm itemRepo;
    @Override
    public void createITem(ItemDto item) {
        itemRepo.createItem(item);
    }

    @Override
    public ItemDto getItem(Long id) {
        return itemRepo.getItem(id);
    }

    @Override
    public HashMap<Long, ItemDto> getItemAll() {
        return itemRepo.getItemAll();
    }

    @Override
    public Long updateItem(ItemDto item) {
        return itemRepo.updateItem(item);
    }

    @Override
    public void deleteItem(Long id) {
        itemRepo.deleteItem(id);
    }
}
