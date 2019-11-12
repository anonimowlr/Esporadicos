/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
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
@Table(name = "tb_fiscalizacao_tratar_irreg")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Irregularidade.findAll", query = "SELECT i FROM Irregularidade i")
    , @NamedQuery(name = "Irregularidade.findByCdPrc", query = "SELECT i FROM Irregularidade i WHERE i.cdPrc = :cdPrc")
    , @NamedQuery(name = "Irregularidade.findByCdPrfUnd", query = "SELECT i FROM Irregularidade i WHERE i.cdPrfUnd = :cdPrfUnd")
    , @NamedQuery(name = "Irregularidade.findByCdPrfDepe", query = "SELECT i FROM Irregularidade i WHERE i.cdPrfDepe = :cdPrfDepe")
    , @NamedQuery(name = "Irregularidade.findByDtEntdPrc", query = "SELECT i FROM Irregularidade i WHERE i.dtEntdPrc = :dtEntdPrc")
    , @NamedQuery(name = "Irregularidade.findByDtSaidPrc", query = "SELECT i FROM Irregularidade i WHERE i.dtSaidPrc = :dtSaidPrc")
    , @NamedQuery(name = "Irregularidade.findByCdUsuArea", query = "SELECT i FROM Irregularidade i WHERE i.cdUsuArea = :cdUsuArea")
    , @NamedQuery(name = "Irregularidade.findByCdUsuEqp", query = "SELECT i FROM Irregularidade i WHERE i.cdUsuEqp = :cdUsuEqp")
    , @NamedQuery(name = "Irregularidade.findByCdUsuFun", query = "SELECT i FROM Irregularidade i WHERE i.cdUsuFun = :cdUsuFun")
    , @NamedQuery(name = "Irregularidade.findByCdEtp", query = "SELECT i FROM Irregularidade i WHERE i.cdEtp = :cdEtp")
    , @NamedQuery(name = "Irregularidade.findByDtLimite", query = "SELECT i FROM Irregularidade i WHERE i.dtLimite = :dtLimite")
    , @NamedQuery(name = "Irregularidade.findByCdTipPrc", query = "SELECT i FROM Irregularidade i WHERE i.cdTipPrc = :cdTipPrc")
    , @NamedQuery(name = "Irregularidade.findByCdEqp", query = "SELECT i FROM Irregularidade i WHERE i.cdEqp = :cdEqp")
    , @NamedQuery(name = "Irregularidade.findByCdPrfOper", query = "SELECT i FROM Irregularidade i WHERE i.cdPrfOper = :cdPrfOper")
    , @NamedQuery(name = "Irregularidade.findByCdAgrupPrc", query = "SELECT i FROM Irregularidade i WHERE i.cdAgrupPrc = :cdAgrupPrc")
    , @NamedQuery(name = "Irregularidade.findByCdTipAtend", query = "SELECT i FROM Irregularidade i WHERE i.cdTipAtend = :cdTipAtend")
    , @NamedQuery(name = "Irregularidade.findByPriorizado", query = "SELECT i FROM Irregularidade i WHERE i.priorizado = :priorizado")
    , @NamedQuery(name = "Irregularidade.findByCompartilhado", query = "SELECT i FROM Irregularidade i WHERE i.compartilhado = :compartilhado")
    , @NamedQuery(name = "Irregularidade.findByCdTipAtvd", query = "SELECT i FROM Irregularidade i WHERE i.cdTipAtvd = :cdTipAtvd")
    , @NamedQuery(name = "Irregularidade.findByCdDetalheOcr", query = "SELECT i FROM Irregularidade i WHERE i.cdDetalheOcr = :cdDetalheOcr")
    , @NamedQuery(name = "Irregularidade.findBySb", query = "SELECT i FROM Irregularidade i WHERE i.sb = :sb")
    , @NamedQuery(name = "Irregularidade.findByMatriculaSolicitante", query = "SELECT i FROM Irregularidade i WHERE i.matriculaSolicitante = :matriculaSolicitante")
    , @NamedQuery(name = "Irregularidade.findByCdCli", query = "SELECT i FROM Irregularidade i WHERE i.cdCli = :cdCli")
    , @NamedQuery(name = "Irregularidade.findByDtInicioEntd", query = "SELECT i FROM Irregularidade i WHERE i.dtInicioEntd = :dtInicioEntd")
    , @NamedQuery(name = "Irregularidade.findByValor", query = "SELECT i FROM Irregularidade i WHERE i.valor = :valor")
    , @NamedQuery(name = "Irregularidade.findByDtVenc", query = "SELECT i FROM Irregularidade i WHERE i.dtVenc = :dtVenc")
    , @NamedQuery(name = "Irregularidade.findByDtConclPrc", query = "SELECT i FROM Irregularidade i WHERE i.dtConclPrc = :dtConclPrc")
    , @NamedQuery(name = "Irregularidade.findByPermTotal", query = "SELECT i FROM Irregularidade i WHERE i.permTotal = :permTotal")
    , @NamedQuery(name = "Irregularidade.findByPermDilig", query = "SELECT i FROM Irregularidade i WHERE i.permDilig = :permDilig")
    , @NamedQuery(name = "Irregularidade.findByPermCso", query = "SELECT i FROM Irregularidade i WHERE i.permCso = :permCso")
    , @NamedQuery(name = "Irregularidade.findByDiasAtraso", query = "SELECT i FROM Irregularidade i WHERE i.diasAtraso = :diasAtraso")
    , @NamedQuery(name = "Irregularidade.findByIdentific1", query = "SELECT i FROM Irregularidade i WHERE i.identific1 = :identific1")
    , @NamedQuery(name = "Irregularidade.findByIdentific2", query = "SELECT i FROM Irregularidade i WHERE i.identific2 = :identific2")
    , @NamedQuery(name = "Irregularidade.findByIdentific3", query = "SELECT i FROM Irregularidade i WHERE i.identific3 = :identific3")
    , @NamedQuery(name = "Irregularidade.findByCdPrfUndOrigem", query = "SELECT i FROM Irregularidade i WHERE i.cdPrfUndOrigem = :cdPrfUndOrigem")
    , @NamedQuery(name = "Irregularidade.findBySbOrigem", query = "SELECT i FROM Irregularidade i WHERE i.sbOrigem = :sbOrigem")
    , @NamedQuery(name = "Irregularidade.findByDuracaoTarefas", query = "SELECT i FROM Irregularidade i WHERE i.duracaoTarefas = :duracaoTarefas")
    , @NamedQuery(name = "Irregularidade.findByDtLimiteInicial", query = "SELECT i FROM Irregularidade i WHERE i.dtLimiteInicial = :dtLimiteInicial")
    , @NamedQuery(name = "Irregularidade.findByDtEtpAtual", query = "SELECT i FROM Irregularidade i WHERE i.dtEtpAtual = :dtEtpAtual")
    , @NamedQuery(name = "Irregularidade.findByCdUltimaOcr", query = "SELECT i FROM Irregularidade i WHERE i.cdUltimaOcr = :cdUltimaOcr")
    , @NamedQuery(name = "Irregularidade.findByCdUltOcrPrc", query = "SELECT i FROM Irregularidade i WHERE i.cdUltOcrPrc = :cdUltOcrPrc")
    , @NamedQuery(name = "Irregularidade.findByCdUltTarefaPrc", query = "SELECT i FROM Irregularidade i WHERE i.cdUltTarefaPrc = :cdUltTarefaPrc")
    , @NamedQuery(name = "Irregularidade.findByDtDevOcr", query = "SELECT i FROM Irregularidade i WHERE i.dtDevOcr = :dtDevOcr")
    , @NamedQuery(name = "Irregularidade.findByDtSla", query = "SELECT i FROM Irregularidade i WHERE i.dtSla = :dtSla")
    , @NamedQuery(name = "Irregularidade.findByAtraso1n", query = "SELECT i FROM Irregularidade i WHERE i.atraso1n = :atraso1n")
    , @NamedQuery(name = "Irregularidade.findByAtraso2n", query = "SELECT i FROM Irregularidade i WHERE i.atraso2n = :atraso2n")
    , @NamedQuery(name = "Irregularidade.findByCdAgendaPrc", query = "SELECT i FROM Irregularidade i WHERE i.cdAgendaPrc = :cdAgendaPrc")
    , @NamedQuery(name = "Irregularidade.findByCdFasePrc", query = "SELECT i FROM Irregularidade i WHERE i.cdFasePrc = :cdFasePrc")
    , @NamedQuery(name = "Irregularidade.findByCdPrcVinc", query = "SELECT i FROM Irregularidade i WHERE i.cdPrcVinc = :cdPrcVinc")
    , @NamedQuery(name = "Irregularidade.findByCdTipOrigem", query = "SELECT i FROM Irregularidade i WHERE i.cdTipOrigem = :cdTipOrigem")
    , @NamedQuery(name = "Irregularidade.findByDtLimiteCli", query = "SELECT i FROM Irregularidade i WHERE i.dtLimiteCli = :dtLimiteCli")
    , @NamedQuery(name = "Irregularidade.findByDiasAtrasoCli", query = "SELECT i FROM Irregularidade i WHERE i.diasAtrasoCli = :diasAtrasoCli")
    , @NamedQuery(name = "Irregularidade.findByPermCli", query = "SELECT i FROM Irregularidade i WHERE i.permCli = :permCli")
    , @NamedQuery(name = "Irregularidade.findByCdControle", query = "SELECT i FROM Irregularidade i WHERE i.cdControle = :cdControle")
    , @NamedQuery(name = "Irregularidade.findByCdUsuEntd", query = "SELECT i FROM Irregularidade i WHERE i.cdUsuEntd = :cdUsuEntd")
    , @NamedQuery(name = "Irregularidade.findByCdUsuLatl", query = "SELECT i FROM Irregularidade i WHERE i.cdUsuLatl = :cdUsuLatl")
    , @NamedQuery(name = "Irregularidade.findByDtSlaFunci", query = "SELECT i FROM Irregularidade i WHERE i.dtSlaFunci = :dtSlaFunci")
    , @NamedQuery(name = "Irregularidade.findBySituacaoLatl", query = "SELECT i FROM Irregularidade i WHERE i.situacaoLatl = :situacaoLatl")
    , @NamedQuery(name = "Irregularidade.findByCdClassePrc", query = "SELECT i FROM Irregularidade i WHERE i.cdClassePrc = :cdClassePrc")
    , @NamedQuery(name = "Irregularidade.findByEntdForaHoraLim", query = "SELECT i FROM Irregularidade i WHERE i.entdForaHoraLim = :entdForaHoraLim")
    , @NamedQuery(name = "Irregularidade.findByCdSitPrc", query = "SELECT i FROM Irregularidade i WHERE i.cdSitPrc = :cdSitPrc")
    , @NamedQuery(name = "Irregularidade.findByCdUltFlxFase", query = "SELECT i FROM Irregularidade i WHERE i.cdUltFlxFase = :cdUltFlxFase")
    , @NamedQuery(name = "Irregularidade.findByCdUltFlxFaseCtrl", query = "SELECT i FROM Irregularidade i WHERE i.cdUltFlxFaseCtrl = :cdUltFlxFaseCtrl")
    , @NamedQuery(name = "Irregularidade.findByCdUsuStr", query = "SELECT i FROM Irregularidade i WHERE i.cdUsuStr = :cdUsuStr")
    , @NamedQuery(name = "Irregularidade.findByDtLimRepactuada", query = "SELECT i FROM Irregularidade i WHERE i.dtLimRepactuada = :dtLimRepactuada")
    , @NamedQuery(name = "Irregularidade.findByPrazoPacto", query = "SELECT i FROM Irregularidade i WHERE i.prazoPacto = :prazoPacto")
    , @NamedQuery(name = "Irregularidade.findByPactoCliente", query = "SELECT i FROM Irregularidade i WHERE i.pactoCliente = :pactoCliente")
    , @NamedQuery(name = "Irregularidade.findByNmTipAtvd", query = "SELECT i FROM Irregularidade i WHERE i.nmTipAtvd = :nmTipAtvd")
    , @NamedQuery(name = "Irregularidade.findByEtapaAtual", query = "SELECT i FROM Irregularidade i WHERE i.etapaAtual = :etapaAtual")
    , @NamedQuery(name = "Irregularidade.findByFunciRsp", query = "SELECT i FROM Irregularidade i WHERE i.funciRsp = :funciRsp")
    , @NamedQuery(name = "Irregularidade.findByGerResp", query = "SELECT i FROM Irregularidade i WHERE i.gerResp = :gerResp")
    , @NamedQuery(name = "Irregularidade.findByNmTipPrc", query = "SELECT i FROM Irregularidade i WHERE i.nmTipPrc = :nmTipPrc")
    , @NamedQuery(name = "Irregularidade.findByNmOcr", query = "SELECT i FROM Irregularidade i WHERE i.nmOcr = :nmOcr")
    , @NamedQuery(name = "Irregularidade.findByNmDepe", query = "SELECT i FROM Irregularidade i WHERE i.nmDepe = :nmDepe")
    , @NamedQuery(name = "Irregularidade.findByNmCli", query = "SELECT i FROM Irregularidade i WHERE i.nmCli = :nmCli")
    , @NamedQuery(name = "Irregularidade.findByObs", query = "SELECT i FROM Irregularidade i WHERE i.obs = :obs")
    , @NamedQuery(name = "Irregularidade.findByNumeroCorreio", query = "SELECT i FROM Irregularidade i WHERE i.numeroCorreio = :numeroCorreio")
    , @NamedQuery(name = "Irregularidade.findByDataEnvioCorreio", query = "SELECT i FROM Irregularidade i WHERE i.dataEnvioCorreio = :dataEnvioCorreio")
    , @NamedQuery(name = "Irregularidade.findBySituacaoGst", query = "SELECT i FROM Irregularidade i WHERE i.situacaoGst = :situacaoGst")})
