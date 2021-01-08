package com.offcn.pojo;

import lombok.*;

import java.io.Serializable;

//@Setter
//@Getter
//@ToString
//@AllArgsConstructor
//@NoArgsConstructor
@Data // setget
public class TbGoods implements Serializable {

    private Long id;
    private String name;

}
