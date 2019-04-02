package com.newer.domain;

import java.io.Serializable;

public class Student implements Serializable {
     private Integer sid;

     private String sName;

     public Integer getSid() {
          return sid;
     }


     public void setSid(Integer sid) {
          this.sid = sid;
     }
}
