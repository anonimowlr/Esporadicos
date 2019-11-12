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
@Table(name = "tb_assunto_npj_subsidio_cdc")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Assunto.findAll", query = "SELECT a FROM Assunto a")
    , @NamedQuery(name = "Assunto.findByCdPrc", query = "SELECT a FROM Assunto a WHERE a.cdPrc = :cdPrc")
    , @NamedQuery(name = "Assunto.findByCdPrfUnd", query = "SELECT a FROM Assunto a WHERE a.cdPrfUnd = :cdPrfUnd")
    , @NamedQuery(name = "Assunto.findByCdPrfDepe", query = "SELECT a FROM Assunto a WHERE a.cdPrfDepe = :cdPrfDepe")
    , @NamedQuery(name = "Assunto.findByDtEntdPrc", query = "SELECT a FROM Assunto a WHERE a.dtEntdPrc = :dtEntdPrc")
    , @NamedQuery(name = "Assunto.findByDtSaidPrc", query = "SELECT a FROM Assunto a WHERE a.dtSaidPrc = :dtSaidPrc")
    , @NamedQuery(name = "Assunto.findByCdUsuArea", query = "SELECT a FROM Assunto a WHERE a.cdUsuArea = :cdUsuArea")
    , @NamedQuery(name = "Assunto.findByCdUsuEqp", query = "SELECT a FROM Assunto a WHERE a.cdUsuEqp = :cdUsuEqp")
    , @NamedQuery(name = "Assunto.findByCdUsuFun", query = "SELECT a FROM Assunto a WHERE a.cdUsuFun = :cdUsuFun")
    , @NamedQuery(name = "Assunto.findByCdEtp", query = "SELECT a FROM Assunto a WHERE a.cdEtp = :cdEtp")
    , @NamedQuery(name = "Assunto.findByDtLimite", query = "SELECT a FROM Assunto a WHERE a.dtLimite = :dtLimite")
    , @NamedQuery(name = "Assunto.findByCdTipPrc", query = "SELECT a FROM Assunto a WHERE a.cdTipPrc = :cdTipPrc")
    , @NamedQuery(name = "Assunto.findByCdEqp", query = "SELECT a FROM Assunto a WHERE a.cdEqp = :cdEqp")
    , @NamedQuery(name = "Assunto.findByCdPrfOper", query = "SELECT a FROM Assunto a WHERE a.cdPrfOper = :cdPrfOper")
    , @NamedQuery(name = "Assunto.findByCdAgrupPrc", query = "SELECT a FROM Assunto a WHERE a.cdAgrupPrc = :cdAgrupPrc")
    , @NamedQuery(name = "Assunto.findByCdTipAtend", query = "SELECT a FROM Assunto a WHERE a.cdTipAtend = :cdTipAtend")
    , @NamedQuery(name = "Assunto.findByPriorizado", query = "SELECT a FROM Assunto a WHERE a.priorizado = :priorizado")
    , @NamedQuery(name = "Assunto.findByCompartilhado", query = "SELECT a FROM Assunto a WHERE a.compartilhado = :compartilhado")
    , @NamedQuery(name = "Assunto.findByCdTipAtvd", query = "SELECT a FROM Assunto a WHERE a.cdTipAtvd = :cdTipAtvd")
    , @NamedQuery(name = "Assunto.findByCdDetalheOcr", query = "SELECT a FROM Assunto a WHERE a.cdDetalheOcr = :cdDetalheOcr")
    , @NamedQuery(name = "Assunto.findBySb", query = "SELECT a FROM Assunto a WHERE a.sb = :sb")
    , @NamedQuery(name = "Assunto.findByMatriculaSolicitante", query = "SELECT a FROM Assunto a WHERE a.matriculaSolicitante = :matriculaSolicitante")
    , @NamedQuery(name = "Assunto.findByCdCli", query = "SELECT a FROM Assunto a WHERE a.cdCli = :cdCli")
    , @NamedQuery(name = "Assunto.findByDtInicioEntd", query = "SELECT a FROM Assunto a WHERE a.dtInicioEntd = :dtInicioEntd")
    , @NamedQuery(name = "Assunto.findByValor", query = "SELECT a FROM Assunto a WHERE a.valor = :valor")
    , @NamedQuery(name = "Assunto.findByDtVenc", query = "SELECT a FROM Assunto a WHERE a.dtVenc = :dtVenc")
    , @NamedQuery(name = "Assunto.findByDtConclPrc", query = "SELECT a FROM Assunto a WHERE a.dtConclPrc = :dtConclPrc")
    , @NamedQuery(name = "Assunto.findByPermTotal", query = "SELECT a FROM Assunto a WHERE a.permTotal = :permTotal")
    , @NamedQuery(name = "Assunto.findByPermDilig", query = "SELECT a FROM Assunto a WHERE a.permDilig = :permDilig")
    , @NamedQuery(name = "Assunto.findByPermCso", query = "SELECT a FROM Assunto a WHERE a.permCso = :permCso")
    , @NamedQuery(name = "Assunto.findByDiasAtraso", query = "SELECT a FROM Assunto a WHERE a.diasAtraso = :diasAtraso")
    , @NamedQuery(name = "Assunto.findByIdentific1", query = "SELECT a FROM Assunto a WHERE a.identific1 = :identific1")
    , @NamedQuery(name = "Assunto.findByIdentific2", query = "SELECT a FROM Assunto a WHERE a.identific2 = :identific2")
    , @NamedQuery(name = "Assunto.findByIdentific3", query = "SELECT a FROM Assunto a WHERE a.identific3 = :identific3")
    , @NamedQuery(name = "Assunto.findByCdPrfUndOrigem", query = "SELECT a FROM Assunto a WHERE a.cdPrfUndOrigem = :cdPrfUndOrigem")
    , @NamedQuery(name = "Assunto.findBySbOrigem", query = "SELECT a FROM Assunto a WHERE a.sbOrigem = :sbOrigem")
    , @NamedQuery(name = "Assunto.findByDuracaoTarefas", query = "SELECT a FROM Assunto a WHERE a.duracaoTarefas = :duracaoTarefas")
    , @NamedQuery(name = "Assunto.findByDtLimiteInicial", query = "SELECT a FROM Assunto a WHERE a.dtLimiteInicial = :dtLimiteInicial")
    , @NamedQuery(name = "Assunto.findByDtEtpAtual", query = "SELECT a FROM Assunto a WHERE a.dtEtpAtual = :dtEtpAtual")
    , @NamedQuery(name = "Assunto.findByCdUltimaOcr", query = "SELECT a FROM Assunto a WHERE a.cdUltimaOcr = :cdUltimaOcr")
    , @NamedQuery(name = "Assunto.findByCdUltOcrPrc", query = "SELECT a FROM Assunto a WHERE a.cdUltOcrPrc = :cdUltOcrPrc")
    , @NamedQuery(name = "Assunto.findByCdUltTarefaPrc", query = "SELECT a FROM Assunto a WHERE a.cdUltTarefaPrc = :cdUltTarefaPrc")
    , @NamedQuery(name = "Assunto.findByDtDevOcr", query = "SELECT a FROM Assunto a WHERE a.dtDevOcr = :dtDevOcr")
    , @NamedQuery(name = "Assunto.findByDtSla", query = "SELECT a FROM Assunto a WHERE a.dtSla = :dtSla")
    , @NamedQuery(name = "Assunto.findByAtraso1n", query = "SELECT a FROM Assunto a WHERE a.atraso1n = :atraso1n")
    , @NamedQuery(name = "Assunto.findByAtraso2n", query = "SELECT a FROM Assunto a WHERE a.atraso2n = :atraso2n")
    , @NamedQuery(name = "Assunto.findByCdAgendaPrc", query = "SELECT a FROM Assunto a WHERE a.cdAgendaPrc = :cdAgendaPrc")
    , @NamedQuery(name = "Assunto.findByCdFasePrc", query = "SELECT a FROM Assunto a WHERE a.cdFasePrc = :cdFasePrc")
    , @NamedQuery(name = "Assunto.findByCdPrcVinc", query = "SELECT a FROM Assunto a WHERE a.cdPrcVinc = :cdPrcVinc")
    , @NamedQuery(name = "Assunto.findByCdTipOrigem", query = "SELECT a FROM Assunto a WHERE a.cdTipOrigem = :cdTipOrigem")
    , @NamedQuery(name = "Assunto.findByDtLimiteCli", query = "SELECT a FROM Assunto a WHERE a.dtLimiteCli = :dtLimiteCli")
    , @NamedQuery(name = "Assunto.findByDiasAtrasoCli", query = "SELECT a FROM Assunto a WHERE a.diasAtrasoCli = :diasAtrasoCli")
    , @NamedQuery(name = "Assunto.findByPermCli", query = "SELECT a FROM Assunto a WHERE a.permCli = :permCli")
    , @NamedQuery(name = "Assunto.findByCdControle", query = "SELECT a FROM Assunto a WHERE a.cdControle = :cdControle")
    , @NamedQuery(name = "Assunto.findByCdUsuEntd", query = "SELECT a FROM Assunto a WHERE a.cdUsuEntd = :cdUsuEntd")
    , @NamedQuery(name = "Assunto.findByCdUsuLatl", query = "SELECT a FROM Assunto a WHERE a.cdUsuLatl = :cdUsuLatl")
    , @NamedQuery(name = "Assunto.findByDtSlaFunci", query = "SELECT a FROM Assunto a WHERE a.dtSlaFunci = :dtSlaFunci")
    , @NamedQuery(name = "Assunto.findBySituacaoLatl", query = "SELECT a FROM Assunto a WHERE a.situacaoLatl = :situacaoLatl")
    , @NamedQuery(name = "Assunto.findByCdClassePrc", query = "SELECT a FROM Assunto a WHERE a.cdClassePrc = :cdClassePrc")
    , @NamedQuery(name = "Assunto.findByEntdForaHoraLim", query = "SELECT a FROM Assunto a WHERE a.entdForaHoraLim = :entdForaHoraLim")
    , @NamedQuery(name = "Assunto.findByCdSitPrc", query = "SELECT a FROM Assunto a WHERE a.cdSitPrc = :cdSitPrc")
    , @NamedQuery(name = "Assunto.findByCdUltFlxFase", query = "SELECT a FROM Assunto a WHERE a.cdUltFlxFase = :cdUltFlxFase")
    , @NamedQuery(name = "Assunto.findByCdUltFlxFaseCtrl", query = "SELECT a FROM Assunto a WHERE a.cdUltFlxFaseCtrl = :cdUltFlxFaseCtrl")
    , @NamedQuery(name = "Assunto.findByCdUsuStr", query = "SELECT a FROM Assunto a WHERE a.cdUsuStr = :cdUsuStr")
    , @NamedQuery(name = "Assunto.findByDtLimRepactuada", query = "SELECT a FROM Assunto a WHERE a.dtLimRepactuada = :dtLimRepactuada")
    , @NamedQuery(name = "Assunto.findByPrazoPacto", query = "SELECT a FROM Assunto a WHERE a.prazoPacto = :prazoPacto")
    , @NamedQuery(name = "Assunto.findByPactoCliente", query = "SELECT a FROM Assunto a WHERE a.pactoCliente = :pactoCliente")
    , @NamedQuery(name = "Assunto.findByNmTipAtvd", query = "SELECT a FROM Assunto a WHERE a.nmTipAtvd = :nmTipAtvd")
    , @NamedQuery(name = "Assunto.findByEtapaAtual", query = "SELECT a FROM Assunto a WHERE a.etapaAtual = :etapaAtual")
    , @NamedQuery(name = "Assunto.findByFunciRsp", query = "SELECT a FROM Assunto a WHERE a.funciRsp = :funciRsp")
    , @NamedQuery(name = "Assunto.findByGerResp", query = "SELECT a FROM Assunto a WHERE a.gerResp = :gerResp")
    , @NamedQuery(name = "Assunto.findByNmTipPrc", query = "SELECT a FROM Assunto a WHERE a.nmTipPrc = :nmTipPrc")
    , @NamedQuery(name = "Assunto.findByAssunto", query = "SELECT a FROM Assunto a WHERE a.assunto = :assunto")
    , @NamedQuery(name = "Assunto.findByOrigem", query = "SELECT a FROM Assunto a WHERE a.origem = :origem")
    , @NamedQuery(name = "Assunto.findByGrupo", query = "SELECT a FROM Assunto a WHERE a.grupo = :grupo")
    , @NamedQuery(name = "Assunto.findByDataVerificacao", query = "SELECT a FROM Assunto a WHERE a.dataVerificacao = :dataVerificacao")
    , @NamedQuery(name = "Assunto.findByValorCausa", query = "SELECT a FROM Assunto a WHERE a.valorCausa = :valorCausa")})
