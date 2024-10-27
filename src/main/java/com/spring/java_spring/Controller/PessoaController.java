package com.spring.java_spring.Controller;

//coe sabrina corrije com carinho tmj

import com.spring.java_spring.Model.Pessoa;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Controller
@RequestMapping("/pessoas")
public class PessoaController {

    private List<Pessoa> pessoas = new ArrayList<>();
    private AtomicLong idCounter = new AtomicLong();

    @GetMapping
    public String pessoa(Model model) {
        model.addAttribute("pessoas", pessoas);
        return "listar-pessoas";
    }
    @GetMapping("/novo")
    public String novopessoa(Model model) {
        model.addAttribute("pessoa", new Pessoa());
        return "form-pessoa";
    }

    @GetMapping("/editar/{id}")
    public String editarPessoa(@PathVariable Long id, Model model) {
        Pessoa pessoa = pessoas.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);

        if (pessoa == null) {
            model.addAttribute("errorMessage", "Pessoa não encontrada para o ID: " + id);
            return "error-page";
        }

        model.addAttribute("pessoa", pessoa);
        return "form-pessoa";
    }


    @PostMapping("/salvar")
    public String salvarpessoa(@ModelAttribute Pessoa pessoa) {
        if (pessoa.getId() == null) {
            pessoa.setId(idCounter.getAndIncrement());
            pessoas.add(pessoa);
        }
        else {
            pessoas.replaceAll(p -> p.getId().equals(pessoa.getId()) ? pessoa : p);
        }
        return "redirect:/pessoas";
    }


    @GetMapping("deletar/{id}")
    public String deletarPessoa(@PathVariable Long id) {
        pessoas.removeIf(p -> p.getId().equals(id));
        return "redirect:/pessoas";
    }

}
