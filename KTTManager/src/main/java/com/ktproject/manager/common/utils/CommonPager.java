package com.ktproject.manager.common.utils;

public class CommonPager {
    //每一页的显示条数
	private  int  pageCount;
	//总的页数
	private  int  totalPageCount;
	//查询的总的数据数
	private  int  totalResult;
	//当前页
	private  int  currentPage;
	//从第几条获取数据
	private  int  currentResult;
	  
	public CommonPager() {
		this(1);
	}
	
	public CommonPager(final int currentPage) {
		this(currentPage,4);
	}
	
	public  CommonPager(final int currentPage , final  int pageCount){
		  this.currentPage = currentPage;
		  if(pageCount>0){
			 this.pageCount = pageCount;
		  }
		  //错误逻辑的处理
		  if(this.currentPage<1){
			  this.currentPage =1;
		  }
	}

	/**
	 * @return the pageCount
	 */
	public int getPageCount() {
		return pageCount;
	}

	/**
	 * @param pageCount the pageCount to set
	 */
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	/**
	 * @return the totalResult
	 */
	public int getTotalResult() {
		return totalResult;
	}

	/**
	 * @param totalResult the totalResult to set
	 */
	public void setTotalResult(int totalResult) {
		this.totalResult = totalResult;
	}

	/**
	 * @return the currentPage
	 */
	public int getCurrentPage() {
		return currentPage;
	}

	/**
	 * @param currentPage the currentPage to set
	 */
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	/**
	 * @return the currentResult
	 */
	public int getCurrentResult() {
		return (this.currentPage-1)*this.getPageCount();
	}

	/**
	 * @param currentResult the currentResult to set
	 */
	public void setCurrentResult(int currentResult) {
		this.currentResult = currentResult;
	}

	/**
	 * @return the totalPageCount
	 */
	public int getTotalPageCount() {
		if(this.getTotalResult()%this.getCurrentPage()==0){
		    this.totalPageCount = this.getTotalPageCount()/this.getCurrentPage();
		}else{
			this.totalPageCount = this.getTotalPageCount()/this.getCurrentPage()+1;
		}
		return totalPageCount;
	}

	/**
	 * @param totalPageCount the totalPageCount to set
	 */
	public void setTotalPageCount(int totalPageCount) {
		this.totalPageCount = totalPageCount;
	}
	
	
	
}
