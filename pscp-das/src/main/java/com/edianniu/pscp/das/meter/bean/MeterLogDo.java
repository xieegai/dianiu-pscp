/**
 * @author yanlin.chen 
 * @email yanlin.chen@edianniu.com
 * @date 2018年1月23日 上午11:35:15 
 * @version V1.0
 */
package com.edianniu.pscp.das.meter.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * @author yanlin.chen 
 * @email yanlin.chen@edianniu.com
 * @date 2018年1月23日 上午11:35:15 
 * @version V1.0
 */
public class MeterLogDo implements Serializable{
	private static final long serialVersionUID = 1L;
	private Long companyId;//客户ID
	private String companyName;//客户名称
	private String meterId;//采集点ID/仪表ID
	private Integer meterType;//采集点类型1主线，2楼宇，3设备
	private Integer referRoom=1;//关联配电房(1 是，0否)
	private String subTermCode;//分项编码 B0101
	private int multilpe;//倍率
	private Long time;//时间
	private Date reportTime;//上报时间
	private Long score;
	
	//遥测数据
	private Double abcActivePower=0.00D;//三相总有功功率
	private Double aActivePower=0.00D;//A相有功功率
	private Double bActivePower=0.00D;//B相有功功率
	private Double cActivePower=0.00D;//C相有功功率
	private Double abcReactivePower=0.00D;//三相总无功功率
	private Double aReactivePower=0.00D;//A相无功功率
	private Double bReactivePower=0.00D;//B相无功功率
	private Double cReactivePower=0.00D;//C相无功功率
	private Double abcApparentPower=0.00D;//三相总视在功率
	private Double aApparentPower=0.00D;//A相视在功率
	private Double bApparentPower=0.00D;//B相视在功率
	private Double cApparentPower=0.00D;//C相视在功率
	
	private Double abcPowerFactor=0.00D;//三相总功率因数
	private Double aPowerFactor=0.00D;//A相功率因数
	private Double bPowerFactor=0.00D;//B相功率因数
	private Double cPowerFactor=0.00D;//C相功率因数
	
	private Double positiveActivePowerMaxDemand=0.00D;//正向有功最大需量
	private Double negativeActivePowerMaxDemand=0.00D;//反向有功最大需量
	private Double positiveReactivePowerMaxDemand=0.00D;//正向无功最大需量
	private Double negativeReactivePowerMaxDemand=0.00D;//反向无功最大需量
	
	private Double ua=0.00D;// A相电压
	private Double ub=0.00D;// B相电压
	private Double uc=0.00D;// C相电压
	private Integer uStatus;//0正常，1异常
	private Integer uaStatus;//0正常,1过高,-1偏低
	private Integer ubStatus;//0正常,1过高,-1偏低
	private Integer ucStatus;//0正常,1过高,-1偏低
	
	private Double ia=0.00D;// A相电流
	private Double ib=0.00D;// B相电流
	private Double ic=0.00D;// c相电流
	private Double iUnbalanceDegree;//三相电流不平衡度
	private Double iaUnbalanceDegree;//A相电流不平衡度
	private Double ibUnbalanceDegree;//B相电流不平衡度
	private Double icUnbalanceDegree;//C相电流不平衡度

	//电度数据
	private Double positiveTotalActivePowerCharge=0.00D;//正向总有功电度
	private Double positiveApexActivePowerCharge=0.00D;//正向尖有功电度
	private Double positivePeakPowerCharge=0.00D;//正向峰有功电度
	private Double positiveFlatPowerCharge=0.00D;//正向平有功电度
	private Double positiveValleyPowerCharge=0.00D;//正向谷有功电度
	private Double negativeTotalActivePowerCharge=0.00D;//反向总有功电度
	private Double negativeApexActivePowerCharge=0.00D;//反向尖有功电度
	private Double negativePeakPowerCharge=0.00D;//反向峰有功电度
	private Double negativeFlatPowerCharge=0.00D;//反向平有功电度
	private Double negativeValleyPowerCharge=0.00D;//反向谷有功电度
	private Double positiveTotalReactivePowerCharge=0.00D;//正向总无功电度
	private Double positiveApexReactivePowerCharge=0.00D;//正向尖无功电度
	private Double positivePeakReactivePowerCharge=0.00D;//正向峰无功电度
	private Double positiveFlatReactivePowerCharge=0.00D;//正向平无功电度
	private Double positiveValleyReactivePowerCharge=0.00D;//正向谷无功电度
	private Double negativeTotalReactivePowerCharge=0.00D;//反向总无功电度
	private Double negativeApexReactivePowerCharge=0.00D;//反向尖无功电度
	private Double negativePeakReactivePowerCharge=0.00D;//反向峰无功电度
	private Double negativeFlatReactivePowerCharge=0.00D;//反向平无功电度
	private Double negativeValleyReactivePowerCharge=0.00D;//反向谷无功电度

