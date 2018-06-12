package com.yangs.springbootbegin.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class User {

    private int id;

    private String username;

    private String password;

}
