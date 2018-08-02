//package com.cnegroup.power.entity;
//
//import lombok.Data;
//import org.codehaus.jackson.annotate.JsonProperty;
//
//import javax.validation.constraints.Min;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;
//import javax.xml.bind.annotation.XmlAccessType;
//import javax.xml.bind.annotation.XmlAccessorType;
//import javax.xml.bind.annotation.XmlElement;
//import javax.xml.bind.annotation.XmlRootElement;
//import java.io.Serializable;
//
///**
// * Created by zhaoyuehai 2018/7/20
// */
//@Data//自动添加了bean的set /get/toString/equals等方法
////@XmlRootElement
//@XmlAccessorType(XmlAccessType.FIELD)
//public class User implements Serializable {
//
//    @NotNull
//    @Min(1L)
//    private Long id;
//
//
//    @JsonProperty("username")
//    @XmlElement(name = "username")
//    @NotNull
//    @Size(min = 6, max = 50)
//    private String name;
//}
