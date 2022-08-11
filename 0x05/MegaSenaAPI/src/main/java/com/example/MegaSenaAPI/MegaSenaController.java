package com.example.MegaSenaAPI;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping(value = "/megasena")
public class MegaSenaController {

    @GetMapping("/simpleMessageWelcome")
    public String mensagemBoasVindas() {
        // TODO
        return null;
    }


    @GetMapping("/getNumbers")
    public List<Integer> numerosMegaSena() {
        // TODO
        // Obs: Retornar os números gerados em ordem crescente.
        return null;
    }
}
