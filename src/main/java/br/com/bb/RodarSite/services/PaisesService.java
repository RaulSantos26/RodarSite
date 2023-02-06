package br.com.bb.RodarSite.services;

import br.com.bb.RodarSite.dto.PaisesDto;
import br.com.bb.RodarSite.entities.Paises;
import br.com.bb.RodarSite.repositories.PaisesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PaisesService {
    @Autowired
    private PaisesRepository repository;

    @Transactional(readOnly = true)
    public List<PaisesDto> findAll(){
        List<Paises> result = repository.findAll();
        return result.stream().map(x-> new PaisesDto(x)).toList() ;
    }
}