	public String getId() {
		return getCompanyId()+"#"+getMeterId()+"#"+getTime();
	}
	public int getMultilpe() {
		return multilpe;
	}

	public void setMultilpe(int multilpe) {
		this.multilpe = multilpe;
	}
	public Long getCompanyId() {
		return companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getMeterId() {
		return meterId;
	}

	public Integer getMeterType() {
		return meterType;
	}

	public String getSubTermCode() {
		return subTermCode;
	}

	public Long getTime() {
		return time;
	}

	public Double getAbcActivePower() {
		return abcActivePower;
	}

	public Double getaActivePower() {
		return aActivePower;
	}

	public Double getbActivePower() {
		return bActivePower;
	}

	public Double getcActivePower() {
		return cActivePower;
	}

	public Double getAbcReactivePower() {
		return abcReactivePower;
	}

	public Double getaReactivePower() {
		return aReactivePower;
	}

	public Double getbReactivePower() {
		return bReactivePower;
	}

	public Double getcReactivePower() {
		return cReactivePower;
	}

	public Double getAbcApparentPower() {
		return abcApparentPower;
	}

	public Double getaApparentPower() {
		return aApparentPower;
	}

	public Double getbApparentPower() {
		return bApparentPower;
	}

	public Double getcApparentPower() {
		return cApparentPower;
	}

	public Double getAbcPowerFactor() {
		return abcPowerFactor;
	}

	public Double getaPowerFactor() {
		return aPowerFactor;
	}

	public Double getbPowerFactor() {
		return bPowerFactor;
	}

	public Double getcPowerFactor() {
		return cPowerFactor;
	}

	public Double getPositiveActivePowerMaxDemand() {
		return positiveActivePowerMaxDemand;
	}

	public Double getNegativeActivePowerMaxDemand() {
		return negativeActivePowerMaxDemand;
	}

	public Double getPositiveReactivePowerMaxDemand() {
		return positiveReactivePowerMaxDemand;
	}

	public Double getNegativeReactivePowerMaxDemand() {
		return negativeReactivePowerMaxDemand;
	}

	public Double getUa() {
		return ua;
	}

	public Double getUb() {
		return ub;
	}

	public Double getUc() {
		return uc;
	}

	public Integer getuStatus() {
		return uStatus;
	}

	public Integer getUaStatus() {
		return uaStatus;
	}

	public Integer getUbStatus() {
		return ubStatus;
	}

	public Integer getUcStatus() {
		return ucStatus;
	}

	public Double getIa() {
		return ia;
	}

	public Double getIb() {
		return ib;
	}

	public Double getIc() {
		return ic;
	}

	public Double getiUnbalanceDegree() {
		return iUnbalanceDegree;
	}

	public Double getIaUnbalanceDegree() {
		return iaUnbalanceDegree;
	}

	public Double getIbUnbalanceDegree() {
		return ibUnbalanceDegree;
	}

	public Double getIcUnbalanceDegree() {
		return icUnbalanceDegree;
	}

	public Double getPositiveTotalActivePowerCharge() {
		return positiveTotalActivePowerCharge;
	}

	public Double getPositiveApexActivePowerCharge() {
		return positiveApexActivePowerCharge;
	}

	public Double getPositivePeakPowerCharge() {
		return positivePeakPowerCharge;
	}

	public Double getPositiveFlatPowerCharge() {
		return positiveFlatPowerCharge;
	}

	public Double getPositiveValleyPowerCharge() {
		return positiveValleyPowerCharge;
	}

	public Double getNegativeTotalActivePowerCharge() {
		return negativeTotalActivePowerCharge;
	}

	public Double getNegativeApexActivePowerCharge() {
		return negativeApexActivePowerCharge;
	}

	public Double getNegativePeakPowerCharge() {
		return negativePeakPowerCharge;
	}

	public Double getNegativeFlatPowerCharge() {
		return negativeFlatPowerCharge;
	}

	public Double getNegativeValleyPowerCharge() {
		return negativeValleyPowerCharge;
	}

	public Double getPositiveTotalReactivePowerCharge() {
		return positiveTotalReactivePowerCharge;
	}

	public Double getPositiveApexReactivePowerCharge() {
		return positiveApexReactivePowerCharge;
	}

	public Double getPositivePeakReactivePowerCharge() {
		return positivePeakReactivePowerCharge;
	}

	public Double getPositiveFlatReactivePowerCharge() {
		return positiveFlatReactivePowerCharge;
	}

	public Double getPositiveValleyReactivePowerCharge() {
		return positiveValleyReactivePowerCharge;
	}

	public Double getNegativeTotalReactivePowerCharge() {
		return negativeTotalReactivePowerCharge;
	}

	public Double getNegativeApexReactivePowerCharge() {
		return negativeApexReactivePowerCharge;
	}

	public Double getNegativePeakReactivePowerCharge() {
		return negativePeakReactivePowerCharge;
	}

	public Double getNegativeFlatReactivePowerCharge() {
		return negativeFlatReactivePowerCharge;
	}

	public Double getNegativeValleyReactivePowerCharge() {
		return negativeValleyReactivePowerCharge;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setMeterId(String meterId) {
		this.meterId = meterId;
	}

	public void setMeterType(Integer meterType) {
		this.meterType = meterType;
	}

	public void setSubTermCode(String subTermCode) {
		this.subTermCode = subTermCode;
	}

	public void setTime(Long time) {
		this.time = time;
	}

	public void setAbcActivePower(Double abcActivePower) {
		this.abcActivePower = abcActivePower;
	}

	public void setaActivePower(Double aActivePower) {
		this.aActivePower = aActivePower;
	}

	public void setbActivePower(Double bActivePower) {
		this.bActivePower = bActivePower;
	}

	public void setcActivePower(Double cActivePower) {
		this.cActivePower = cActivePower;
	}

	public void setAbcReactivePower(Double abcReactivePower) {
		this.abcReactivePower = abcReactivePower;
	}

	public void setaReactivePower(Double aReactivePower) {
		this.aReactivePower = aReactivePower;
	}

	public void setbReactivePower(Double bReactivePower) {
		this.bReactivePower = bReactivePower;
	}

	public void setcReactivePower(Double cReactivePower) {
		this.cReactivePower = cReactivePower;
	}

	public void setAbcApparentPower(Double abcApparentPower) {
		this.abcApparentPower = abcApparentPower;
	}

	public void setaApparentPower(Double aApparentPower) {
		this.aApparentPower = aApparentPower;
	}

	public void setbApparentPower(Double bApparentPower) {
		this.bApparentPower = bApparentPower;
	}

	public void setcApparentPower(Double cApparentPower) {
		this.cApparentPower = cApparentPower;
	}

	public void setAbcPowerFactor(Double abcPowerFactor) {
		this.abcPowerFactor = abcPowerFactor;
	}

	public void setaPowerFactor(Double aPowerFactor) {
		this.aPowerFactor = aPowerFactor;
	}

	public void setbPowerFactor(Double bPowerFactor) {
		this.bPowerFactor = bPowerFactor;
	}

	public void setcPowerFactor(Double cPowerFactor) {
		this.cPowerFactor = cPowerFactor;
	}

	public void setPositiveActivePowerMaxDemand(Double positiveActivePowerMaxDemand) {
		this.positiveActivePowerMaxDemand = positiveActivePowerMaxDemand;
	}

	public void setNegativeActivePowerMaxDemand(Double negativeActivePowerMaxDemand) {
		this.negativeActivePowerMaxDemand = negativeActivePowerMaxDemand;
	}

	public void setPositiveReactivePowerMaxDemand(
			Double positiveReactivePowerMaxDemand) {
		this.positiveReactivePowerMaxDemand = positiveReactivePowerMaxDemand;
	}

	public void setNegativeReactivePowerMaxDemand(
			Double negativeReactivePowerMaxDemand) {
		this.negativeReactivePowerMaxDemand = negativeReactivePowerMaxDemand;
	}

	public void setUa(Double ua) {
		this.ua = ua;
	}

	public void setUb(Double ub) {
		this.ub = ub;
	}

	public void setUc(Double uc) {
		this.uc = uc;
	}

	public void setuStatus(Integer uStatus) {
		this.uStatus = uStatus;
	}

	public void setUaStatus(Integer uaStatus) {
		this.uaStatus = uaStatus;
	}

	public void setUbStatus(Integer ubStatus) {
		this.ubStatus = ubStatus;
	}

	public void setUcStatus(Integer ucStatus) {
		this.ucStatus = ucStatus;
	}

	public void setIa(Double ia) {
		this.ia = ia;
	}

	public void setIb(Double ib) {
		this.ib = ib;
	}

	public void setIc(Double ic) {
		this.ic = ic;
	}

	public void setiUnbalanceDegree(Double iUnbalanceDegree) {
		this.iUnbalanceDegree = iUnbalanceDegree;
	}

	public void setIaUnbalanceDegree(Double iaUnbalanceDegree) {
		this.iaUnbalanceDegree = iaUnbalanceDegree;
	}

	public void setIbUnbalanceDegree(Double ibUnbalanceDegree) {
		this.ibUnbalanceDegree = ibUnbalanceDegree;
	}

	public void setIcUnbalanceDegree(Double icUnbalanceDegree) {
		this.icUnbalanceDegree = icUnbalanceDegree;
	}

	public void setPositiveTotalActivePowerCharge(
			Double positiveTotalActivePowerCharge) {
		this.positiveTotalActivePowerCharge = positiveTotalActivePowerCharge;
	}

	public void setPositiveApexActivePowerCharge(
			Double positiveApexActivePowerCharge) {
		this.positiveApexActivePowerCharge = positiveApexActivePowerCharge;
	}

	public void setPositivePeakPowerCharge(Double positivePeakPowerCharge) {
		this.positivePeakPowerCharge = positivePeakPowerCharge;
	}

	public void setPositiveFlatPowerCharge(Double positiveFlatPowerCharge) {
		this.positiveFlatPowerCharge = positiveFlatPowerCharge;
	}

	public void setPositiveValleyPowerCharge(Double positiveValleyPowerCharge) {
		this.positiveValleyPowerCharge = positiveValleyPowerCharge;
	}

	public void setNegativeTotalActivePowerCharge(
			Double negativeTotalActivePowerCharge) {
		this.negativeTotalActivePowerCharge = negativeTotalActivePowerCharge;
	}

	public void setNegativeApexActivePowerCharge(
			Double negativeApexActivePowerCharge) {
		this.negativeApexActivePowerCharge = negativeApexActivePowerCharge;
	}

	public void setNegativePeakPowerCharge(Double negativePeakPowerCharge) {
		this.negativePeakPowerCharge = negativePeakPowerCharge;
	}

	public void setNegativeFlatPowerCharge(Double negativeFlatPowerCharge) {
		this.negativeFlatPowerCharge = negativeFlatPowerCharge;
	}

	public void setNegativeValleyPowerCharge(Double negativeValleyPowerCharge) {
		this.negativeValleyPowerCharge = negativeValleyPowerCharge;
	}

	public void setPositiveTotalReactivePowerCharge(
			Double positiveTotalReactivePowerCharge) {
		this.positiveTotalReactivePowerCharge = positiveTotalReactivePowerCharge;
	}

	public void setPositiveApexReactivePowerCharge(
			Double positiveApexReactivePowerCharge) {
		this.positiveApexReactivePowerCharge = positiveApexReactivePowerCharge;
	}

	public void setPositivePeakReactivePowerCharge(
			Double positivePeakReactivePowerCharge) {
		this.positivePeakReactivePowerCharge = positivePeakReactivePowerCharge;
	}

	public void setPositiveFlatReactivePowerCharge(
			Double positiveFlatReactivePowerCharge) {
		this.positiveFlatReactivePowerCharge = positiveFlatReactivePowerCharge;
	}

	public void setPositiveValleyReactivePowerCharge(
			Double positiveValleyReactivePowerCharge) {
		this.positiveValleyReactivePowerCharge = positiveValleyReactivePowerCharge;
	}

	public void setNegativeTotalReactivePowerCharge(
			Double negativeTotalReactivePowerCharge) {
		this.negativeTotalReactivePowerCharge = negativeTotalReactivePowerCharge;
	}

	public void setNegativeApexReactivePowerCharge(
			Double negativeApexReactivePowerCharge) {
		this.negativeApexReactivePowerCharge = negativeApexReactivePowerCharge;
	}

	public void setNegativePeakReactivePowerCharge(
			Double negativePeakReactivePowerCharge) {
		this.negativePeakReactivePowerCharge = negativePeakReactivePowerCharge;
	}

	public void setNegativeFlatReactivePowerCharge(
			Double negativeFlatReactivePowerCharge) {
		this.negativeFlatReactivePowerCharge = negativeFlatReactivePowerCharge;
	}

	public void setNegativeValleyReactivePowerCharge(
			Double negativeValleyReactivePowerCharge) {
		this.negativeValleyReactivePowerCharge = negativeValleyReactivePowerCharge;
	}
	public Integer getReferRoom() {
		return referRoom;
	}
	public void setReferRoom(Integer referRoom) {
		this.referRoom = referRoom;
	}
	public Date getReportTime() {
		return reportTime;
	}
	public void setReportTime(Date reportTime) {
		this.reportTime = reportTime;
	}
	public Long getScore() {
		return score;
	}
	public void setScore(Long score) {
		this.score = score;
	}
}
