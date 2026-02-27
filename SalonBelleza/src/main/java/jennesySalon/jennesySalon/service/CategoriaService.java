/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package jennesySalon.jennesySalon.service;

import java.util.List;
import jennesySalon.jennesySalon.Domain.Categoria;

public interface CategoriaService {
    List<Categoria> listarCategorias();
    Categoria guardarCategoria(Categoria categoria);
    void eliminarCategoria(Integer id);
}


