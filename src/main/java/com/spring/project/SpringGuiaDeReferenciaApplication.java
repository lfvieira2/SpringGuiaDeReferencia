package com.spring.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.spring.project.services.EmpresaService;

@SpringBootApplication
public class SpringGuiaDeReferenciaApplication {

	/*
	 * Busca um valor definido no properties do spring
	 * 
	 * @Value("${paginacao.qtd_por_pagina}") 
	 * private int qtdPorPagina;
	
	@Autowired
	private EmpresaRepository empresaRepository;
	*/
	
	@Autowired
	private EmpresaService empresaService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringGuiaDeReferenciaApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			//Trabalhando com service
			
			empresaService.testarServico();
			
			//Trabalhando com BCrypt
			/*
			String senhaEnconded = SenhaUtils.gerarBCrypt("123456");
			System.out.println("Senha enconded: " + senhaEnconded);
			
			senhaEnconded = SenhaUtils.gerarBCrypt("123456");
			System.out.println("Senha enconded novamente: " + senhaEnconded);
			
			System.out.println("Senha válida: " + SenhaUtils.senhaValida("123456", senhaEnconded));
			
			// trabalhando com JPA Repository no h2
			
			
			Empresa empresa = new Empresa();
			 
			empresa.setCnpj("9856565");
			empresa.setRazaoSocial("Teste");
			
			this.empresaRepository.save(empresa);
			
			List<Empresa> empresas = empresaRepository.findAll();
			empresas.forEach(System.out::println);
			
			this.empresaRepository.deleteById(1L);
			empresas = empresaRepository.findAll();
			System.out.println("Empresas: " + empresas.size());
			*/
		};
	}

}
