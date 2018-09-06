package com.edianniu.pscp.mis.util;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

public class BizUtils {
	public static String TOKEN_COTAIN = "123456789";
	public static String CK_COTAIN = "123456789abcdefghijklmnopqrstuvwxyz";

	public static String createToken() {
		Random rd = new Random();
		rd.setSeed(new Date().getTime());
		char[] temp = new char[8];
		for (int i = 0; i < 8; i++) {
			temp[i] = TOKEN_COTAIN.charAt(rd.nextInt(TOKEN_COTAIN.length()));
		}
		return new String(temp);
	}

	public static String createCk() {
		Random rd = new Random();
		rd.setSeed(new Date().getTime());
		char[] temp = new char[4];
		for (int i = 0; i < 4; i++) {
			temp[i] = CK_COTAIN.charAt(rd.nextInt(CK_COTAIN.length()));
		}
		return new String(temp);
	}

	public static boolean checkEmail(String email) {
		if (StringUtils.isNoneBlank(new CharSequence[] { email })) {
			return match(email.trim(),
					"^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$");
		}
		return false;
	}
	/**
	 * 待优化
	 * 证件号码验证
	 * @param cardNo
	 * @return
	 */
	public static boolean checkIdCardNo(String idCardNo){
		if(IDCardUtils.isValidatedAllIdcard(idCardNo)){
			return true;
		}
		return false;
	}
	/**
	 * 证件号码加密
	 * @param cardNo
	 * @return
	 */
	public static String formatCardNo(String cardNo){
		//TODO
		if(cardNo.length()<=7){
			return cardNo;
		}
		String start=cardNo.substring(0, 3);
		String end=cardNo.substring(cardNo.length()-4, cardNo.length());
		StringBuffer sb=new StringBuffer(20);
		sb.append(start);
		for(int i=0;i<cardNo.length()-8;i++){
			sb.append("*");
		}
		sb.append(end);
		return sb.toString();
	}
	/**
	 * 手机号码校验
	 * @param mobile
	 * @return
	 */
	public static boolean checkMobile(String mobile) {
		if (StringUtils.isNoneBlank(mobile)) {
			return match(mobile.trim(),
					"^((170)|(177)|(13[0-9])|(15[^4,\\D])|(18[^1^4,\\D]))\\d{8}");
		}
		return false;
	}
	/**
	 * 电话号码校验
	 * @param phone
	 * @return
	 */
	public static boolean checkPhone(String phone){
		if (StringUtils.isNoneBlank(phone)) {
			return match(phone.trim(),
					"^0\\d{2,3}-?\\d{7,8}$");
		}
		return true;
	}

	/**
	 * 1)包含数字+字母+特殊字符
	 * ^[\\w\\D]{6,20}$
	 * 2)数字+字母，数字+特殊字符，字母+特殊字符，数字+字母+特殊字符组合，而且不能是纯数字，纯字母，纯特殊字符
	 * ^(?![\d]+$)(?![a-zA-Z]+$)(?![^\da-zA-Z]+$).{6,20}$
	 * 3)数字+字母
	 * ^[\\w]{6,20}$
	 * @param password
	 * @return
	 */
	public static boolean checkPassword(String password) {
		if (StringUtils.isNoneBlank(password)) {
			return match(password.trim(), "^[\\w\\D]{6,20}$");
		}
		return false;
	}

	/**
	 * 检查字符串长度
	 * 
	 * @param input
	 * @param maxLength
	 * @return
	 */
	public static boolean checkLength(String input, int maxLength) {
		if (StringUtils.isBlank(input)) {
			return false;
		}
		if (input.trim().length() <= maxLength) {
			return true;
		}
		return false;
	}

	/**
	 * 是否数字
	 * 
	 * @param input
	 * @return
	 */
	public static boolean isNumber(String input) {
		if (StringUtils.isBlank(input)) {
			return false;
		}
		return match(input.trim(), "^(-?\\d+)(\\.\\d+)?$");
	}
	public static boolean isPositiveNumber(String input) {
		if (StringUtils.isBlank(input)) {
			return false;
		}
		return match(input.trim(), "^(\\d+)(\\.\\d+)?$");
	}

	/**
	 * 是否浮点数
	 * 
	 * @param input
	 * @return
	 */
	public static boolean isFloat(String input) {
		if (StringUtils.isBlank(input)) {
			return false;
		}
		return match(input.trim(), "^(-?\\d+)(\\.\\d+)$");
	}

