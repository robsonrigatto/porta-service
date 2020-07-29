package br.com.rr.mastertech.porta.service;

import br.com.rr.mastertech.porta.domain.Porta;
import br.com.rr.mastertech.porta.dto.request.PortaRequest;
import br.com.rr.mastertech.porta.dto.response.PortaResponse;
import br.com.rr.mastertech.porta.exception.PortaNaoEncontradaException;
import br.com.rr.mastertech.porta.mapper.PortaMapper;
import br.com.rr.mastertech.porta.repository.PortaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PortaService {

    @Autowired
    private PortaMapper mapper;

    @Autowired
    private PortaRepository repository;

    @Transactional
    public PortaResponse create(PortaRequest request) {
        Porta porta = mapper.toPorta(request);
        porta = repository.save(porta);
        return mapper.toPortaResponse(porta);
    }

    public PortaResponse findById(Integer id) {
        Porta porta = repository.findById(id).orElseThrow(() -> new PortaNaoEncontradaException());
        return mapper.toPortaResponse(porta);
    }
}
