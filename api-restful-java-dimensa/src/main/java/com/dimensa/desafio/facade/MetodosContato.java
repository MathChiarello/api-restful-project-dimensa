package com.dimensa.desafio.facade;

import com.dimensa.desafio.dto.Contatos;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MetodosContato {
    private static final Map<Long, Contatos> contatos = new HashMap<>();

    public Contatos criar(Contatos contatos) {
        Long proximoId = MetodosContato.contatos.keySet().size() + 1L;
        contatos.setId(proximoId);
        MetodosContato.contatos.put(proximoId, contatos);
        return contatos;
    }

    public Contatos atualizar(Contatos contatos, Long contatoId) {
        MetodosContato.contatos.put(contatoId, contatos);
        return contatos;
    }

    public Contatos getById(Long contatoId) {
        return contatos.get(contatoId);
    }

    public List<Contatos> getAll() {
        return new ArrayList<>(contatos.values());
    }

    public String delete(Long contatoId) {
        contatos.remove(contatoId);
        return "DELETED";
    }
}
