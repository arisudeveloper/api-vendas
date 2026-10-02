package com.exemplo.fornecedoresservice.config;

import com.exemplo.fornecedoresservice.repository.FornecedorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Popula o banco H2 em memoria com clientes de teste assim que a aplicacao sobe.
 */
@Component
public class DataInitializer implements CommandLineRunner {

    private final FornecedorRepository fornecedorRepository;

    public DataInitializer(FornecedorRepository fornecedorRepository) {
        this.fornecedorRepository = fornecedorRepository;
    }

    @Override
    public void run(String... args) {
        fornecedorRepository.save(new com.exemplo.fornecedoresservice.model.Fornecedor("Ana Souza", "ana.souza@exemplo.com"));
        fornecedorRepository.save(new com.exemplo.fornecedoresservice.model.Fornecedor("Bruno Lima", "bruno.lima@exemplo.com"));
        fornecedorRepository.save(new com.exemplo.fornecedoresservice.model.Fornecedor("Carla Mendes", "carla.mendes@exemplo.com"));
        fornecedorRepository.save(new com.exemplo.fornecedoresservice.model.Fornecedor("Diego Rocha", "diego.rocha@exemplo.com"));
        fornecedorRepository.save(new com.exemplo.fornecedoresservice.model.Fornecedor("Elisa Prado", "elisa.prado@exemplo.com"));
        fornecedorRepository.save(new com.exemplo.fornecedoresservice.model.Fornecedor("Felipe Nunes", "felipe.nunes@exemplo.com"));
        fornecedorRepository.save(new com.exemplo.fornecedoresservice.model.Fornecedor("Gabriela Reis", "gabriela.reis@exemplo.com"));
        fornecedorRepository.save(new com.exemplo.fornecedoresservice.model.Fornecedor("Henrique Alves", "henrique.alves@exemplo.com"));
        fornecedorRepository.save(new com.exemplo.fornecedoresservice.model.Fornecedor("Isabela Cruz", "isabela.cruz@exemplo.com"));
        fornecedorRepository.save(new com.exemplo.fornecedoresservice.model.Fornecedor("Joao Vieira", "joao.vieira@exemplo.com"));
    }
}