public class Assunto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CD_PRC")
    private Integer cdPrc;
    @Column(name = "CD_PRF_UND")
    private Integer cdPrfUnd;
    @Column(name = "CD_PRF_DEPE")
    private String cdPrfDepe;
    @Column(name = "DT_ENTD_PRC")
    @Temporal(TemporalType.DATE)
    private Date dtEntdPrc;
    @Column(name = "DT_SAID_PRC")
    @Temporal(TemporalType.DATE)
    private Date dtSaidPrc;
    @Column(name = "CD_USU_AREA")
    private String cdUsuArea;
    @Column(name = "CD_USU_EQP")
    private String cdUsuEqp;
    @Column(name = "CD_USU_FUN")
    private String cdUsuFun;
    @Column(name = "CD_ETP")
    private Integer cdEtp;
    @Column(name = "DT_LIMITE")
    @Temporal(TemporalType.DATE)
    private Date dtLimite;
    @Column(name = "CD_TIP_PRC")
    private Integer cdTipPrc;
    @Column(name = "CD_EQP")
    private Integer cdEqp;
    @Column(name = "CD_PRF_OPER")
    private String cdPrfOper;
    @Column(name = "CD_AGRUP_PRC")
    private Integer cdAgrupPrc;
    @Column(name = "CD_TIP_ATEND")
    private Integer cdTipAtend;
    @Column(name = "PRIORIZADO")
    private Character priorizado;
    @Column(name = "COMPARTILHADO")
    private Character compartilhado;
    @Column(name = "CD_TIP_ATVD")
    private Integer cdTipAtvd;
    @Column(name = "CD_DETALHE_OCR")
    private Integer cdDetalheOcr;
    @Column(name = "SB")
    private String sb;
    @Column(name = "MATRICULA_SOLICITANTE")
    private String matriculaSolicitante;
    @Column(name = "CD_CLI")
    private Integer cdCli;
    @Basic(optional = false)
    @Column(name = "DT_INICIO_ENTD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtInicioEntd;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private Double valor;
    @Column(name = "DT_VENC")
    @Temporal(TemporalType.DATE)
    private Date dtVenc;
    @Column(name = "DT_CONCL_PRC")
    @Temporal(TemporalType.DATE)
    private Date dtConclPrc;
    @Column(name = "PERM_TOTAL")
    private Integer permTotal;
    @Column(name = "PERM_DILIG")
    private Integer permDilig;
    @Column(name = "PERM_CSO")
    private Integer permCso;
    @Column(name = "DIAS_ATRASO")
    private Integer diasAtraso;
    @Column(name = "IDENTIFIC1")
    private String identific1;
    @Column(name = "IDENTIFIC2")
    private String identific2;
    @Column(name = "IDENTIFIC3")
    private String identific3;
    @Column(name = "CD_PRF_UND_ORIGEM")
    private Integer cdPrfUndOrigem;
    @Column(name = "SB_ORIGEM")
    private String sbOrigem;
    @Column(name = "DURACAO_TAREFAS")
    private Double duracaoTarefas;
    @Column(name = "DT_LIMITE_INICIAL")
    @Temporal(TemporalType.DATE)
    private Date dtLimiteInicial;
    @Column(name = "DT_ETP_ATUAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtEtpAtual;
    @Column(name = "CD_ULTIMA_OCR")
    private Integer cdUltimaOcr;
    @Column(name = "CD_ULT_OCR_PRC")
    private Integer cdUltOcrPrc;
    @Column(name = "CD_ULT_TAREFA_PRC")
    private Integer cdUltTarefaPrc;
    @Column(name = "DT_DEV_OCR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtDevOcr;
    @Column(name = "DT_SLA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtSla;
    @Column(name = "ATRASO_1N")
    private Integer atraso1n;
    @Column(name = "ATRASO_2N")
    private Integer atraso2n;
    @Column(name = "CD_AGENDA_PRC")
    private Integer cdAgendaPrc;
    @Column(name = "CD_FASE_PRC")
    private Integer cdFasePrc;
    @Column(name = "CD_PRC_VINC")
    private Integer cdPrcVinc;
    @Column(name = "CD_TIP_ORIGEM")
    private Integer cdTipOrigem;
    @Column(name = "DT_LIMITE_CLI")
    @Temporal(TemporalType.DATE)
    private Date dtLimiteCli;
    @Column(name = "DIAS_ATRASO_CLI")
    private Integer diasAtrasoCli;
    @Column(name = "PERM_CLI")
    private Integer permCli;
    @Column(name = "CD_CONTROLE")
    private Character cdControle;
    @Column(name = "CD_USU_ENTD")
    private String cdUsuEntd;
    @Column(name = "CD_USU_LATL")
    private String cdUsuLatl;
    @Column(name = "DT_SLA_FUNCI")
    @Temporal(TemporalType.DATE)
    private Date dtSlaFunci;
    @Column(name = "SITUACAO_LATL")
    private Character situacaoLatl;
    @Column(name = "CD_CLASSE_PRC")
    private Integer cdClassePrc;
    @Column(name = "ENTD_FORA_HORA_LIM")
    private Character entdForaHoraLim;
    @Column(name = "CD_SIT_PRC")
    private Integer cdSitPrc;
    @Column(name = "CD_ULT_FLX_FASE")
    private Integer cdUltFlxFase;
    @Column(name = "CD_ULT_FLX_FASE_CTRL")
    private Integer cdUltFlxFaseCtrl;
    @Column(name = "CD_USU_STR")
    private String cdUsuStr;
    @Column(name = "DT_LIM_REPACTUADA")
    private Character dtLimRepactuada;
    @Column(name = "PRAZO_PACTO")
    private Integer prazoPacto;
    @Column(name = "PACTO_CLIENTE")
    private Integer pactoCliente;
    @Basic(optional = false)
    @Column(name = "NM_TIP_ATVD")
    private String nmTipAtvd;
    @Basic(optional = false)
    @Column(name = "ETAPA_ATUAL")
    private String etapaAtual;
    @Column(name = "FUNCI_RSP")
    private String funciRsp;
    @Column(name = "GER_RESP")
    private String gerResp;
    @Column(name = "NM_TIP_PRC")
    private String nmTipPrc;
    @Column(name = "ASSUNTO")
    private String assunto;
    @Column(name = "ORIGEM")
    private String origem;
    @Column(name = "GRUPO")
    private String grupo;
    @Column(name = "DATA_VERIFICACAO")
    @Temporal(TemporalType.DATE)
    private Date dataVerificacao;
    @Column(name = "VALOR_CAUSA")
    private BigDecimal valorCausa;

    public Assunto() {
    }

    public Assunto(Integer cdPrc) {
        this.cdPrc = cdPrc;
    }

    public Assunto(Integer cdPrc, Date dtInicioEntd, String nmTipAtvd, String etapaAtual) {
        this.cdPrc = cdPrc;
        this.dtInicioEntd = dtInicioEntd;
        this.nmTipAtvd = nmTipAtvd;
        this.etapaAtual = etapaAtual;
    }

    public Integer getCdPrc() {
        return cdPrc;
    }

    public void setCdPrc(Integer cdPrc) {
        this.cdPrc = cdPrc;
    }

    public Integer getCdPrfUnd() {
        return cdPrfUnd;
    }

    public void setCdPrfUnd(Integer cdPrfUnd) {
        this.cdPrfUnd = cdPrfUnd;
    }

    public String getCdPrfDepe() {
        return cdPrfDepe;
    }

    public void setCdPrfDepe(String cdPrfDepe) {
        this.cdPrfDepe = cdPrfDepe;
    }

    public Date getDtEntdPrc() {
        return dtEntdPrc;
    }

    public void setDtEntdPrc(Date dtEntdPrc) {
        this.dtEntdPrc = dtEntdPrc;
    }

    public Date getDtSaidPrc() {
        return dtSaidPrc;
    }

    public void setDtSaidPrc(Date dtSaidPrc) {
        this.dtSaidPrc = dtSaidPrc;
    }

    public String getCdUsuArea() {
        return cdUsuArea;
    }

    public void setCdUsuArea(String cdUsuArea) {
        this.cdUsuArea = cdUsuArea;
    }

    public String getCdUsuEqp() {
        return cdUsuEqp;
    }

    public void setCdUsuEqp(String cdUsuEqp) {
        this.cdUsuEqp = cdUsuEqp;
    }

    public String getCdUsuFun() {
        return cdUsuFun;
    }

    public void setCdUsuFun(String cdUsuFun) {
        this.cdUsuFun = cdUsuFun;
    }

    public Integer getCdEtp() {
        return cdEtp;
    }

    public void setCdEtp(Integer cdEtp) {
        this.cdEtp = cdEtp;
    }

    public Date getDtLimite() {
        return dtLimite;
    }

    public void setDtLimite(Date dtLimite) {
        this.dtLimite = dtLimite;
    }

    public Integer getCdTipPrc() {
        return cdTipPrc;
    }

    public void setCdTipPrc(Integer cdTipPrc) {
        this.cdTipPrc = cdTipPrc;
    }

    public Integer getCdEqp() {
        return cdEqp;
    }

    public void setCdEqp(Integer cdEqp) {
        this.cdEqp = cdEqp;
    }

    public String getCdPrfOper() {
        return cdPrfOper;
    }

    public void setCdPrfOper(String cdPrfOper) {
        this.cdPrfOper = cdPrfOper;
    }

    public Integer getCdAgrupPrc() {
        return cdAgrupPrc;
    }

    public void setCdAgrupPrc(Integer cdAgrupPrc) {
        this.cdAgrupPrc = cdAgrupPrc;
    }

    public Integer getCdTipAtend() {
        return cdTipAtend;
    }

    public void setCdTipAtend(Integer cdTipAtend) {
        this.cdTipAtend = cdTipAtend;
    }

    public Character getPriorizado() {
        return priorizado;
    }

    public void setPriorizado(Character priorizado) {
        this.priorizado = priorizado;
    }

    public Character getCompartilhado() {
        return compartilhado;
    }

    public void setCompartilhado(Character compartilhado) {
        this.compartilhado = compartilhado;
    }

    public Integer getCdTipAtvd() {
        return cdTipAtvd;
    }

    public void setCdTipAtvd(Integer cdTipAtvd) {
        this.cdTipAtvd = cdTipAtvd;
    }

    public Integer getCdDetalheOcr() {
        return cdDetalheOcr;
    }

    public void setCdDetalheOcr(Integer cdDetalheOcr) {
        this.cdDetalheOcr = cdDetalheOcr;
    }

    public String getSb() {
        return sb;
    }

    public void setSb(String sb) {
        this.sb = sb;
    }

    public String getMatriculaSolicitante() {
        return matriculaSolicitante;
    }

    public void setMatriculaSolicitante(String matriculaSolicitante) {
        this.matriculaSolicitante = matriculaSolicitante;
    }

    public Integer getCdCli() {
        return cdCli;
    }

    public void setCdCli(Integer cdCli) {
        this.cdCli = cdCli;
    }

    public Date getDtInicioEntd() {
        return dtInicioEntd;
    }

    public void setDtInicioEntd(Date dtInicioEntd) {
        this.dtInicioEntd = dtInicioEntd;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getDtVenc() {
        return dtVenc;
    }

    public void setDtVenc(Date dtVenc) {
        this.dtVenc = dtVenc;
    }

    public Date getDtConclPrc() {
        return dtConclPrc;
    }

    public void setDtConclPrc(Date dtConclPrc) {
        this.dtConclPrc = dtConclPrc;
    }

    public Integer getPermTotal() {
        return permTotal;
    }

    public void setPermTotal(Integer permTotal) {
        this.permTotal = permTotal;
    }

    public Integer getPermDilig() {
        return permDilig;
    }

    public void setPermDilig(Integer permDilig) {
        this.permDilig = permDilig;
    }

    public Integer getPermCso() {
        return permCso;
    }

    public void setPermCso(Integer permCso) {
        this.permCso = permCso;
    }

    public Integer getDiasAtraso() {
        return diasAtraso;
    }

    public void setDiasAtraso(Integer diasAtraso) {
        this.diasAtraso = diasAtraso;
    }

    public String getIdentific1() {
        return identific1;
    }

    public void setIdentific1(String identific1) {
        this.identific1 = identific1;
    }

    public String getIdentific2() {
        return identific2;
    }

    public void setIdentific2(String identific2) {
        this.identific2 = identific2;
    }

    public String getIdentific3() {
        return identific3;
    }

    public void setIdentific3(String identific3) {
        this.identific3 = identific3;
    }

    public Integer getCdPrfUndOrigem() {
        return cdPrfUndOrigem;
    }

    public void setCdPrfUndOrigem(Integer cdPrfUndOrigem) {
        this.cdPrfUndOrigem = cdPrfUndOrigem;
    }

    public String getSbOrigem() {
        return sbOrigem;
    }

    public void setSbOrigem(String sbOrigem) {
        this.sbOrigem = sbOrigem;
    }

    public Double getDuracaoTarefas() {
        return duracaoTarefas;
    }

    public void setDuracaoTarefas(Double duracaoTarefas) {
        this.duracaoTarefas = duracaoTarefas;
    }

    public Date getDtLimiteInicial() {
        return dtLimiteInicial;
    }

    public void setDtLimiteInicial(Date dtLimiteInicial) {
        this.dtLimiteInicial = dtLimiteInicial;
    }

    public Date getDtEtpAtual() {
        return dtEtpAtual;
    }

    public void setDtEtpAtual(Date dtEtpAtual) {
        this.dtEtpAtual = dtEtpAtual;
    }

    public Integer getCdUltimaOcr() {
        return cdUltimaOcr;
    }

    public void setCdUltimaOcr(Integer cdUltimaOcr) {
        this.cdUltimaOcr = cdUltimaOcr;
    }

    public Integer getCdUltOcrPrc() {
        return cdUltOcrPrc;
    }

    public void setCdUltOcrPrc(Integer cdUltOcrPrc) {
        this.cdUltOcrPrc = cdUltOcrPrc;
    }

    public Integer getCdUltTarefaPrc() {
        return cdUltTarefaPrc;
    }

    public void setCdUltTarefaPrc(Integer cdUltTarefaPrc) {
        this.cdUltTarefaPrc = cdUltTarefaPrc;
    }

    public Date getDtDevOcr() {
        return dtDevOcr;
    }

    public void setDtDevOcr(Date dtDevOcr) {
        this.dtDevOcr = dtDevOcr;
    }

    public Date getDtSla() {
        return dtSla;
    }

    public void setDtSla(Date dtSla) {
        this.dtSla = dtSla;
    }

    public Integer getAtraso1n() {
        return atraso1n;
    }

    public void setAtraso1n(Integer atraso1n) {
        this.atraso1n = atraso1n;
    }

    public Integer getAtraso2n() {
        return atraso2n;
    }

    public void setAtraso2n(Integer atraso2n) {
        this.atraso2n = atraso2n;
    }

    public Integer getCdAgendaPrc() {
        return cdAgendaPrc;
    }

    public void setCdAgendaPrc(Integer cdAgendaPrc) {
        this.cdAgendaPrc = cdAgendaPrc;
    }

    public Integer getCdFasePrc() {
        return cdFasePrc;
    }

    public void setCdFasePrc(Integer cdFasePrc) {
        this.cdFasePrc = cdFasePrc;
    }

    public Integer getCdPrcVinc() {
        return cdPrcVinc;
    }

    public void setCdPrcVinc(Integer cdPrcVinc) {
        this.cdPrcVinc = cdPrcVinc;
    }

    public Integer getCdTipOrigem() {
        return cdTipOrigem;
    }

    public void setCdTipOrigem(Integer cdTipOrigem) {
        this.cdTipOrigem = cdTipOrigem;
    }

    public Date getDtLimiteCli() {
        return dtLimiteCli;
    }

    public void setDtLimiteCli(Date dtLimiteCli) {
        this.dtLimiteCli = dtLimiteCli;
    }

    public Integer getDiasAtrasoCli() {
        return diasAtrasoCli;
    }

    public void setDiasAtrasoCli(Integer diasAtrasoCli) {
        this.diasAtrasoCli = diasAtrasoCli;
    }

    public Integer getPermCli() {
        return permCli;
    }

    public void setPermCli(Integer permCli) {
        this.permCli = permCli;
    }

    public Character getCdControle() {
        return cdControle;
    }

    public void setCdControle(Character cdControle) {
        this.cdControle = cdControle;
    }

    public String getCdUsuEntd() {
        return cdUsuEntd;
    }

    public void setCdUsuEntd(String cdUsuEntd) {
        this.cdUsuEntd = cdUsuEntd;
    }

    public String getCdUsuLatl() {
        return cdUsuLatl;
    }

    public void setCdUsuLatl(String cdUsuLatl) {
        this.cdUsuLatl = cdUsuLatl;
    }

    public Date getDtSlaFunci() {
        return dtSlaFunci;
    }

    public void setDtSlaFunci(Date dtSlaFunci) {
        this.dtSlaFunci = dtSlaFunci;
    }

    public Character getSituacaoLatl() {
        return situacaoLatl;
    }

    public void setSituacaoLatl(Character situacaoLatl) {
        this.situacaoLatl = situacaoLatl;
    }

    public Integer getCdClassePrc() {
        return cdClassePrc;
    }

    public void setCdClassePrc(Integer cdClassePrc) {
        this.cdClassePrc = cdClassePrc;
    }

    public Character getEntdForaHoraLim() {
        return entdForaHoraLim;
    }

    public void setEntdForaHoraLim(Character entdForaHoraLim) {
        this.entdForaHoraLim = entdForaHoraLim;
    }

    public Integer getCdSitPrc() {
        return cdSitPrc;
    }

    public void setCdSitPrc(Integer cdSitPrc) {
        this.cdSitPrc = cdSitPrc;
    }

    public Integer getCdUltFlxFase() {
        return cdUltFlxFase;
    }

    public void setCdUltFlxFase(Integer cdUltFlxFase) {
        this.cdUltFlxFase = cdUltFlxFase;
    }

    public Integer getCdUltFlxFaseCtrl() {
        return cdUltFlxFaseCtrl;
    }

    public void setCdUltFlxFaseCtrl(Integer cdUltFlxFaseCtrl) {
        this.cdUltFlxFaseCtrl = cdUltFlxFaseCtrl;
    }

    public String getCdUsuStr() {
        return cdUsuStr;
    }

    public void setCdUsuStr(String cdUsuStr) {
        this.cdUsuStr = cdUsuStr;
    }

    public Character getDtLimRepactuada() {
        return dtLimRepactuada;
    }

    public void setDtLimRepactuada(Character dtLimRepactuada) {
        this.dtLimRepactuada = dtLimRepactuada;
    }

    public Integer getPrazoPacto() {
        return prazoPacto;
    }

    public void setPrazoPacto(Integer prazoPacto) {
        this.prazoPacto = prazoPacto;
    }

    public Integer getPactoCliente() {
        return pactoCliente;
    }

    public void setPactoCliente(Integer pactoCliente) {
        this.pactoCliente = pactoCliente;
    }

    public String getNmTipAtvd() {
        return nmTipAtvd;
    }

    public void setNmTipAtvd(String nmTipAtvd) {
        this.nmTipAtvd = nmTipAtvd;
    }

    public String getEtapaAtual() {
        return etapaAtual;
    }

    public void setEtapaAtual(String etapaAtual) {
        this.etapaAtual = etapaAtual;
    }

    public String getFunciRsp() {
        return funciRsp;
    }

    public void setFunciRsp(String funciRsp) {
        this.funciRsp = funciRsp;
    }

    public String getGerResp() {
        return gerResp;
    }

    public void setGerResp(String gerResp) {
        this.gerResp = gerResp;
    }

    public String getNmTipPrc() {
        return nmTipPrc;
    }

    public void setNmTipPrc(String nmTipPrc) {
        this.nmTipPrc = nmTipPrc;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public Date getDataVerificacao() {
        return dataVerificacao;
    }

    public void setDataVerificacao(Date dataVerificacao) {
        this.dataVerificacao = dataVerificacao;
    }

    public BigDecimal getValorCausa() {
        return valorCausa;
    }

    public void setValorCausa(BigDecimal valorCausa) {
        this.valorCausa = valorCausa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdPrc != null ? cdPrc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Assunto)) {
            return false;
        }
        Assunto other = (Assunto) object;
        if ((this.cdPrc == null && other.cdPrc != null) || (this.cdPrc != null && !this.cdPrc.equals(other.cdPrc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Assunto[ cdPrc=" + cdPrc + " ]";
    }
    
}
