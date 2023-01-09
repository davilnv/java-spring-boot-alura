package med.voll.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @GetMapping
    public String getMedico() {
        return "Médicos não cadastrados";
    }

    @PostMapping
    public void cadastrar(@RequestBody String json) {
        System.out.println(json);
    }

}
