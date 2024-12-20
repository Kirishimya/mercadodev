package com.example.demo.layers.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.layers.repositories.CompraRepository;

@Service
public class CompraService {

    @Autowired
    private CompraRepository compraRepository;

    public List<Object[]> obterProdutosEDataCompra(String nomeCliente) {
        return compraRepository.findProdutosAndDataCompraByClienteNome(nomeCliente);
    }

    public List<Object[]> obterTodasAsCompras() {
        return compraRepository.findAllCompras();
    }
}
