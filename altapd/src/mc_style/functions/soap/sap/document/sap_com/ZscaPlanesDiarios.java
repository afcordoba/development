/**
 * ZscaPlanesDiarios.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mc_style.functions.soap.sap.document.sap_com;

public class ZscaPlanesDiarios  implements java.io.Serializable {
    private java.lang.String fePlanDiario;

    private java.lang.String encargado;

    private java.lang.String descrEncargado;

    private java.lang.String propTercero;

    private java.lang.String sociedad;

    private java.lang.String descCampo;

    private java.lang.String descLote;

    private java.lang.String maktxCodMatSem;

    private java.lang.String maktxProdCodSapCosech;

    private java.lang.String maktxProdCodSapTerm;

    private java.math.BigDecimal hectareasSembra;

    private java.math.BigDecimal haPlanifHoy;

    private java.math.BigDecimal rindeEstimado;

    private java.math.BigDecimal varCamionesPlanificados;

    private java.lang.String camionesPed;

    private java.lang.String camionesUrg;

    private java.math.BigDecimal varCamionesEnviados;

    private java.lang.String campana;

    private java.lang.String contratistaCose;

    private java.lang.String nombreContratistaCose;

    private java.lang.String centroCalidad;

    private java.lang.String name1Calidad;

    private java.lang.String centroDescarga;

    private java.lang.String name1Descarga;

    private java.lang.String idPlanDiario;

    private java.lang.String idAsignacion;

    private java.lang.String idAsignPos;

    private java.lang.String idPlanificPos;

    private java.lang.String codCampoProp;

    private java.lang.String codLoteProp;

    private java.lang.String codCampoTerc;

    private java.lang.String codLoteTerc;

    private java.lang.String codMatSembrado;

    private java.lang.String prodCosechado;

    private java.lang.String prodTerminado;

    private java.lang.String observaciones;

    private java.lang.String creadoPor;

    private java.lang.String proveedor;

    private java.lang.String objCumplido;

    private java.lang.String estPlanDiario;

    private java.lang.String camionesIng;

    private java.lang.String nombreProveedor;

    private java.math.BigDecimal kgBrutosIngr;

    private java.math.BigDecimal kgTarasIngr;

    private java.math.BigDecimal kgNetosIngr;

    private java.math.BigDecimal rindeBrutoIngr;

    private java.math.BigDecimal rindeNetoIngr;

    public ZscaPlanesDiarios() {
    }

    public ZscaPlanesDiarios(
           java.lang.String fePlanDiario,
           java.lang.String encargado,
           java.lang.String descrEncargado,
           java.lang.String propTercero,
           java.lang.String sociedad,
           java.lang.String descCampo,
           java.lang.String descLote,
           java.lang.String maktxCodMatSem,
           java.lang.String maktxProdCodSapCosech,
           java.lang.String maktxProdCodSapTerm,
           java.math.BigDecimal hectareasSembra,
           java.math.BigDecimal haPlanifHoy,
           java.math.BigDecimal rindeEstimado,
           java.math.BigDecimal varCamionesPlanificados,
           java.lang.String camionesPed,
           java.lang.String camionesUrg,
           java.math.BigDecimal varCamionesEnviados,
           java.lang.String campana,
           java.lang.String contratistaCose,
           java.lang.String nombreContratistaCose,
           java.lang.String centroCalidad,
           java.lang.String name1Calidad,
           java.lang.String centroDescarga,
           java.lang.String name1Descarga,
           java.lang.String idPlanDiario,
           java.lang.String idAsignacion,
           java.lang.String idAsignPos,
           java.lang.String idPlanificPos,
           java.lang.String codCampoProp,
           java.lang.String codLoteProp,
           java.lang.String codCampoTerc,
           java.lang.String codLoteTerc,
           java.lang.String codMatSembrado,
           java.lang.String prodCosechado,
           java.lang.String prodTerminado,
           java.lang.String observaciones,
           java.lang.String creadoPor,
           java.lang.String proveedor,
           java.lang.String objCumplido,
           java.lang.String estPlanDiario,
           java.lang.String camionesIng,
           java.lang.String nombreProveedor,
           java.math.BigDecimal kgBrutosIngr,
           java.math.BigDecimal kgTarasIngr,
           java.math.BigDecimal kgNetosIngr,
           java.math.BigDecimal rindeBrutoIngr,
           java.math.BigDecimal rindeNetoIngr) {
           this.fePlanDiario = fePlanDiario;
           this.encargado = encargado;
           this.descrEncargado = descrEncargado;
           this.propTercero = propTercero;
           this.sociedad = sociedad;
           this.descCampo = descCampo;
           this.descLote = descLote;
           this.maktxCodMatSem = maktxCodMatSem;
           this.maktxProdCodSapCosech = maktxProdCodSapCosech;
           this.maktxProdCodSapTerm = maktxProdCodSapTerm;
           this.hectareasSembra = hectareasSembra;
           this.haPlanifHoy = haPlanifHoy;
           this.rindeEstimado = rindeEstimado;
           this.varCamionesPlanificados = varCamionesPlanificados;
           this.camionesPed = camionesPed;
           this.camionesUrg = camionesUrg;
           this.varCamionesEnviados = varCamionesEnviados;
           this.campana = campana;
           this.contratistaCose = contratistaCose;
           this.nombreContratistaCose = nombreContratistaCose;
           this.centroCalidad = centroCalidad;
           this.name1Calidad = name1Calidad;
           this.centroDescarga = centroDescarga;
           this.name1Descarga = name1Descarga;
           this.idPlanDiario = idPlanDiario;
           this.idAsignacion = idAsignacion;
           this.idAsignPos = idAsignPos;
           this.idPlanificPos = idPlanificPos;
           this.codCampoProp = codCampoProp;
           this.codLoteProp = codLoteProp;
           this.codCampoTerc = codCampoTerc;
           this.codLoteTerc = codLoteTerc;
           this.codMatSembrado = codMatSembrado;
           this.prodCosechado = prodCosechado;
           this.prodTerminado = prodTerminado;
           this.observaciones = observaciones;
           this.creadoPor = creadoPor;
           this.proveedor = proveedor;
           this.objCumplido = objCumplido;
           this.estPlanDiario = estPlanDiario;
           this.camionesIng = camionesIng;
           this.nombreProveedor = nombreProveedor;
           this.kgBrutosIngr = kgBrutosIngr;
           this.kgTarasIngr = kgTarasIngr;
           this.kgNetosIngr = kgNetosIngr;
           this.rindeBrutoIngr = rindeBrutoIngr;
           this.rindeNetoIngr = rindeNetoIngr;
    }


    /**
     * Gets the fePlanDiario value for this ZscaPlanesDiarios.
     * 
     * @return fePlanDiario
     */
    public java.lang.String getFePlanDiario() {
        return fePlanDiario;
    }


    /**
     * Sets the fePlanDiario value for this ZscaPlanesDiarios.
     * 
     * @param fePlanDiario
     */
    public void setFePlanDiario(java.lang.String fePlanDiario) {
        this.fePlanDiario = fePlanDiario;
    }


    /**
     * Gets the encargado value for this ZscaPlanesDiarios.
     * 
     * @return encargado
     */
    public java.lang.String getEncargado() {
        return encargado;
    }


    /**
     * Sets the encargado value for this ZscaPlanesDiarios.
     * 
     * @param encargado
     */
    public void setEncargado(java.lang.String encargado) {
        this.encargado = encargado;
    }


    /**
     * Gets the descrEncargado value for this ZscaPlanesDiarios.
     * 
     * @return descrEncargado
     */
    public java.lang.String getDescrEncargado() {
        return descrEncargado;
    }


    /**
     * Sets the descrEncargado value for this ZscaPlanesDiarios.
     * 
     * @param descrEncargado
     */
    public void setDescrEncargado(java.lang.String descrEncargado) {
        this.descrEncargado = descrEncargado;
    }


    /**
     * Gets the propTercero value for this ZscaPlanesDiarios.
     * 
     * @return propTercero
     */
    public java.lang.String getPropTercero() {
        return propTercero;
    }


    /**
     * Sets the propTercero value for this ZscaPlanesDiarios.
     * 
     * @param propTercero
     */
    public void setPropTercero(java.lang.String propTercero) {
        this.propTercero = propTercero;
    }


    /**
     * Gets the sociedad value for this ZscaPlanesDiarios.
     * 
     * @return sociedad
     */
    public java.lang.String getSociedad() {
        return sociedad;
    }


    /**
     * Sets the sociedad value for this ZscaPlanesDiarios.
     * 
     * @param sociedad
     */
    public void setSociedad(java.lang.String sociedad) {
        this.sociedad = sociedad;
    }


    /**
     * Gets the descCampo value for this ZscaPlanesDiarios.
     * 
     * @return descCampo
     */
    public java.lang.String getDescCampo() {
        return descCampo;
    }


    /**
     * Sets the descCampo value for this ZscaPlanesDiarios.
     * 
     * @param descCampo
     */
    public void setDescCampo(java.lang.String descCampo) {
        this.descCampo = descCampo;
    }


    /**
     * Gets the descLote value for this ZscaPlanesDiarios.
     * 
     * @return descLote
     */
    public java.lang.String getDescLote() {
        return descLote;
    }


    /**
     * Sets the descLote value for this ZscaPlanesDiarios.
     * 
     * @param descLote
     */
    public void setDescLote(java.lang.String descLote) {
        this.descLote = descLote;
    }


    /**
     * Gets the maktxCodMatSem value for this ZscaPlanesDiarios.
     * 
     * @return maktxCodMatSem
     */
    public java.lang.String getMaktxCodMatSem() {
        return maktxCodMatSem;
    }


    /**
     * Sets the maktxCodMatSem value for this ZscaPlanesDiarios.
     * 
     * @param maktxCodMatSem
     */
    public void setMaktxCodMatSem(java.lang.String maktxCodMatSem) {
        this.maktxCodMatSem = maktxCodMatSem;
    }


    /**
     * Gets the maktxProdCodSapCosech value for this ZscaPlanesDiarios.
     * 
     * @return maktxProdCodSapCosech
     */
    public java.lang.String getMaktxProdCodSapCosech() {
        return maktxProdCodSapCosech;
    }


    /**
     * Sets the maktxProdCodSapCosech value for this ZscaPlanesDiarios.
     * 
     * @param maktxProdCodSapCosech
     */
    public void setMaktxProdCodSapCosech(java.lang.String maktxProdCodSapCosech) {
        this.maktxProdCodSapCosech = maktxProdCodSapCosech;
    }


    /**
     * Gets the maktxProdCodSapTerm value for this ZscaPlanesDiarios.
     * 
     * @return maktxProdCodSapTerm
     */
    public java.lang.String getMaktxProdCodSapTerm() {
        return maktxProdCodSapTerm;
    }


    /**
     * Sets the maktxProdCodSapTerm value for this ZscaPlanesDiarios.
     * 
     * @param maktxProdCodSapTerm
     */
    public void setMaktxProdCodSapTerm(java.lang.String maktxProdCodSapTerm) {
        this.maktxProdCodSapTerm = maktxProdCodSapTerm;
    }


    /**
     * Gets the hectareasSembra value for this ZscaPlanesDiarios.
     * 
     * @return hectareasSembra
     */
    public java.math.BigDecimal getHectareasSembra() {
        return hectareasSembra;
    }


    /**
     * Sets the hectareasSembra value for this ZscaPlanesDiarios.
     * 
     * @param hectareasSembra
     */
    public void setHectareasSembra(java.math.BigDecimal hectareasSembra) {
        this.hectareasSembra = hectareasSembra;
    }


    /**
     * Gets the haPlanifHoy value for this ZscaPlanesDiarios.
     * 
     * @return haPlanifHoy
     */
    public java.math.BigDecimal getHaPlanifHoy() {
        return haPlanifHoy;
    }


    /**
     * Sets the haPlanifHoy value for this ZscaPlanesDiarios.
     * 
     * @param haPlanifHoy
     */
    public void setHaPlanifHoy(java.math.BigDecimal haPlanifHoy) {
        this.haPlanifHoy = haPlanifHoy;
    }


    /**
     * Gets the rindeEstimado value for this ZscaPlanesDiarios.
     * 
     * @return rindeEstimado
     */
    public java.math.BigDecimal getRindeEstimado() {
        return rindeEstimado;
    }


    /**
     * Sets the rindeEstimado value for this ZscaPlanesDiarios.
     * 
     * @param rindeEstimado
     */
    public void setRindeEstimado(java.math.BigDecimal rindeEstimado) {
        this.rindeEstimado = rindeEstimado;
    }


    /**
     * Gets the varCamionesPlanificados value for this ZscaPlanesDiarios.
     * 
     * @return varCamionesPlanificados
     */
    public java.math.BigDecimal getVarCamionesPlanificados() {
        return varCamionesPlanificados;
    }


    /**
     * Sets the varCamionesPlanificados value for this ZscaPlanesDiarios.
     * 
     * @param varCamionesPlanificados
     */
    public void setVarCamionesPlanificados(java.math.BigDecimal varCamionesPlanificados) {
        this.varCamionesPlanificados = varCamionesPlanificados;
    }


    /**
     * Gets the camionesPed value for this ZscaPlanesDiarios.
     * 
     * @return camionesPed
     */
    public java.lang.String getCamionesPed() {
        return camionesPed;
    }


    /**
     * Sets the camionesPed value for this ZscaPlanesDiarios.
     * 
     * @param camionesPed
     */
    public void setCamionesPed(java.lang.String camionesPed) {
        this.camionesPed = camionesPed;
    }


    /**
     * Gets the camionesUrg value for this ZscaPlanesDiarios.
     * 
     * @return camionesUrg
     */
    public java.lang.String getCamionesUrg() {
        return camionesUrg;
    }


    /**
     * Sets the camionesUrg value for this ZscaPlanesDiarios.
     * 
     * @param camionesUrg
     */
    public void setCamionesUrg(java.lang.String camionesUrg) {
        this.camionesUrg = camionesUrg;
    }


    /**
     * Gets the varCamionesEnviados value for this ZscaPlanesDiarios.
     * 
     * @return varCamionesEnviados
     */
    public java.math.BigDecimal getVarCamionesEnviados() {
        return varCamionesEnviados;
    }


    /**
     * Sets the varCamionesEnviados value for this ZscaPlanesDiarios.
     * 
     * @param varCamionesEnviados
     */
    public void setVarCamionesEnviados(java.math.BigDecimal varCamionesEnviados) {
        this.varCamionesEnviados = varCamionesEnviados;
    }


    /**
     * Gets the campana value for this ZscaPlanesDiarios.
     * 
     * @return campana
     */
    public java.lang.String getCampana() {
        return campana;
    }


    /**
     * Sets the campana value for this ZscaPlanesDiarios.
     * 
     * @param campana
     */
    public void setCampana(java.lang.String campana) {
        this.campana = campana;
    }


    /**
     * Gets the contratistaCose value for this ZscaPlanesDiarios.
     * 
     * @return contratistaCose
     */
    public java.lang.String getContratistaCose() {
        return contratistaCose;
    }


    /**
     * Sets the contratistaCose value for this ZscaPlanesDiarios.
     * 
     * @param contratistaCose
     */
    public void setContratistaCose(java.lang.String contratistaCose) {
        this.contratistaCose = contratistaCose;
    }


    /**
     * Gets the nombreContratistaCose value for this ZscaPlanesDiarios.
     * 
     * @return nombreContratistaCose
     */
    public java.lang.String getNombreContratistaCose() {
        return nombreContratistaCose;
    }


    /**
     * Sets the nombreContratistaCose value for this ZscaPlanesDiarios.
     * 
     * @param nombreContratistaCose
     */
    public void setNombreContratistaCose(java.lang.String nombreContratistaCose) {
        this.nombreContratistaCose = nombreContratistaCose;
    }


    /**
     * Gets the centroCalidad value for this ZscaPlanesDiarios.
     * 
     * @return centroCalidad
     */
    public java.lang.String getCentroCalidad() {
        return centroCalidad;
    }


    /**
     * Sets the centroCalidad value for this ZscaPlanesDiarios.
     * 
     * @param centroCalidad
     */
    public void setCentroCalidad(java.lang.String centroCalidad) {
        this.centroCalidad = centroCalidad;
    }


    /**
     * Gets the name1Calidad value for this ZscaPlanesDiarios.
     * 
     * @return name1Calidad
     */
    public java.lang.String getName1Calidad() {
        return name1Calidad;
    }


    /**
     * Sets the name1Calidad value for this ZscaPlanesDiarios.
     * 
     * @param name1Calidad
     */
    public void setName1Calidad(java.lang.String name1Calidad) {
        this.name1Calidad = name1Calidad;
    }


    /**
     * Gets the centroDescarga value for this ZscaPlanesDiarios.
     * 
     * @return centroDescarga
     */
    public java.lang.String getCentroDescarga() {
        return centroDescarga;
    }


    /**
     * Sets the centroDescarga value for this ZscaPlanesDiarios.
     * 
     * @param centroDescarga
     */
    public void setCentroDescarga(java.lang.String centroDescarga) {
        this.centroDescarga = centroDescarga;
    }


    /**
     * Gets the name1Descarga value for this ZscaPlanesDiarios.
     * 
     * @return name1Descarga
     */
    public java.lang.String getName1Descarga() {
        return name1Descarga;
    }


    /**
     * Sets the name1Descarga value for this ZscaPlanesDiarios.
     * 
     * @param name1Descarga
     */
    public void setName1Descarga(java.lang.String name1Descarga) {
        this.name1Descarga = name1Descarga;
    }


    /**
     * Gets the idPlanDiario value for this ZscaPlanesDiarios.
     * 
     * @return idPlanDiario
     */
    public java.lang.String getIdPlanDiario() {
        return idPlanDiario;
    }


    /**
     * Sets the idPlanDiario value for this ZscaPlanesDiarios.
     * 
     * @param idPlanDiario
     */
    public void setIdPlanDiario(java.lang.String idPlanDiario) {
        this.idPlanDiario = idPlanDiario;
    }


    /**
     * Gets the idAsignacion value for this ZscaPlanesDiarios.
     * 
     * @return idAsignacion
     */
    public java.lang.String getIdAsignacion() {
        return idAsignacion;
    }


    /**
     * Sets the idAsignacion value for this ZscaPlanesDiarios.
     * 
     * @param idAsignacion
     */
    public void setIdAsignacion(java.lang.String idAsignacion) {
        this.idAsignacion = idAsignacion;
    }


    /**
     * Gets the idAsignPos value for this ZscaPlanesDiarios.
     * 
     * @return idAsignPos
     */
    public java.lang.String getIdAsignPos() {
        return idAsignPos;
    }


    /**
     * Sets the idAsignPos value for this ZscaPlanesDiarios.
     * 
     * @param idAsignPos
     */
    public void setIdAsignPos(java.lang.String idAsignPos) {
        this.idAsignPos = idAsignPos;
    }


    /**
     * Gets the idPlanificPos value for this ZscaPlanesDiarios.
     * 
     * @return idPlanificPos
     */
    public java.lang.String getIdPlanificPos() {
        return idPlanificPos;
    }


    /**
     * Sets the idPlanificPos value for this ZscaPlanesDiarios.
     * 
     * @param idPlanificPos
     */
    public void setIdPlanificPos(java.lang.String idPlanificPos) {
        this.idPlanificPos = idPlanificPos;
    }


    /**
     * Gets the codCampoProp value for this ZscaPlanesDiarios.
     * 
     * @return codCampoProp
     */
    public java.lang.String getCodCampoProp() {
        return codCampoProp;
    }


    /**
     * Sets the codCampoProp value for this ZscaPlanesDiarios.
     * 
     * @param codCampoProp
     */
    public void setCodCampoProp(java.lang.String codCampoProp) {
        this.codCampoProp = codCampoProp;
    }


    /**
     * Gets the codLoteProp value for this ZscaPlanesDiarios.
     * 
     * @return codLoteProp
     */
    public java.lang.String getCodLoteProp() {
        return codLoteProp;
    }


    /**
     * Sets the codLoteProp value for this ZscaPlanesDiarios.
     * 
     * @param codLoteProp
     */
    public void setCodLoteProp(java.lang.String codLoteProp) {
        this.codLoteProp = codLoteProp;
    }


    /**
     * Gets the codCampoTerc value for this ZscaPlanesDiarios.
     * 
     * @return codCampoTerc
     */
    public java.lang.String getCodCampoTerc() {
        return codCampoTerc;
    }


    /**
     * Sets the codCampoTerc value for this ZscaPlanesDiarios.
     * 
     * @param codCampoTerc
     */
    public void setCodCampoTerc(java.lang.String codCampoTerc) {
        this.codCampoTerc = codCampoTerc;
    }


    /**
     * Gets the codLoteTerc value for this ZscaPlanesDiarios.
     * 
     * @return codLoteTerc
     */
    public java.lang.String getCodLoteTerc() {
        return codLoteTerc;
    }


    /**
     * Sets the codLoteTerc value for this ZscaPlanesDiarios.
     * 
     * @param codLoteTerc
     */
    public void setCodLoteTerc(java.lang.String codLoteTerc) {
        this.codLoteTerc = codLoteTerc;
    }


    /**
     * Gets the codMatSembrado value for this ZscaPlanesDiarios.
     * 
     * @return codMatSembrado
     */
    public java.lang.String getCodMatSembrado() {
        return codMatSembrado;
    }


    /**
     * Sets the codMatSembrado value for this ZscaPlanesDiarios.
     * 
     * @param codMatSembrado
     */
    public void setCodMatSembrado(java.lang.String codMatSembrado) {
        this.codMatSembrado = codMatSembrado;
    }


    /**
     * Gets the prodCosechado value for this ZscaPlanesDiarios.
     * 
     * @return prodCosechado
     */
    public java.lang.String getProdCosechado() {
        return prodCosechado;
    }


    /**
     * Sets the prodCosechado value for this ZscaPlanesDiarios.
     * 
     * @param prodCosechado
     */
    public void setProdCosechado(java.lang.String prodCosechado) {
        this.prodCosechado = prodCosechado;
    }


    /**
     * Gets the prodTerminado value for this ZscaPlanesDiarios.
     * 
     * @return prodTerminado
     */
    public java.lang.String getProdTerminado() {
        return prodTerminado;
    }


    /**
     * Sets the prodTerminado value for this ZscaPlanesDiarios.
     * 
     * @param prodTerminado
     */
    public void setProdTerminado(java.lang.String prodTerminado) {
        this.prodTerminado = prodTerminado;
    }


    /**
     * Gets the observaciones value for this ZscaPlanesDiarios.
     * 
     * @return observaciones
     */
    public java.lang.String getObservaciones() {
        return observaciones;
    }


    /**
     * Sets the observaciones value for this ZscaPlanesDiarios.
     * 
     * @param observaciones
     */
    public void setObservaciones(java.lang.String observaciones) {
        this.observaciones = observaciones;
    }


    /**
     * Gets the creadoPor value for this ZscaPlanesDiarios.
     * 
     * @return creadoPor
     */
    public java.lang.String getCreadoPor() {
        return creadoPor;
    }


    /**
     * Sets the creadoPor value for this ZscaPlanesDiarios.
     * 
     * @param creadoPor
     */
    public void setCreadoPor(java.lang.String creadoPor) {
        this.creadoPor = creadoPor;
    }


    /**
     * Gets the proveedor value for this ZscaPlanesDiarios.
     * 
     * @return proveedor
     */
    public java.lang.String getProveedor() {
        return proveedor;
    }


    /**
     * Sets the proveedor value for this ZscaPlanesDiarios.
     * 
     * @param proveedor
     */
    public void setProveedor(java.lang.String proveedor) {
        this.proveedor = proveedor;
    }


    /**
     * Gets the objCumplido value for this ZscaPlanesDiarios.
     * 
     * @return objCumplido
     */
    public java.lang.String getObjCumplido() {
        return objCumplido;
    }


    /**
     * Sets the objCumplido value for this ZscaPlanesDiarios.
     * 
     * @param objCumplido
     */
    public void setObjCumplido(java.lang.String objCumplido) {
        this.objCumplido = objCumplido;
    }


    /**
     * Gets the estPlanDiario value for this ZscaPlanesDiarios.
     * 
     * @return estPlanDiario
     */
    public java.lang.String getEstPlanDiario() {
        return estPlanDiario;
    }


    /**
     * Sets the estPlanDiario value for this ZscaPlanesDiarios.
     * 
     * @param estPlanDiario
     */
    public void setEstPlanDiario(java.lang.String estPlanDiario) {
        this.estPlanDiario = estPlanDiario;
    }


    /**
     * Gets the camionesIng value for this ZscaPlanesDiarios.
     * 
     * @return camionesIng
     */
    public java.lang.String getCamionesIng() {
        return camionesIng;
    }


    /**
     * Sets the camionesIng value for this ZscaPlanesDiarios.
     * 
     * @param camionesIng
     */
    public void setCamionesIng(java.lang.String camionesIng) {
        this.camionesIng = camionesIng;
    }


    /**
     * Gets the nombreProveedor value for this ZscaPlanesDiarios.
     * 
     * @return nombreProveedor
     */
    public java.lang.String getNombreProveedor() {
        return nombreProveedor;
    }


    /**
     * Sets the nombreProveedor value for this ZscaPlanesDiarios.
     * 
     * @param nombreProveedor
     */
    public void setNombreProveedor(java.lang.String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }


    /**
     * Gets the kgBrutosIngr value for this ZscaPlanesDiarios.
     * 
     * @return kgBrutosIngr
     */
    public java.math.BigDecimal getKgBrutosIngr() {
        return kgBrutosIngr;
    }


    /**
     * Sets the kgBrutosIngr value for this ZscaPlanesDiarios.
     * 
     * @param kgBrutosIngr
     */
    public void setKgBrutosIngr(java.math.BigDecimal kgBrutosIngr) {
        this.kgBrutosIngr = kgBrutosIngr;
    }


    /**
     * Gets the kgTarasIngr value for this ZscaPlanesDiarios.
     * 
     * @return kgTarasIngr
     */
    public java.math.BigDecimal getKgTarasIngr() {
        return kgTarasIngr;
    }


    /**
     * Sets the kgTarasIngr value for this ZscaPlanesDiarios.
     * 
     * @param kgTarasIngr
     */
    public void setKgTarasIngr(java.math.BigDecimal kgTarasIngr) {
        this.kgTarasIngr = kgTarasIngr;
    }


    /**
     * Gets the kgNetosIngr value for this ZscaPlanesDiarios.
     * 
     * @return kgNetosIngr
     */
    public java.math.BigDecimal getKgNetosIngr() {
        return kgNetosIngr;
    }


    /**
     * Sets the kgNetosIngr value for this ZscaPlanesDiarios.
     * 
     * @param kgNetosIngr
     */
    public void setKgNetosIngr(java.math.BigDecimal kgNetosIngr) {
        this.kgNetosIngr = kgNetosIngr;
    }


    /**
     * Gets the rindeBrutoIngr value for this ZscaPlanesDiarios.
     * 
     * @return rindeBrutoIngr
     */
    public java.math.BigDecimal getRindeBrutoIngr() {
        return rindeBrutoIngr;
    }


    /**
     * Sets the rindeBrutoIngr value for this ZscaPlanesDiarios.
     * 
     * @param rindeBrutoIngr
     */
    public void setRindeBrutoIngr(java.math.BigDecimal rindeBrutoIngr) {
        this.rindeBrutoIngr = rindeBrutoIngr;
    }


    /**
     * Gets the rindeNetoIngr value for this ZscaPlanesDiarios.
     * 
     * @return rindeNetoIngr
     */
    public java.math.BigDecimal getRindeNetoIngr() {
        return rindeNetoIngr;
    }


    /**
     * Sets the rindeNetoIngr value for this ZscaPlanesDiarios.
     * 
     * @param rindeNetoIngr
     */
    public void setRindeNetoIngr(java.math.BigDecimal rindeNetoIngr) {
        this.rindeNetoIngr = rindeNetoIngr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZscaPlanesDiarios)) return false;
        ZscaPlanesDiarios other = (ZscaPlanesDiarios) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fePlanDiario==null && other.getFePlanDiario()==null) || 
             (this.fePlanDiario!=null &&
              this.fePlanDiario.equals(other.getFePlanDiario()))) &&
            ((this.encargado==null && other.getEncargado()==null) || 
             (this.encargado!=null &&
              this.encargado.equals(other.getEncargado()))) &&
            ((this.descrEncargado==null && other.getDescrEncargado()==null) || 
             (this.descrEncargado!=null &&
              this.descrEncargado.equals(other.getDescrEncargado()))) &&
            ((this.propTercero==null && other.getPropTercero()==null) || 
             (this.propTercero!=null &&
              this.propTercero.equals(other.getPropTercero()))) &&
            ((this.sociedad==null && other.getSociedad()==null) || 
             (this.sociedad!=null &&
              this.sociedad.equals(other.getSociedad()))) &&
            ((this.descCampo==null && other.getDescCampo()==null) || 
             (this.descCampo!=null &&
              this.descCampo.equals(other.getDescCampo()))) &&
            ((this.descLote==null && other.getDescLote()==null) || 
             (this.descLote!=null &&
              this.descLote.equals(other.getDescLote()))) &&
            ((this.maktxCodMatSem==null && other.getMaktxCodMatSem()==null) || 
             (this.maktxCodMatSem!=null &&
              this.maktxCodMatSem.equals(other.getMaktxCodMatSem()))) &&
            ((this.maktxProdCodSapCosech==null && other.getMaktxProdCodSapCosech()==null) || 
             (this.maktxProdCodSapCosech!=null &&
              this.maktxProdCodSapCosech.equals(other.getMaktxProdCodSapCosech()))) &&
            ((this.maktxProdCodSapTerm==null && other.getMaktxProdCodSapTerm()==null) || 
             (this.maktxProdCodSapTerm!=null &&
              this.maktxProdCodSapTerm.equals(other.getMaktxProdCodSapTerm()))) &&
            ((this.hectareasSembra==null && other.getHectareasSembra()==null) || 
             (this.hectareasSembra!=null &&
              this.hectareasSembra.equals(other.getHectareasSembra()))) &&
            ((this.haPlanifHoy==null && other.getHaPlanifHoy()==null) || 
             (this.haPlanifHoy!=null &&
              this.haPlanifHoy.equals(other.getHaPlanifHoy()))) &&
            ((this.rindeEstimado==null && other.getRindeEstimado()==null) || 
             (this.rindeEstimado!=null &&
              this.rindeEstimado.equals(other.getRindeEstimado()))) &&
            ((this.varCamionesPlanificados==null && other.getVarCamionesPlanificados()==null) || 
             (this.varCamionesPlanificados!=null &&
              this.varCamionesPlanificados.equals(other.getVarCamionesPlanificados()))) &&
            ((this.camionesPed==null && other.getCamionesPed()==null) || 
             (this.camionesPed!=null &&
              this.camionesPed.equals(other.getCamionesPed()))) &&
            ((this.camionesUrg==null && other.getCamionesUrg()==null) || 
             (this.camionesUrg!=null &&
              this.camionesUrg.equals(other.getCamionesUrg()))) &&
            ((this.varCamionesEnviados==null && other.getVarCamionesEnviados()==null) || 
             (this.varCamionesEnviados!=null &&
              this.varCamionesEnviados.equals(other.getVarCamionesEnviados()))) &&
            ((this.campana==null && other.getCampana()==null) || 
             (this.campana!=null &&
              this.campana.equals(other.getCampana()))) &&
            ((this.contratistaCose==null && other.getContratistaCose()==null) || 
             (this.contratistaCose!=null &&
              this.contratistaCose.equals(other.getContratistaCose()))) &&
            ((this.nombreContratistaCose==null && other.getNombreContratistaCose()==null) || 
             (this.nombreContratistaCose!=null &&
              this.nombreContratistaCose.equals(other.getNombreContratistaCose()))) &&
            ((this.centroCalidad==null && other.getCentroCalidad()==null) || 
             (this.centroCalidad!=null &&
              this.centroCalidad.equals(other.getCentroCalidad()))) &&
            ((this.name1Calidad==null && other.getName1Calidad()==null) || 
             (this.name1Calidad!=null &&
              this.name1Calidad.equals(other.getName1Calidad()))) &&
            ((this.centroDescarga==null && other.getCentroDescarga()==null) || 
             (this.centroDescarga!=null &&
              this.centroDescarga.equals(other.getCentroDescarga()))) &&
            ((this.name1Descarga==null && other.getName1Descarga()==null) || 
             (this.name1Descarga!=null &&
              this.name1Descarga.equals(other.getName1Descarga()))) &&
            ((this.idPlanDiario==null && other.getIdPlanDiario()==null) || 
             (this.idPlanDiario!=null &&
              this.idPlanDiario.equals(other.getIdPlanDiario()))) &&
            ((this.idAsignacion==null && other.getIdAsignacion()==null) || 
             (this.idAsignacion!=null &&
              this.idAsignacion.equals(other.getIdAsignacion()))) &&
            ((this.idAsignPos==null && other.getIdAsignPos()==null) || 
             (this.idAsignPos!=null &&
              this.idAsignPos.equals(other.getIdAsignPos()))) &&
            ((this.idPlanificPos==null && other.getIdPlanificPos()==null) || 
             (this.idPlanificPos!=null &&
              this.idPlanificPos.equals(other.getIdPlanificPos()))) &&
            ((this.codCampoProp==null && other.getCodCampoProp()==null) || 
             (this.codCampoProp!=null &&
              this.codCampoProp.equals(other.getCodCampoProp()))) &&
            ((this.codLoteProp==null && other.getCodLoteProp()==null) || 
             (this.codLoteProp!=null &&
              this.codLoteProp.equals(other.getCodLoteProp()))) &&
            ((this.codCampoTerc==null && other.getCodCampoTerc()==null) || 
             (this.codCampoTerc!=null &&
              this.codCampoTerc.equals(other.getCodCampoTerc()))) &&
            ((this.codLoteTerc==null && other.getCodLoteTerc()==null) || 
             (this.codLoteTerc!=null &&
              this.codLoteTerc.equals(other.getCodLoteTerc()))) &&
            ((this.codMatSembrado==null && other.getCodMatSembrado()==null) || 
             (this.codMatSembrado!=null &&
              this.codMatSembrado.equals(other.getCodMatSembrado()))) &&
            ((this.prodCosechado==null && other.getProdCosechado()==null) || 
             (this.prodCosechado!=null &&
              this.prodCosechado.equals(other.getProdCosechado()))) &&
            ((this.prodTerminado==null && other.getProdTerminado()==null) || 
             (this.prodTerminado!=null &&
              this.prodTerminado.equals(other.getProdTerminado()))) &&
            ((this.observaciones==null && other.getObservaciones()==null) || 
             (this.observaciones!=null &&
              this.observaciones.equals(other.getObservaciones()))) &&
            ((this.creadoPor==null && other.getCreadoPor()==null) || 
             (this.creadoPor!=null &&
              this.creadoPor.equals(other.getCreadoPor()))) &&
            ((this.proveedor==null && other.getProveedor()==null) || 
             (this.proveedor!=null &&
              this.proveedor.equals(other.getProveedor()))) &&
            ((this.objCumplido==null && other.getObjCumplido()==null) || 
             (this.objCumplido!=null &&
              this.objCumplido.equals(other.getObjCumplido()))) &&
            ((this.estPlanDiario==null && other.getEstPlanDiario()==null) || 
             (this.estPlanDiario!=null &&
              this.estPlanDiario.equals(other.getEstPlanDiario()))) &&
            ((this.camionesIng==null && other.getCamionesIng()==null) || 
             (this.camionesIng!=null &&
              this.camionesIng.equals(other.getCamionesIng()))) &&
            ((this.nombreProveedor==null && other.getNombreProveedor()==null) || 
             (this.nombreProveedor!=null &&
              this.nombreProveedor.equals(other.getNombreProveedor()))) &&
            ((this.kgBrutosIngr==null && other.getKgBrutosIngr()==null) || 
             (this.kgBrutosIngr!=null &&
              this.kgBrutosIngr.equals(other.getKgBrutosIngr()))) &&
            ((this.kgTarasIngr==null && other.getKgTarasIngr()==null) || 
             (this.kgTarasIngr!=null &&
              this.kgTarasIngr.equals(other.getKgTarasIngr()))) &&
            ((this.kgNetosIngr==null && other.getKgNetosIngr()==null) || 
             (this.kgNetosIngr!=null &&
              this.kgNetosIngr.equals(other.getKgNetosIngr()))) &&
            ((this.rindeBrutoIngr==null && other.getRindeBrutoIngr()==null) || 
             (this.rindeBrutoIngr!=null &&
              this.rindeBrutoIngr.equals(other.getRindeBrutoIngr()))) &&
            ((this.rindeNetoIngr==null && other.getRindeNetoIngr()==null) || 
             (this.rindeNetoIngr!=null &&
              this.rindeNetoIngr.equals(other.getRindeNetoIngr())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getFePlanDiario() != null) {
            _hashCode += getFePlanDiario().hashCode();
        }
        if (getEncargado() != null) {
            _hashCode += getEncargado().hashCode();
        }
        if (getDescrEncargado() != null) {
            _hashCode += getDescrEncargado().hashCode();
        }
        if (getPropTercero() != null) {
            _hashCode += getPropTercero().hashCode();
        }
        if (getSociedad() != null) {
            _hashCode += getSociedad().hashCode();
        }
        if (getDescCampo() != null) {
            _hashCode += getDescCampo().hashCode();
        }
        if (getDescLote() != null) {
            _hashCode += getDescLote().hashCode();
        }
        if (getMaktxCodMatSem() != null) {
            _hashCode += getMaktxCodMatSem().hashCode();
        }
        if (getMaktxProdCodSapCosech() != null) {
            _hashCode += getMaktxProdCodSapCosech().hashCode();
        }
        if (getMaktxProdCodSapTerm() != null) {
            _hashCode += getMaktxProdCodSapTerm().hashCode();
        }
        if (getHectareasSembra() != null) {
            _hashCode += getHectareasSembra().hashCode();
        }
        if (getHaPlanifHoy() != null) {
            _hashCode += getHaPlanifHoy().hashCode();
        }
        if (getRindeEstimado() != null) {
            _hashCode += getRindeEstimado().hashCode();
        }
        if (getVarCamionesPlanificados() != null) {
            _hashCode += getVarCamionesPlanificados().hashCode();
        }
        if (getCamionesPed() != null) {
            _hashCode += getCamionesPed().hashCode();
        }
        if (getCamionesUrg() != null) {
            _hashCode += getCamionesUrg().hashCode();
        }
        if (getVarCamionesEnviados() != null) {
            _hashCode += getVarCamionesEnviados().hashCode();
        }
        if (getCampana() != null) {
            _hashCode += getCampana().hashCode();
        }
        if (getContratistaCose() != null) {
            _hashCode += getContratistaCose().hashCode();
        }
        if (getNombreContratistaCose() != null) {
            _hashCode += getNombreContratistaCose().hashCode();
        }
        if (getCentroCalidad() != null) {
            _hashCode += getCentroCalidad().hashCode();
        }
        if (getName1Calidad() != null) {
            _hashCode += getName1Calidad().hashCode();
        }
        if (getCentroDescarga() != null) {
            _hashCode += getCentroDescarga().hashCode();
        }
        if (getName1Descarga() != null) {
            _hashCode += getName1Descarga().hashCode();
        }
        if (getIdPlanDiario() != null) {
            _hashCode += getIdPlanDiario().hashCode();
        }
        if (getIdAsignacion() != null) {
            _hashCode += getIdAsignacion().hashCode();
        }
        if (getIdAsignPos() != null) {
            _hashCode += getIdAsignPos().hashCode();
        }
        if (getIdPlanificPos() != null) {
            _hashCode += getIdPlanificPos().hashCode();
        }
        if (getCodCampoProp() != null) {
            _hashCode += getCodCampoProp().hashCode();
        }
        if (getCodLoteProp() != null) {
            _hashCode += getCodLoteProp().hashCode();
        }
        if (getCodCampoTerc() != null) {
            _hashCode += getCodCampoTerc().hashCode();
        }
        if (getCodLoteTerc() != null) {
            _hashCode += getCodLoteTerc().hashCode();
        }
        if (getCodMatSembrado() != null) {
            _hashCode += getCodMatSembrado().hashCode();
        }
        if (getProdCosechado() != null) {
            _hashCode += getProdCosechado().hashCode();
        }
        if (getProdTerminado() != null) {
            _hashCode += getProdTerminado().hashCode();
        }
        if (getObservaciones() != null) {
            _hashCode += getObservaciones().hashCode();
        }
        if (getCreadoPor() != null) {
            _hashCode += getCreadoPor().hashCode();
        }
        if (getProveedor() != null) {
            _hashCode += getProveedor().hashCode();
        }
        if (getObjCumplido() != null) {
            _hashCode += getObjCumplido().hashCode();
        }
        if (getEstPlanDiario() != null) {
            _hashCode += getEstPlanDiario().hashCode();
        }
        if (getCamionesIng() != null) {
            _hashCode += getCamionesIng().hashCode();
        }
        if (getNombreProveedor() != null) {
            _hashCode += getNombreProveedor().hashCode();
        }
        if (getKgBrutosIngr() != null) {
            _hashCode += getKgBrutosIngr().hashCode();
        }
        if (getKgTarasIngr() != null) {
            _hashCode += getKgTarasIngr().hashCode();
        }
        if (getKgNetosIngr() != null) {
            _hashCode += getKgNetosIngr().hashCode();
        }
        if (getRindeBrutoIngr() != null) {
            _hashCode += getRindeBrutoIngr().hashCode();
        }
        if (getRindeNetoIngr() != null) {
            _hashCode += getRindeNetoIngr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZscaPlanesDiarios.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:soap:functions:mc-style", "ZscaPlanesDiarios"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fePlanDiario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FePlanDiario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encargado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Encargado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrEncargado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DescrEncargado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propTercero");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PropTercero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sociedad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Sociedad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descCampo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DescCampo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descLote");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DescLote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maktxCodMatSem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MaktxCodMatSem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maktxProdCodSapCosech");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MaktxProdCodSapCosech"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maktxProdCodSapTerm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MaktxProdCodSapTerm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hectareasSembra");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HectareasSembra"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("haPlanifHoy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HaPlanifHoy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rindeEstimado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RindeEstimado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("varCamionesPlanificados");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VarCamionesPlanificados"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("camionesPed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CamionesPed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("camionesUrg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CamionesUrg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("varCamionesEnviados");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VarCamionesEnviados"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campana");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Campana"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contratistaCose");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ContratistaCose"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreContratistaCose");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NombreContratistaCose"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("centroCalidad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CentroCalidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name1Calidad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name1Calidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("centroDescarga");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CentroDescarga"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name1Descarga");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name1Descarga"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPlanDiario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IdPlanDiario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idAsignacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IdAsignacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idAsignPos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IdAsignPos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPlanificPos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IdPlanificPos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codCampoProp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CodCampoProp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codLoteProp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CodLoteProp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codCampoTerc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CodCampoTerc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codLoteTerc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CodLoteTerc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codMatSembrado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CodMatSembrado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prodCosechado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ProdCosechado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prodTerminado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ProdTerminado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("observaciones");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Observaciones"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creadoPor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CreadoPor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proveedor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Proveedor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objCumplido");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ObjCumplido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estPlanDiario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EstPlanDiario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("camionesIng");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CamionesIng"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreProveedor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NombreProveedor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kgBrutosIngr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "KgBrutosIngr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kgTarasIngr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "KgTarasIngr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kgNetosIngr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "KgNetosIngr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rindeBrutoIngr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RindeBrutoIngr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rindeNetoIngr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RindeNetoIngr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
