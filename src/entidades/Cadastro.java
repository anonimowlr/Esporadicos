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
@Table(name = "tab_cad_npj_incidental_precatorio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cadastro.findAll", query = "SELECT c FROM Cadastro c")
    , @NamedQuery(name = "Cadastro.findByCdPrc", query = "SELECT c FROM Cadastro c WHERE c.cdPrc = :cdPrc")
    , @NamedQuery(name = "Cadastro.findByCdPrfUnd", query = "SELECT c FROM Cadastro c WHERE c.cdPrfUnd = :cdPrfUnd")
    , @NamedQuery(name = "Cadastro.findByCdPrfDepe", query = "SELECT c FROM Cadastro c WHERE c.cdPrfDepe = :cdPrfDepe")
    , @NamedQuery(name = "Cadastro.findByDtEntdPrc", query = "SELECT c FROM Cadastro c WHERE c.dtEntdPrc = :dtEntdPrc")
    , @NamedQuery(name = "Cadastro.findByDtSaidPrc", query = "SELECT c FROM Cadastro c WHERE c.dtSaidPrc = :dtSaidPrc")
    , @NamedQuery(name = "Cadastro.findByCdUsuArea", query = "SELECT c FROM Cadastro c WHERE c.cdUsuArea = :cdUsuArea")
    , @NamedQuery(name = "Cadastro.findByCdUsuEqp", query = "SELECT c FROM Cadastro c WHERE c.cdUsuEqp = :cdUsuEqp")
    , @NamedQuery(name = "Cadastro.findByCdUsuFun", query = "SELECT c FROM Cadastro c WHERE c.cdUsuFun = :cdUsuFun")
    , @NamedQuery(name = "Cadastro.findByCdEtp", query = "SELECT c FROM Cadastro c WHERE c.cdEtp = :cdEtp")
    , @NamedQuery(name = "Cadastro.findByDtLimite", query = "SELECT c FROM Cadastro c WHERE c.dtLimite = :dtLimite")
    , @NamedQuery(name = "Cadastro.findByCdTipPrc", query = "SELECT c FROM Cadastro c WHERE c.cdTipPrc = :cdTipPrc")
    , @NamedQuery(name = "Cadastro.findByCdEqp", query = "SELECT c FROM Cadastro c WHERE c.cdEqp = :cdEqp")
    , @NamedQuery(name = "Cadastro.findByCdPrfOper", query = "SELECT c FROM Cadastro c WHERE c.cdPrfOper = :cdPrfOper")
    , @NamedQuery(name = "Cadastro.findByCdAgrupPrc", query = "SELECT c FROM Cadastro c WHERE c.cdAgrupPrc = :cdAgrupPrc")
    , @NamedQuery(name = "Cadastro.findByCdTipAtend", query = "SELECT c FROM Cadastro c WHERE c.cdTipAtend = :cdTipAtend")
    , @NamedQuery(name = "Cadastro.findByPriorizado", query = "SELECT c FROM Cadastro c WHERE c.priorizado = :priorizado")
    , @NamedQuery(name = "Cadastro.findByCompartilhado", query = "SELECT c FROM Cadastro c WHERE c.compartilhado = :compartilhado")
    , @NamedQuery(name = "Cadastro.findByCdTipAtvd", query = "SELECT c FROM Cadastro c WHERE c.cdTipAtvd = :cdTipAtvd")
    , @NamedQuery(name = "Cadastro.findByCdDetalheOcr", query = "SELECT c FROM Cadastro c WHERE c.cdDetalheOcr = :cdDetalheOcr")
    , @NamedQuery(name = "Cadastro.findBySb", query = "SELECT c FROM Cadastro c WHERE c.sb = :sb")
    , @NamedQuery(name = "Cadastro.findByMatriculaSolicitante", query = "SELECT c FROM Cadastro c WHERE c.matriculaSolicitante = :matriculaSolicitante")
    , @NamedQuery(name = "Cadastro.findByCdCli", query = "SELECT c FROM Cadastro c WHERE c.cdCli = :cdCli")
    , @NamedQuery(name = "Cadastro.findByDtInicioEntd", query = "SELECT c FROM Cadastro c WHERE c.dtInicioEntd = :dtInicioEntd")
    , @NamedQuery(name = "Cadastro.findByValor", query = "SELECT c FROM Cadastro c WHERE c.valor = :valor")
    , @NamedQuery(name = "Cadastro.findByDtVenc", query = "SELECT c FROM Cadastro c WHERE c.dtVenc = :dtVenc")
    , @NamedQuery(name = "Cadastro.findByDtConclPrc", query = "SELECT c FROM Cadastro c WHERE c.dtConclPrc = :dtConclPrc")
    , @NamedQuery(name = "Cadastro.findByPermTotal", query = "SELECT c FROM Cadastro c WHERE c.permTotal = :permTotal")
    , @NamedQuery(name = "Cadastro.findByPermDilig", query = "SELECT c FROM Cadastro c WHERE c.permDilig = :permDilig")
    , @NamedQuery(name = "Cadastro.findByPermCso", query = "SELECT c FROM Cadastro c WHERE c.permCso = :permCso")
    , @NamedQuery(name = "Cadastro.findByDiasAtraso", query = "SELECT c FROM Cadastro c WHERE c.diasAtraso = :diasAtraso")
    , @NamedQuery(name = "Cadastro.findByIdentific1", query = "SELECT c FROM Cadastro c WHERE c.identific1 = :identific1")
    , @NamedQuery(name = "Cadastro.findByIdentific2", query = "SELECT c FROM Cadastro c WHERE c.identific2 = :identific2")
    , @NamedQuery(name = "Cadastro.findByIdentific3", query = "SELECT c FROM Cadastro c WHERE c.identific3 = :identific3")
    , @NamedQuery(name = "Cadastro.findByCdPrfUndOrigem", query = "SELECT c FROM Cadastro c WHERE c.cdPrfUndOrigem = :cdPrfUndOrigem")
    , @NamedQuery(name = "Cadastro.findBySbOrigem", query = "SELECT c FROM Cadastro c WHERE c.sbOrigem = :sbOrigem")
    , @NamedQuery(name = "Cadastro.findByDuracaoTarefas", query = "SELECT c FROM Cadastro c WHERE c.duracaoTarefas = :duracaoTarefas")
    , @NamedQuery(name = "Cadastro.findByDtLimiteInicial", query = "SELECT c FROM Cadastro c WHERE c.dtLimiteInicial = :dtLimiteInicial")
    , @NamedQuery(name = "Cadastro.findByDtEtpAtual", query = "SELECT c FROM Cadastro c WHERE c.dtEtpAtual = :dtEtpAtual")
    , @NamedQuery(name = "Cadastro.findByCdUltimaOcr", query = "SELECT c FROM Cadastro c WHERE c.cdUltimaOcr = :cdUltimaOcr")
    , @NamedQuery(name = "Cadastro.findByCdUltOcrPrc", query = "SELECT c FROM Cadastro c WHERE c.cdUltOcrPrc = :cdUltOcrPrc")
    , @NamedQuery(name = "Cadastro.findByCdUltTarefaPrc", query = "SELECT c FROM Cadastro c WHERE c.cdUltTarefaPrc = :cdUltTarefaPrc")
    , @NamedQuery(name = "Cadastro.findByDtDevOcr", query = "SELECT c FROM Cadastro c WHERE c.dtDevOcr = :dtDevOcr")
    , @NamedQuery(name = "Cadastro.findByDtSla", query = "SELECT c FROM Cadastro c WHERE c.dtSla = :dtSla")
    , @NamedQuery(name = "Cadastro.findByAtraso1n", query = "SELECT c FROM Cadastro c WHERE c.atraso1n = :atraso1n")
    , @NamedQuery(name = "Cadastro.findByAtraso2n", query = "SELECT c FROM Cadastro c WHERE c.atraso2n = :atraso2n")
    , @NamedQuery(name = "Cadastro.findByCdAgendaPrc", query = "SELECT c FROM Cadastro c WHERE c.cdAgendaPrc = :cdAgendaPrc")
    , @NamedQuery(name = "Cadastro.findByCdFasePrc", query = "SELECT c FROM Cadastro c WHERE c.cdFasePrc = :cdFasePrc")
    , @NamedQuery(name = "Cadastro.findByCdPrcVinc", query = "SELECT c FROM Cadastro c WHERE c.cdPrcVinc = :cdPrcVinc")
    , @NamedQuery(name = "Cadastro.findByCdTipOrigem", query = "SELECT c FROM Cadastro c WHERE c.cdTipOrigem = :cdTipOrigem")
    , @NamedQuery(name = "Cadastro.findByDtLimiteCli", query = "SELECT c FROM Cadastro c WHERE c.dtLimiteCli = :dtLimiteCli")
    , @NamedQuery(name = "Cadastro.findByDiasAtrasoCli", query = "SELECT c FROM Cadastro c WHERE c.diasAtrasoCli = :diasAtrasoCli")
    , @NamedQuery(name = "Cadastro.findByPermCli", query = "SELECT c FROM Cadastro c WHERE c.permCli = :permCli")
    , @NamedQuery(name = "Cadastro.findByCdControle", query = "SELECT c FROM Cadastro c WHERE c.cdControle = :cdControle")
    , @NamedQuery(name = "Cadastro.findByCdUsuEntd", query = "SELECT c FROM Cadastro c WHERE c.cdUsuEntd = :cdUsuEntd")
    , @NamedQuery(name = "Cadastro.findByCdUsuLatl", query = "SELECT c FROM Cadastro c WHERE c.cdUsuLatl = :cdUsuLatl")
    , @NamedQuery(name = "Cadastro.findByDtSlaFunci", query = "SELECT c FROM Cadastro c WHERE c.dtSlaFunci = :dtSlaFunci")
    , @NamedQuery(name = "Cadastro.findBySituacaoLatl", query = "SELECT c FROM Cadastro c WHERE c.situacaoLatl = :situacaoLatl")
    , @NamedQuery(name = "Cadastro.findByCdClassePrc", query = "SELECT c FROM Cadastro c WHERE c.cdClassePrc = :cdClassePrc")
    , @NamedQuery(name = "Cadastro.findByEntdForaHoraLim", query = "SELECT c FROM Cadastro c WHERE c.entdForaHoraLim = :entdForaHoraLim")
    , @NamedQuery(name = "Cadastro.findByCdSitPrc", query = "SELECT c FROM Cadastro c WHERE c.cdSitPrc = :cdSitPrc")
    , @NamedQuery(name = "Cadastro.findByCdUltFlxFase", query = "SELECT c FROM Cadastro c WHERE c.cdUltFlxFase = :cdUltFlxFase")
    , @NamedQuery(name = "Cadastro.findByCdUltFlxFaseCtrl", query = "SELECT c FROM Cadastro c WHERE c.cdUltFlxFaseCtrl = :cdUltFlxFaseCtrl")
    , @NamedQuery(name = "Cadastro.findByCdUsuStr", query = "SELECT c FROM Cadastro c WHERE c.cdUsuStr = :cdUsuStr")
    , @NamedQuery(name = "Cadastro.findByDtLimRepactuada", query = "SELECT c FROM Cadastro c WHERE c.dtLimRepactuada = :dtLimRepactuada")
    , @NamedQuery(name = "Cadastro.findByPrazoPacto", query = "SELECT c FROM Cadastro c WHERE c.prazoPacto = :prazoPacto")
    , @NamedQuery(name = "Cadastro.findByPactoCliente", query = "SELECT c FROM Cadastro c WHERE c.pactoCliente = :pactoCliente")
    , @NamedQuery(name = "Cadastro.findByNmTipAtvd", query = "SELECT c FROM Cadastro c WHERE c.nmTipAtvd = :nmTipAtvd")
    , @NamedQuery(name = "Cadastro.findByEtapaAtual", query = "SELECT c FROM Cadastro c WHERE c.etapaAtual = :etapaAtual")
    , @NamedQuery(name = "Cadastro.findByFunciRsp", query = "SELECT c FROM Cadastro c WHERE c.funciRsp = :funciRsp")
    , @NamedQuery(name = "Cadastro.findByGerResp", query = "SELECT c FROM Cadastro c WHERE c.gerResp = :gerResp")
    , @NamedQuery(name = "Cadastro.findByNomeTipoProcesso", query = "SELECT c FROM Cadastro c WHERE c.nomeTipoProcesso = :nomeTipoProcesso")
    , @NamedQuery(name = "Cadastro.findByAdvogadoBb", query = "SELECT c FROM Cadastro c WHERE c.advogadoBb = :advogadoBb")
    , @NamedQuery(name = "Cadastro.findByAjureResponsavel", query = "SELECT c FROM Cadastro c WHERE c.ajureResponsavel = :ajureResponsavel")
    , @NamedQuery(name = "Cadastro.findByObs", query = "SELECT c FROM Cadastro c WHERE c.obs = :obs")})
