package br.com.rr.mastertech.porta.mapper;

import br.com.rr.mastertech.porta.domain.Porta;
import br.com.rr.mastertech.porta.dto.request.PortaRequest;
import br.com.rr.mastertech.porta.dto.response.PortaResponse;
import org.springframework.stereotype.Component;

@Component
public class PortaMapper {

    public Porta toPorta(PortaRequest request) {
        Porta porta = new Porta();
        porta.setAndar(request.getAndar());
        porta.setSala(request.getSala());
        return porta;
    }

    public PortaResponse toPortaResponse(Porta porta) {
        PortaResponse response = new PortaResponse();
        response.setId(porta.getId());
        response.setAndar(porta.getAndar());
        response.setSala(porta.getSala());
        return response;
    }
}
