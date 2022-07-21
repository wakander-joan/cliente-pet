package br.com.petz.clientepet.cliente.application.service;

import org.springframework.stereotype.Service;

import br.com.petz.clientepet.cliente.application.api.ClienteRequest;
import br.com.petz.clientepet.cliente.application.api.ClienteResponse;
import br.com.petz.clientepet.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService {

	@Override
	public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
		log.info("[inicial] ClienteApplicationService - criaCliente");
		Cliente cliente = ClienteRepository.salva(new Cliente (clienteRequest));
		log.info("[Finaliza] ClienteApplicationService - criaCliente");
		return null;
	}

}
