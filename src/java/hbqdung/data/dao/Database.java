/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hbqdung.data.dao;

import hbqdung.data.impl.CategoryImpl;
import hbqdung.data.impl.ProductImpl;


/**
 *
 * @author Admin
 */
public class Database {
    public static CategoryDao getCategoryDao(){
    return new CategoryImpl();
    }
      public static ProductDao getProductDao(){
    return new ProductImpl();
    }
    
}
