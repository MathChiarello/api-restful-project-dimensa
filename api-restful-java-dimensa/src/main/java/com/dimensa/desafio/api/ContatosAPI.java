package com.dimensa.desafio.api;

import com.dimensa.desafio.dto.Contatos;
import com.dimensa.desafio.facade.MetodosContato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/contatos", produces = MediaType.APPLICATION_JSON_VALUE)
public class ContatosAPI {
    @Autowired
    private MetodosContato metodosContato;

    @PostMapping
    @ResponseBody
    public Contatos criar(@RequestBody Contatos contatos) {
        return metodosContato.criar(contatos);
    }

    @PutMapping("/{contatoId}")
    @ResponseBody
    public Contatos atualizar(@PathVariable("contatoId") Long contatoId,
                              @RequestBody Contatos contatos) {
        return metodosContato.atualizar(contatos, contatoId);
    }

    @GetMapping
    @ResponseBody
    public List<Contatos> getAll() {
        return metodosContato.getAll();
    }

    @DeleteMapping("/{contatoId}")
    @ResponseBody
    public String deletar(@PathVariable("contatoId") Long contatoId) {
        return  metodosContato.delete(contatoId);
    }
}
