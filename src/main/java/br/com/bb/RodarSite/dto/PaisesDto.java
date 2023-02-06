package br.com.bb.RodarSite.dto;

import br.com.bb.RodarSite.entities.Paises;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class PaisesDto {
    private Long id;
    private String nome;
    private String continente;
    private String codigo;

    public PaisesDto(Paises entity){

        id = entity.getId();
        nome = entity.getNome();
        continente = entity.getContinente();
        codigo = entity.getCodigo();

    }
}