public class Cadastro implements Serializable {

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
    @Column(name = "NOME_TIPO_PROCESSO")
    private String nomeTipoProcesso;
    @Column(name = "ADVOGADO_BB")
    private String advogadoBb;
    @Column(name = "AJURE_RESPONSAVEL")
    private String ajureResponsavel;
    @Column(name = "OBS")
    private String obs;

    public Cadastro() {
    }

    public Cadastro(Integer cdPrc) {
        this.cdPrc = cdPrc;
    }

    public Cadastro(Integer cdPrc, Date dtInicioEntd, String nmTipAtvd, String etapaAtual) {
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

    public String getNomeTipoProcesso() {
        return nomeTipoProcesso;
    }

    public void setNomeTipoProcesso(String nomeTipoProcesso) {
        this.nomeTipoProcesso = nomeTipoProcesso;
    }

    public String getAdvogadoBb() {
        return advogadoBb;
    }

    public void setAdvogadoBb(String advogadoBb) {
        this.advogadoBb = advogadoBb;
    }

    public String getAjureResponsavel() {
        return ajureResponsavel;
    }

    public void setAjureResponsavel(String ajureResponsavel) {
        this.ajureResponsavel = ajureResponsavel;
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
        hash += (cdPrc != null ? cdPrc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cadastro)) {
            return false;
        }
        Cadastro other = (Cadastro) object;
        if ((this.cdPrc == null && other.cdPrc != null) || (this.cdPrc != null && !this.cdPrc.equals(other.cdPrc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Cadastro[ cdPrc=" + cdPrc + " ]";
    }
    
}
