/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jennesySalon.jennesySalon.Domain;


import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreCliente;
    private LocalDate fecha;

    @ManyToOne
    @JoinColumn(name = "servicio_id")
    private servicio servicio;

  
}


