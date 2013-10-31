/**
 *
 */
package br.com.acsp.curso.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

/**
 * @author eduardobregaida
 */

@Entity
public class Aula implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 27861293997381111L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column
    private String materia;

    @NotNull
    @Column
    private Long quantidadeHorasNecessarias;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "aula_aeronave", joinColumns = { @JoinColumn(name = "aula_id") }, inverseJoinColumns = { @JoinColumn(name = "aeronave_id") })
    private List<Aeronave> aeronaves = new ArrayList<Aeronave>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Long getQuantidadeHorasNecessarias() {
        return quantidadeHorasNecessarias;
    }

    public void setQuantidadeHorasNecessarias(Long quantidadeHorasNecessarias) {
        this.quantidadeHorasNecessarias = quantidadeHorasNecessarias;
    }

	public List<Aeronave> getAeronaves() {
		return aeronaves;
	}

	public void setAeronaves(List<Aeronave> aeronaves) {
		this.aeronaves = aeronaves;
	}

    

}
