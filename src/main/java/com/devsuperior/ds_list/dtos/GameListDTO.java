package com.devsuperior.ds_list.dtos;

import com.devsuperior.ds_list.entity.GameList;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@NoArgsConstructor
@Getter
@Setter
public class GameListDTO {
    private Long id;
    private String name;

    public GameListDTO(GameList list){
        BeanUtils.copyProperties(list,this);
    }
}
