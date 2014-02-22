package com.ktproject.manager.common.service;

import java.util.List;

import com.ktproject.manager.common.model.StockServiceBO;

public interface StockGetDataFromYaHooService {
	
	/**
     * 根据 股票编码、开始日期、结束日期 获取股票数据
     * @author 祁丛生
     * @param stockName  沪市：000000.ss 深市：000000.sz
     * @param fromDate    开始日期
     * @param toDate         结束日期
     * @return List<StockData>
     */
	List<StockServiceBO> getStockCsvData(String stockName, String fromDate,String toDate);
	
	
	 /**
     * 根据 股票编码、日期 获取股票数据
     * @author 张家将
     * @param stockName   沪市：000000.ss 深市：000000.sz
     * @param date 日期
     * @return StockServiceBO
     */
	StockServiceBO getStockCsvData(String stockName, String date);
	
	 /**
     * 根据 股票编码 获取当天股票数据
     * @author 张家将
     * @param stockName   沪市：000000.ss 深市：000000.sz
     * @return StockServiceBO
     */
	StockServiceBO getStockCsvData(String stockName);
}
