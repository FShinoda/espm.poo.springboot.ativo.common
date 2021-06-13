package br.espm.springboot.ativo.common.controller;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import br.espm.springboot.ativo.common.datatype.Ativo;
import br.espm.springboot.ativo.common.datatype.Empresa;

@FeignClient("ativo-service")
public interface AtivoController {

    // Devolve a lista de empresas
    @GetMapping("/empresas")
    List<Empresa> listEmpresas();

    // Devolve empresa especifica
    @GetMapping("/empresa/{simbolo}")
    Empresa listEmpresas(@PathVariable String simbolo);

    // Retorna uma cotacao especifica
    @GetMapping("/ativo/{id}")
    Ativo getAtivo(@PathVariable String id);

    // Retorna uma cotacao por simbolo e data
    @GetMapping("/ativo/{simbolo}/{data}")
    Ativo ativo(@PathVariable String simbolo, @PathVariable String data);
    
    // Retorna a lista de cotacoes 
    @GetMapping("/ativo")
    List<Ativo> listAtivos(
        @RequestParam String empresa, 
        @RequestParam String ini, 
        @RequestParam String fim
    );
    
}