public class Irregularidade implements Serializable {

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
    @Column(name = "NM_OCR")
    private String nmOcr;
    @Column(name = "NM_DEPE")
    private String nmDepe;
    @Column(name = "NM_CLI")
    private String nmCli;
    @Column(name = "OBS")
    private String obs;
    @Column(name = "NUMERO_CORREIO")
    private String numeroCorreio;
    @Column(name = "DATA_ENVIO_CORREIO")
    @Temporal(TemporalType.DATE)
    private Date dataEnvioCorreio;
    @Column(name = "SITUACAO_GST")
    private String situacaoGst;

    public Irregularidade() {
    }

    public Irregularidade(Integer cdPrc) {
        this.cdPrc = cdPrc;
    }

    public Irregularidade(Integer cdPrc, Date dtInicioEntd, String nmTipAtvd, String etapaAtual) {
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

    public String getNmOcr() {
        return nmOcr;
    }

    public void setNmOcr(String nmOcr) {
        this.nmOcr = nmOcr;
    }

    public String getNmDepe() {
        return nmDepe;
    }

    public void setNmDepe(String nmDepe) {
        this.nmDepe = nmDepe;
    }

    public String getNmCli() {
        return nmCli;
    }

    public void setNmCli(String nmCli) {
        this.nmCli = nmCli;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getNumeroCorreio() {
        return numeroCorreio;
    }

    public void setNumeroCorreio(String numeroCorreio) {
        this.numeroCorreio = numeroCorreio;
    }

    public Date getDataEnvioCorreio() {
        return dataEnvioCorreio;
    }

    public void setDataEnvioCorreio(Date dataEnvioCorreio) {
        this.dataEnvioCorreio = dataEnvioCorreio;
    }

    public String getSituacaoGst() {
        return situacaoGst;
    }

    public void setSituacaoGst(String situacaoGst) {
        this.situacaoGst = situacaoGst;
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
        if (!(object instanceof Irregularidade)) {
            return false;
        }
        Irregularidade other = (Irregularidade) object;
        if ((this.cdPrc == null && other.cdPrc != null) || (this.cdPrc != null && !this.cdPrc.equals(other.cdPrc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Irregularidade[ cdPrc=" + cdPrc + " ]";
    }
    
}
