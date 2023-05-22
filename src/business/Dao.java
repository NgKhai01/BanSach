/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package business;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Admin
 */
public interface Dao<T> {
    List<T> getAll();
    Optional<T> get(int id);
    Optional<T> get(String id);
    int insert(T t);
    boolean update(T t);
    boolean delete(T t);
    
}
