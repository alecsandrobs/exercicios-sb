package br.com.alecsandro.exerciciossb.controller;

import br.com.alecsandro.exerciciossb.model.Cliente;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.util.Arrays.asList;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @GetMapping("/")
    public List<Cliente> get() {
        return asList(new Cliente(1, "Juão", "123.456.789-09"),
                new Cliente(2, "Maria", "987.654.321.00"),
                new Cliente(3, "João", "753.951.456-82"));
    }

    @GetMapping("/{id}")
    public Cliente getById1(@PathVariable int id) {
        return new Cliente(id, "Maria", "987.654.321.00");
    }

    @GetMapping()
    public Cliente getById2(@RequestParam(name = "id") int id) {
        return new Cliente(id, "João Augusto", "753.951.456-82");
    }
}
