package br.com.caelum.ingresso.validacao;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalTime;

import junit.framework.Assert;

import org.junit.Test;

import br.com.caelum.ingresso.model.Filme;
import br.com.caelum.ingresso.model.Ingresso;
import br.com.caelum.ingresso.model.Sala;
import br.com.caelum.ingresso.model.Sessao;
import br.com.caelum.ingresso.model.descontos.SemDesconto;

public class DescontoTest {
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void naoDeveConcederDescontoParaIngressoNormal() {
		Sala sala = new Sala("Eldorado - Imax", new BigDecimal("20.5"));
		Filme filme = new Filme("Roque One", Duration.ofMinutes(120), "SCI-FI", new BigDecimal("12.0"));
		
		Sessao sessao = new Sessao(LocalTime.parse("10:00:00"), filme, sala);
		Ingresso ingresso = new Ingresso(sessao, new SemDesconto());
		
		BigDecimal precoEsperado = new BigDecimal("32.50");
		
		Assert.assertEquals(precoEsperado, ingresso.getPreco());
	}
	
}
