package com.shop.repository;

import com.shop.dto.ItemDto;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.HashMap;

@Repository
public class ItemRepositoryFormImpl implements ItemRepositoryForm {
    private Long id=0L;
    private HashMap<Long,ItemDto> itemMap;

    @PostConstruct
    public void init(){
        itemMap=new HashMap<Long,ItemDto>();
        for(int i=0;i<10;i++){
            id++;
            ItemDto item = new ItemDto();
            item.setId(id);
            item.setItemNm("더미상품"+i);
            item.setItemDetail("더미상품정보"+i);
            item.setRegTime(LocalDateTime.now());
            item.setPrice(1000*i);
            itemMap.put(id,item);
        }
    }

    @Override
    public void createItem(ItemDto item) {
        item.setId(++id);
        itemMap.put(id,item);
    }
    @Override
    public ItemDto getItem(Long id) {
        return itemMap.get(id);
    }
    @Override
    public HashMap<Long, ItemDto> getItemAll() {
        return itemMap;
    }
    @Override
    public Long updateItem(ItemDto item) {
        Long id=item.getId();
        itemMap.put(id,item);
        return id;
    }
    @Override
    public void deleteItem(Long id) {
        itemMap.remove(id);
    }
    public Long getCurrId(){
        return id;
    }
}