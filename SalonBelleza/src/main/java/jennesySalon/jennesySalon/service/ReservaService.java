/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package jennesySalon.jennesySalon.service;

import java.util.List;
import jennesySalon.jennesySalon.Domain.reserva;

public interface ReservaService {
    List<reserva> listarReservas();
    reserva guardarReserva(reserva reserva);
    void eliminarReserva(Integer id);
}


