/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author f5078775
 */
@Entity
@Table(name = "tb_vlr_causa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ValorCausa.findAll", query = "SELECT v FROM ValorCausa v")
    , @NamedQuery(name = "ValorCausa.findById", query = "SELECT v FROM ValorCausa v WHERE v.id = :id")
    , @NamedQuery(name = "ValorCausa.findByNpj", query = "SELECT v FROM ValorCausa v WHERE v.npj = :npj")
    , @NamedQuery(name = "ValorCausa.findByVlrCausa", query = "SELECT v FROM ValorCausa v WHERE v.vlrCausa = :vlrCausa")
    , @NamedQuery(name = "ValorCausa.findByObs", query = "SELECT v FROM ValorCausa v WHERE v.obs = :obs")})
public class ValorCausa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "npj")
    private String npj;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "vlr_causa")
    private BigDecimal vlrCausa;
    @Column(name = "obs")
    private String obs;

    public ValorCausa() {
    }

    public ValorCausa(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNpj() {
        return npj;
    }

    public void setNpj(String npj) {
        this.npj = npj;
    }

    public BigDecimal getVlrCausa() {
        return vlrCausa;
    }

    public void setVlrCausa(BigDecimal vlrCausa) {
        this.vlrCausa = vlrCausa;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ValorCausa)) {
            return false;
        }
        ValorCausa other = (ValorCausa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.ValorCausa[ id=" + id + " ]";
    }
    
}
