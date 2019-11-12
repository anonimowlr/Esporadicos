/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author f5078775
 */
@Entity
@Table(name = "tb_base_cnt_liq")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cnt.findAll", query = "SELECT c FROM Cnt c")
    , @NamedQuery(name = "Cnt.findById", query = "SELECT c FROM Cnt c WHERE c.id = :id")
    , @NamedQuery(name = "Cnt.findByRazao", query = "SELECT c FROM Cnt c WHERE c.razao = :razao")
    , @NamedQuery(name = "Cnt.findByAgencia", query = "SELECT c FROM Cnt c WHERE c.agencia = :agencia")
    , @NamedQuery(name = "Cnt.findByConta", query = "SELECT c FROM Cnt c WHERE c.conta = :conta")
    , @NamedQuery(name = "Cnt.findByDataAbertura", query = "SELECT c FROM Cnt c WHERE c.dataAbertura = :dataAbertura")
    , @NamedQuery(name = "Cnt.findBySaldo", query = "SELECT c FROM Cnt c WHERE c.saldo = :saldo")
    , @NamedQuery(name = "Cnt.findByDataSaldo", query = "SELECT c FROM Cnt c WHERE c.dataSaldo = :dataSaldo")
    , @NamedQuery(name = "Cnt.findByNome", query = "SELECT c FROM Cnt c WHERE c.nome = :nome")
    , @NamedQuery(name = "Cnt.findByOrigem", query = "SELECT c FROM Cnt c WHERE c.origem = :origem")
    , @NamedQuery(name = "Cnt.findByBbjurCnt", query = "SELECT c FROM Cnt c WHERE c.bbjurCnt = :bbjurCnt")
    , @NamedQuery(name = "Cnt.findByNDepositoCnt", query = "SELECT c FROM Cnt c WHERE c.nDepositoCnt = :nDepositoCnt")
    , @NamedQuery(name = "Cnt.findByModDepCnt", query = "SELECT c FROM Cnt c WHERE c.modDepCnt = :modDepCnt")
    , @NamedQuery(name = "Cnt.findByInstDepCnt", query = "SELECT c FROM Cnt c WHERE c.instDepCnt = :instDepCnt")
    , @NamedQuery(name = "Cnt.findByOrientadora", query = "SELECT c FROM Cnt c WHERE c.orientadora = :orientadora")
    , @NamedQuery(name = "Cnt.findByPrefOrientadora", query = "SELECT c FROM Cnt c WHERE c.prefOrientadora = :prefOrientadora")
    , @NamedQuery(name = "Cnt.findByNaturezaBbjur", query = "SELECT c FROM Cnt c WHERE c.naturezaBbjur = :naturezaBbjur")
    , @NamedQuery(name = "Cnt.findBySituacaoBbjurPrincipalVariacao000", query = "SELECT c FROM Cnt c WHERE c.situacaoBbjurPrincipalVariacao000 = :situacaoBbjurPrincipalVariacao000")
    , @NamedQuery(name = "Cnt.findByDataSituacao", query = "SELECT c FROM Cnt c WHERE c.dataSituacao = :dataSituacao")
    , @NamedQuery(name = "Cnt.findByEgt", query = "SELECT c FROM Cnt c WHERE c.egt = :egt")
    , @NamedQuery(name = "Cnt.findBySitEgt", query = "SELECT c FROM Cnt c WHERE c.sitEgt = :sitEgt")
    , @NamedQuery(name = "Cnt.findBySaldoDebAtual", query = "SELECT c FROM Cnt c WHERE c.saldoDebAtual = :saldoDebAtual")
    , @NamedQuery(name = "Cnt.findByDataSaldoDeb", query = "SELECT c FROM Cnt c WHERE c.dataSaldoDeb = :dataSaldoDeb")
    , @NamedQuery(name = "Cnt.findByEvento", query = "SELECT c FROM Cnt c WHERE c.evento = :evento")})
