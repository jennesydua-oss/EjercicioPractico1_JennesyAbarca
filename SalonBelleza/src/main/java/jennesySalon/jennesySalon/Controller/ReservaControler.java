/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jennesySalon.jennesySalon.Controller;

import jennesySalon.jennesySalon.Domain.reserva;
import jennesySalon.jennesySalon.service.ReservaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/reservas")
public class ReservaControler {

    private final ReservaService reservaService;

    public ReservaControler(ReservaService reservaService) {
        this.reservaService = reservaService;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("reservas", reservaService.listarReservas());
        return "reservas/lista"; // nombre de la plantilla Thymeleaf
    }

    @PostMapping
    public String guardar(@ModelAttribute reserva reserva) {
        reservaService.guardarReserva(reserva);
        return "redirect:/reservas";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Integer id) {
        reservaService.eliminarReserva(id);
        return "redirect:/reservas";
    }
}

