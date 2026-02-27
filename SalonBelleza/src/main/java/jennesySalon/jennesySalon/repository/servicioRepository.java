/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package jennesySalon.jennesySalon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import jennesySalon.jennesySalon.Domain.servicio;

public interface servicioRepository extends JpaRepository<servicio, Integer> {
    
}