public class Cnt implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "RAZAO")
    private String razao;
    @Column(name = "AGENCIA")
    private String agencia;
    @Column(name = "CONTA")
    private String conta;
    @Column(name = "DATA_ABERTURA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAbertura;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SALDO")
    private Double saldo;
    @Column(name = "DATA_SALDO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataSaldo;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "ORIGEM")
    private String origem;
    @Column(name = "BBJUR_CNT")
    private String bbjurCnt;
    @Column(name = "N_DEPOSITO_CNT")
    private String nDepositoCnt;
    @Column(name = "MOD_DEP_CNT")
    private String modDepCnt;
    @Column(name = "INST_DEP_CNT")
    private String instDepCnt;
    @Column(name = "ORIENTADORA")
    private String orientadora;
    @Column(name = "PREF_ORIENTADORA")
    private String prefOrientadora;
    @Column(name = "NATUREZA_BBJUR")
    private String naturezaBbjur;
    @Column(name = "SITUACAO_BBJUR_PRINCIPAL_VARIACAO_000")
    private String situacaoBbjurPrincipalVariacao000;
    @Column(name = "DATA_SITUACAO")
    private String dataSituacao;
    @Column(name = "EGT")
    private String egt;
    @Column(name = "SIT_EGT")
    private String sitEgt;
    @Column(name = "SALDO_DEB_ATUAL")
    private BigDecimal saldoDebAtual;
    @Column(name = "DATA_SALDO_DEB")
    @Temporal(TemporalType.DATE)
    private Date dataSaldoDeb;
    @Column(name = "EVENTO")
    private String evento;

    public Cnt() {
    }

    public Cnt(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRazao() {
        return razao;
    }

    public void setRazao(String razao) {
        this.razao = razao;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Date getDataSaldo() {
        return dataSaldo;
    }

    public void setDataSaldo(Date dataSaldo) {
        this.dataSaldo = dataSaldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getBbjurCnt() {
        return bbjurCnt;
    }

    public void setBbjurCnt(String bbjurCnt) {
        this.bbjurCnt = bbjurCnt;
    }

    public String getNDepositoCnt() {
        return nDepositoCnt;
    }

    public void setNDepositoCnt(String nDepositoCnt) {
        this.nDepositoCnt = nDepositoCnt;
    }

    public String getModDepCnt() {
        return modDepCnt;
    }

    public void setModDepCnt(String modDepCnt) {
        this.modDepCnt = modDepCnt;
    }

    public String getInstDepCnt() {
        return instDepCnt;
    }

    public void setInstDepCnt(String instDepCnt) {
        this.instDepCnt = instDepCnt;
    }

    public String getOrientadora() {
        return orientadora;
    }

    public void setOrientadora(String orientadora) {
        this.orientadora = orientadora;
    }

    public String getPrefOrientadora() {
        return prefOrientadora;
    }

    public void setPrefOrientadora(String prefOrientadora) {
        this.prefOrientadora = prefOrientadora;
    }

    public String getNaturezaBbjur() {
        return naturezaBbjur;
    }

    public void setNaturezaBbjur(String naturezaBbjur) {
        this.naturezaBbjur = naturezaBbjur;
    }

    public String getSituacaoBbjurPrincipalVariacao000() {
        return situacaoBbjurPrincipalVariacao000;
    }

    public void setSituacaoBbjurPrincipalVariacao000(String situacaoBbjurPrincipalVariacao000) {
        this.situacaoBbjurPrincipalVariacao000 = situacaoBbjurPrincipalVariacao000;
    }

    public String getDataSituacao() {
        return dataSituacao;
    }

    public void setDataSituacao(String dataSituacao) {
        this.dataSituacao = dataSituacao;
    }

    public String getEgt() {
        return egt;
    }

    public void setEgt(String egt) {
        this.egt = egt;
    }

    public String getSitEgt() {
        return sitEgt;
    }

    public void setSitEgt(String sitEgt) {
        this.sitEgt = sitEgt;
    }

    public BigDecimal getSaldoDebAtual() {
        return saldoDebAtual;
    }

    public void setSaldoDebAtual(BigDecimal saldoDebAtual) {
        this.saldoDebAtual = saldoDebAtual;
    }

    public Date getDataSaldoDeb() {
        return dataSaldoDeb;
    }

    public void setDataSaldoDeb(Date dataSaldoDeb) {
        this.dataSaldoDeb = dataSaldoDeb;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
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
        if (!(object instanceof Cnt)) {
            return false;
        }
        Cnt other = (Cnt) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Cnt[ id=" + id + " ]";
    }
    
}
