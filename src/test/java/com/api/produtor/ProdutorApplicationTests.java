package com.api.produtor;

import com.api.produtor.models.LaboratorioModel;
import com.api.produtor.models.ProdutorModel;
import com.api.produtor.models.PropriedadeModel;
import com.api.produtor.repositories.ProdutorRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootTest
class ProdutorApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private ProdutorRepository produtorRepository;

	@Test
	public void insertProdutor() {
		ProdutorModel produtorModel = new ProdutorModel();
		produtorModel.setNome("Nome teste");
		produtorModel.setCnpj("22.222.221/0001-11");
		produtorModel.setDataInicial(LocalDateTime.parse("2022-02-02T17:41:44"));
		produtorModel.setDataFinal(LocalDateTime.parse("2022-02-02T17:41:44"));

		PropriedadeModel propriedadeModel = new PropriedadeModel();
		propriedadeModel.setId(1);
		propriedadeModel.setNome("fazenda sao joao 1");

		produtorModel.setInfosPropriedade(propriedadeModel);

		LaboratorioModel laboratorioModel = new LaboratorioModel();
		laboratorioModel.setId(1);
		propriedadeModel.setNome("laboratorio 1");

		produtorModel.setLaboratorio(laboratorioModel);

		produtorRepository.save(produtorModel);
		Integer countProdutor = produtorRepository.findAll().size();
		Assertions.assertEquals(1, countProdutor);
	}

}