	/**
	 * 是否负浮点数
	 * 
	 * @param input
	 * @return
	 */
	public static boolean isNegativeFloat(String input) {
		if (StringUtils.isBlank(input)) {
			return false;
		}
		return match(input.trim(), "^(-\\d+)(\\.\\d+)$");
	}

	/**
	 * 是否正浮点数
	 * 
	 * @param input
	 * @return
	 */
	public static boolean isPositiveFloat(String input) {
		if (StringUtils.isBlank(input)) {
			return false;
		}
		return match(input.trim(), "^(\\d+)(\\.\\d+)$");
	}

	public static boolean match(String input, String regex) {
		Pattern pattern = Pattern.compile(regex);
		boolean tf = pattern.matcher(input).matches();
		return tf;
	}

	/**
	 * 距离转换
	 * 
	 * @param distance
	 * @return
	 */
	public static String getDistance(Double distance) {
		if (distance == null)
			distance = new Double(0);
		Double dis = distance / 1000;
		if (dis.intValue() == 0) {
			return String.valueOf(distance.intValue()) + "m";
		} else {
			return String.valueOf(dis.intValue()) + "km";
		}
	}

	public static String getOrderId(String prefix) {
		return prefix+System.nanoTime();
	}
	/**
	 * 对逗号分开的字符串进行排序
	 * @param orderIds
	 * @return
	 */
	public static String sortOrderIds(String orderIds){
		if(StringUtils.isBlank(orderIds)){
			return "";
		}
		String[] ids=StringUtils.split(orderIds,",");
		List<String> idList= new ArrayList<>();
		for(String id:ids){
			idList.add(id);
		}
		Collections.sort(idList);
		StringBuffer sb=new StringBuffer();
		for(String id:idList){
			sb.append(id).append(",");
		}
		return sb.substring(0, sb.length()-1);
	}
	/**
	 * 获取手机号尾号 4位
	 * 13666688420 显示8420
	 * @param mobile
	 * @return
	 */
	public static String getTailMobile(String mobile){
		if(checkMobile(mobile)){
			return mobile.substring(mobile.length()-4, mobile.length());
		}
		return "";
	}
	/**
	 * 格式化手机号13666688420 转变为13****8420 
	 * @param mobile
	 * @return
	 */
	public static String getFormatMobile(String mobile){
		if(checkMobile(mobile)){
			return mobile.substring(0, 2)+"*****"+mobile.substring(mobile.length()-4, mobile.length());
		}
		return "";
	}
	/**
	 * 毫秒转换为天 小时 分钟
	 * @param time
	 * @return
	 */
	public static String toDHM(long time){
		long day=time/(1000*24*60*60);
		long hour=(time-day*1000*24*60*60)/(1000*60*60);
		long minutes=(time-day*1000*24*60*60-hour*1000*60*60)/(1000*60);
		return day+"天"+hour+"小时"+(minutes<0?0:minutes)+"分钟";
	}
	public static String toHMS(long time){
		long hour=(time)/(1000*60*60);
		long minutes=(time-hour*1000*60*60)/(1000*60);
		long seconds=(time-hour*1000*60*60-minutes*1000*60)/1000;
		String h=String.valueOf(hour).length()<2?(0+String.valueOf(hour)):String.valueOf(hour);
		minutes=(minutes<0?0:minutes);
		String m=String.valueOf(minutes).length()<2?("0"+String.valueOf(minutes)):String.valueOf(minutes);
		seconds=(seconds<0?0:seconds);
		String s=String.valueOf(seconds).length()<2?("0"+String.valueOf(seconds)):String.valueOf(seconds);
		return h+":"+m+":"+s;
	}
	
