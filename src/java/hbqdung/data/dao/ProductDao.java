/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hbqdung.data.dao;

import hbqdung.data.model.Product;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface ProductDao {
    public List<Product> findAll();
    
}