	public static boolean isBankCardValid(String cardNo){
		String [] ary=new String[cardNo.length()];
		int length=cardNo.length();
		for(int i=0;i<length;i++){
			ary[i]=cardNo.substring(length - i - 1, length- i);			
		}
		int sum=0;
		for(int j=0;j<length;j++){
			int num=Integer.parseInt(ary[j]);
			//如果是奇数位
			if((j+1)%2==0){				
				num=num*2;
				if(num>9){
					num=num-9;					
				}					
			}
			sum+=num;			
		}
		
		boolean flag=false;
		if(sum%10==0){
			flag=true;
		}
		
		return flag;
		
	}
	/**
	 * 根据日期获取车型价格类型
	 * @return
	 */
	public static String getPriceType(){
		// TODO
		// 工作日 rent1
		// 周末 rent2
		// 元旦 rent3
		// 春节
		// 清明节
		// 劳动节
		// 端午节
		// 中秋节
		// 国庆节
		String priceType = "rent1";
		Calendar calendar = Calendar.getInstance(Locale.CHINA);
		calendar.setTime(new Date());
		// 星期一为一周的第一天 MON TUE WED THU FRI SAT SUN
		// DAY_OF_WEEK返回值 1 2 3 4 5 6 7
		int week = calendar.get(Calendar.DAY_OF_WEEK) - 1;
		if (week == 1 || week == 2 || week == 3 || week == 4) {
			priceType = "rent1";
		} else {
			priceType = "rent2";
		}
		return priceType;
	}
	
	public static boolean checkUrl(String url){
		if (StringUtils.isBlank(url)) {
			return false;
		}
		boolean flag=match(url.trim(),"http(s)?://([\\w-]+\\.)+[\\w-]+(/[\\w- ./?%&=]*)?");
		return flag;
		
	}
	public static void main(String[] args) {
		System.out.println("isPositiveNumber:" + isPositiveNumber("0.01"));
		System.out.println("isFloat:" + isFloat("1231232.123"));
		System.out.println("isFloat:" + isFloat("-1231232.123"));
		isBankCardValid("6212261202033317133");
		isBankCardValid("6228480322625138514");
		isBankCardValid("1234567890123456789");
		//System.out.println("mobile:" + checkMobile("17066688429"));
		/*
		System.out.println("password:" + checkPassword("-/\\//,,,,,,,,,,,,?111111"));
		System.out.println("password:" + checkPassword("eeeee中文a"));
		System.out.println("password:" + checkPassword("EEEEEE"));
		System.out.println("password:" + checkPassword("$fffff-_="));
		System.out.println("password:" + checkPassword("111111111111111111111"));

		System.out.println("isFloat:" + isFloat("1231232"));
		System.out.println("isFloat:" + isFloat("1231232.123"));
		System.out.println("isFloat:" + isFloat("-1231232.123"));
		System.out.println("isPositiveFloat:" + isPositiveFloat("1231232.123"));
		System.out
				.println("isPositiveFloat:" + isPositiveFloat("-1231232.123"));
		System.out.println("isNegativeFloat:" + isNegativeFloat("1231232.123"));
		System.out
				.println("isNegativeFloat:" + isNegativeFloat("-1231232.123"));
		
		System.out.println(""+getOrderId("M").length());*/
		//System.out.println(""+formatCardNo("1234612345675321"));
		/*String orderId=getOrderId("M");
		String newOrderId=orderId+"_"+WxPayUtil.getTimeStamp();
		System.out.println("orderId="+orderId+",len="+orderId.length());
		System.out.println("newOrderId="+newOrderId+",len="+newOrderId.length());*/
		/*
		String tailMobile=getTailMobile("13666688420");
		String formatMobile=getFormatMobile("13666688420");
		System.out.println("tailMobile="+tailMobile);
		System.out.println("formatMobile="+formatMobile);
		*/
		System.out.println(toHMS(63000L));
		System.out.println("是否电话号码="+checkPhone("87163495"));
	}

	/**
	 * 判断日期格式是否为yyyy-MM-dd
	 * 支持“2017-01-01”（不支持“2017-8-1”）
	 * 范围 1900年到2099年
	 */
	public static boolean checkYmd(String time){
		if (StringUtils.isNoneBlank(new CharSequence[] {time})) {
			time = time.trim();
			String tem = "^((((19|20)[0-9]{2})-(0[13578]|1[02])-(0[1-9]|[12][0-9]|3[0-1]))|"
					+  "(((19|20)[0-9]{2})-(0[469]|11)-(0[1-9]|[12][0-9]|30))|"
					+ "(((19|20)[0-9]{2})-02-(0[1-9]|1[0-9]|2[0-8]))|"
					+ "((((19|20)([13579][26]|[2468][048]|0[48]))|(2000))-02-(0[1-9]|[1-2][0-9])))$";
			if (match(time, tem)) {
				return true;
			}
		}
		return false;
	}
}

